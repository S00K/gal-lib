package com.GaloreGaming.GaloreLib.GaloreMobs.Java;

import com.GaloreGaming.GaloreLib.GaloreMobs.API.GalMobAttributes;
import com.GaloreGaming.GaloreLib.GaloreMobs.API.Attributes.Attribute;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.attributes.CraftAttribute;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.NativeInterfaces;

import net.minecraft.server.v1_8_R3.AttributeInstance;
import net.minecraft.server.v1_8_R3.AttributeModifiable;
import net.minecraft.server.v1_8_R3.EntityInsentient;
import net.minecraft.server.v1_8_R3.IAttribute;

public final class CraftGalMobAttributes implements GalMobAttributes {
	private EntityInsentient nmsEntity;
	private CraftAttribute movementSpeed;
	private CraftAttribute attackDamage;
	private CraftAttribute maxHealth;
	private CraftAttribute knockbackResistance;
	private CraftAttribute followRange;
	private double maximumNavigationDistance = 200.0D;

	public CraftGalMobAttributes(CraftGalMob<?> mob) {
		this.nmsEntity = mob.nmsEntity;
		this.movementSpeed = this.getAttributeInstance(NativeInterfaces.GENERICATTRIBUTES.STATIC_FIELD_MOVEMENTSPEED.get());
		this.attackDamage = this.getAttributeInstance(NativeInterfaces.GENERICATTRIBUTES.STATIC_FIELD_ATTACKDAMAGE.get());
		this.maxHealth = this.getAttributeInstance(NativeInterfaces.GENERICATTRIBUTES.STATIC_FIELD_MAXHEALTH.get());
		this.knockbackResistance = this.getAttributeInstance(NativeInterfaces.GENERICATTRIBUTES.STATIC_FIELD_KNOCKBACKRESISTANCE.get());
		this.followRange = this.getAttributeInstance(NativeInterfaces.GENERICATTRIBUTES.STATIC_FIELD_FOLLOWRANGE.get());
	}
	
	private CraftAttribute getAttributeInstance(IAttribute attrib) {
		AttributeInstance attribInstance = this.nmsEntity.getAttributeInstance(attrib);
		if(attribInstance==null) return null;
		return new CraftAttribute((AttributeModifiable) attribInstance);
	}

	@Override
	public Attribute getMovementSpeedAttribute() {
		return this.movementSpeed;
	}

	@Override
	public Attribute getAttackDamageAttribute() {
		return this.attackDamage;
	}

	@Override
	public Attribute getMaxHealthAttribute() {
		return this.maxHealth;
	}

	@Override
	public Attribute getKnockbackResistanceAttribute() {
		return this.knockbackResistance;
	}

	@Override
	public boolean setMaximumNavigationDistance(double distance) throws IllegalArgumentException {
		if(distance!=0 && (distance<16 || distance>2048)) return false;
		this.maximumNavigationDistance = distance;
		if(distance!=0 && this.followRange.getBaseValue() > distance) {
			this.followRange.setBaseValue(distance);
		}
		return true;
	}

	@Override
	public double getMaximumNavigationDistance() {
		return this.maximumNavigationDistance;
	}
	
	public void adjustMaximumNavigationDistance(double forDistance) {
		if(this.maximumNavigationDistance==0 || this.maximumNavigationDistance>=forDistance) {
			this.followRange.setBaseValue(forDistance);
		}
	}
	
	void dispose(boolean reset) {
		this.attackDamage.dispose(reset);
		this.maxHealth.dispose(reset);
		this.followRange.dispose(reset);
		this.knockbackResistance.dispose(reset);
		this.movementSpeed.dispose(reset);
		this.attackDamage = null;
		this.maxHealth = null;
		this.followRange = null;
		this.knockbackResistance = null;
		this.movementSpeed = null;
		this.nmsEntity = null;
	}

	@Override
	public boolean canSwim() {
		return NativeInterfaces.NAVIGATION.FIELD_CANSWIM.get(this.nmsEntity.getNavigation());
	}

	@Override
	public boolean getAvoidWater() {
		return NativeInterfaces.NAVIGATION.FIELD_AVOIDWATER.get(this.nmsEntity.getNavigation());
	}

	@Override
	public void setAvoidWater(boolean avoid) {
		NativeInterfaces.NAVIGATION.FIELD_AVOIDWATER.set(this.nmsEntity.getNavigation(), avoid);
	}

	@Override
	public boolean getMoveThroughDoors() {
		return NativeInterfaces.NAVIGATION.FIELD_USEOPENDOOR.get(this.nmsEntity.getNavigation());
	}

	@Override
	public void setMoveThroughDoors(boolean moveThroughDoors) {
		NativeInterfaces.NAVIGATION.FIELD_USEOPENDOOR.set(this.nmsEntity.getNavigation(), moveThroughDoors);
	}

	@Override
	public boolean canMoveThroughClosedDoors() {
		return NativeInterfaces.NAVIGATION.FIELD_USECLOSEDDOOR.get(this.nmsEntity.getNavigation());
	}

}
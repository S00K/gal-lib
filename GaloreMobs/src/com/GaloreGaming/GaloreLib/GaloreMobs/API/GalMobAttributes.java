package com.GaloreGaming.GaloreLib.GaloreMobs.API;

import com.GaloreGaming.GaloreLib.GaloreMobs.API.Attributes.Attribute;

public interface GalMobAttributes {

	public Attribute getMovementSpeedAttribute();

	public Attribute getAttackDamageAttribute();

	public Attribute getMaxHealthAttribute();

	public Attribute getKnockbackResistanceAttribute();

	public boolean setMaximumNavigationDistance(double distance);
	
	public double getMaximumNavigationDistance();
	
	public boolean canSwim();

	public boolean getAvoidWater();

	public void setAvoidWater(boolean avoid);

	public boolean getMoveThroughDoors();

	public void setMoveThroughDoors(boolean moveThroughDoors);

	public boolean canMoveThroughClosedDoors();
	
}

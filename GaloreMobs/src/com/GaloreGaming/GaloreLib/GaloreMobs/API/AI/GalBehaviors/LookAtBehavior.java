package com.GaloreGaming.GaloreLib.GaloreMobs.API.AI.GalBehaviors;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;

import com.GaloreGaming.GaloreLib.GaloreMobs.API.AI.BehaviorType;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.CraftGalMob;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.GalMobHelper;

import net.minecraft.server.v1_8_R3.Entity;
import net.minecraft.server.v1_8_R3.EntityHuman;
import net.minecraft.server.v1_8_R3.PathfinderGoal;
import net.minecraft.server.v1_8_R3.PathfinderGoalLookAtPlayer;

public class LookAtBehavior extends GalBehavior<LivingEntity> {

	private final float maxDistance;
	private final Class<? extends Entity> entityClass;
	
	public LookAtBehavior()
	{
		
		this(0);
		
	}
	
	public LookAtBehavior(int priority)
	{
		
		this(priority, 8.0f);
		
	}
	
	public LookAtBehavior(float maxDistance)
	{
		
		this(0, maxDistance);
		
	}
	
	public LookAtBehavior(EntityType entityType)
	{
		
		this(0, entityType);
		
	}
	
	public LookAtBehavior(int priority, float maxDistance)
	{
		
		this(priority, maxDistance, EntityHuman.class);
		
	}
	
	public LookAtBehavior(int priority, EntityType entityType)
	{
		
		this(priority, 8.0f, entityType);
		
	}
	
	public LookAtBehavior(float maxDistance, EntityType entityType)
	{
		
		this(0, maxDistance, entityType);
		
	}
	
	public LookAtBehavior(int priority, float maxDistance, EntityType entityType)
	{
		
		this(priority, maxDistance, GalMobHelper.getNmsEntityClass(entityType));
		
	}
	
	public LookAtBehavior(int priority, float maxDistance, Class<? extends Entity> entityClass)
	{
		
		super(priority);
		this.maxDistance = maxDistance;
		this.entityClass = entityClass;
		
	}

	@Override
	public BehaviorType getType()
	{
		
		return BehaviorType.ACTION_LOOKATENTITY;
		
	}

	@Override
	public PathfinderGoal createPathfinderGoal(CraftGalMob<? extends LivingEntity> mob)
	{
		
		return new PathfinderGoalLookAtPlayer(mob.nmsEntity, this.entityClass, this.maxDistance);
		
	}

}

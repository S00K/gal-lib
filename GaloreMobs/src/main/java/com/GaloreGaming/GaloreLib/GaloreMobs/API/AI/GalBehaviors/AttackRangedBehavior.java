package com.GaloreGaming.GaloreLib.GaloreMobs.API.AI.GalBehaviors;

import org.bukkit.entity.Creature;

import com.GaloreGaming.GaloreLib.GaloreMobs.API.AI.BehaviorType;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.CraftGalMob;

import net.minecraft.server.v1_8_R3.IRangedEntity;
import net.minecraft.server.v1_8_R3.PathfinderGoal;
import net.minecraft.server.v1_8_R3.PathfinderGoalArrowAttack;

public class AttackRangedBehavior extends MovingBehavior<Creature> {

	private final int attackTicks;
	private final float maxRange;
	
	public AttackRangedBehavior()
	{
		
		this(0);
		
	}
	
	public AttackRangedBehavior(final int priority)
	{
		
		this(priority, 1.0);
		
	}
	
	public AttackRangedBehavior(final int priority, final double movementSpeedMultiplier)
	{
		
		this(priority, movementSpeedMultiplier, 16.0f);
		
	}
	
	public AttackRangedBehavior(final int priority, final double movementSpeedMultiplier, final float maxRange)
	{
		
		this(priority, movementSpeedMultiplier, maxRange, 60);
		
	}
	
	public AttackRangedBehavior(final int priority, final double movementSpeedMultiplier, final float maxRange, final int attackTicks)
	{
		
		super(priority, movementSpeedMultiplier);
		this.attackTicks = attackTicks;
		this.maxRange = maxRange;
		
	}
	
	@Override
	public PathfinderGoal createPathfinderGoal(CraftGalMob<? extends Creature> mob)
	{
		
		return new PathfinderGoalArrowAttack((IRangedEntity) mob.nmsEntity, this.movementSpeedMultiplier, this.attackTicks, this.maxRange);
		
	}
	
	@Override
	public BehaviorType getType()
	{
		
		return BehaviorType.ATTACK_ARROW;
		
	}
	
}

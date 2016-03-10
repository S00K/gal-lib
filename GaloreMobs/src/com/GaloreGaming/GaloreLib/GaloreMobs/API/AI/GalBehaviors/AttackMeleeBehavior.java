package com.GaloreGaming.GaloreLib.GaloreMobs.API.AI.GalBehaviors;

import org.bukkit.entity.Creature;

import com.GaloreGaming.GaloreLib.GaloreMobs.API.AI.BehaviorType;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.CraftGalMob;

import net.minecraft.server.v1_8_R3.EntityCreature;
import net.minecraft.server.v1_8_R3.PathfinderGoal;
import net.minecraft.server.v1_8_R3.PathfinderGoalMeleeAttack;

public class AttackMeleeBehavior extends MovingBehavior<Creature> {

	public AttackMeleeBehavior()
	{
		
		this(0);
		
	}
	
	public AttackMeleeBehavior(final int priority)
	{
		
		this(priority, 1.0);
		
	}
	
	public AttackMeleeBehavior(int priority, double movementSpeedMultiplier)
	{
		
		super(priority, movementSpeedMultiplier);
		
	}

	@Override
	public PathfinderGoal createPathfinderGoal(CraftGalMob<? extends Creature> mob)
	{
		
		return new PathfinderGoalMeleeAttack((EntityCreature) mob.nmsEntity, this.movementSpeedMultiplier, false);
		
	}
	
	@Override
	public BehaviorType getType()
	{
		
		return BehaviorType.ATTACK_MELEE;
		
	}
	
}

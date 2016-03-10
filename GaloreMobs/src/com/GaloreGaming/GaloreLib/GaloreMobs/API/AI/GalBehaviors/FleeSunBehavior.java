package com.GaloreGaming.GaloreLib.GaloreMobs.API.AI.GalBehaviors;

import org.bukkit.entity.Creature;

import com.GaloreGaming.GaloreLib.GaloreMobs.API.AI.BehaviorType;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.CraftGalMob;

import net.minecraft.server.v1_8_R3.EntityCreature;
import net.minecraft.server.v1_8_R3.PathfinderGoal;
import net.minecraft.server.v1_8_R3.PathfinderGoalFleeSun;

public class FleeSunBehavior extends MovingBehavior<Creature> {

	public FleeSunBehavior()
	{
		
		this(0);
		
	}
	
	public FleeSunBehavior(int priority)
	{
		
		this(0, 1.0);
		
	}
	
	protected FleeSunBehavior(int priority, double movementSpeedMultiplier)
	{
		
		super(priority, movementSpeedMultiplier);
		
	}

	@Override
	public BehaviorType getType()
	{
		
		return BehaviorType.MOVE_FLEESUN;
	}

	@Override
	public PathfinderGoal createPathfinderGoal(CraftGalMob<? extends Creature> mob)
	{
		
		return new PathfinderGoalFleeSun((EntityCreature) mob.nmsEntity, this.movementSpeedMultiplier);
	}

}

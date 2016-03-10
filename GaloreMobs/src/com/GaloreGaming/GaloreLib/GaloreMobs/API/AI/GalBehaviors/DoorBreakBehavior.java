package com.GaloreGaming.GaloreLib.GaloreMobs.API.AI.GalBehaviors;

import org.bukkit.entity.LivingEntity;

import com.GaloreGaming.GaloreLib.GaloreMobs.API.AI.BehaviorType;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.CraftGalMob;

import net.minecraft.server.v1_8_R3.PathfinderGoal;
import net.minecraft.server.v1_8_R3.PathfinderGoalBreakDoor;

public class DoorBreakBehavior extends GalBehavior<LivingEntity> {
	
	public DoorBreakBehavior()
	{
		
		this(0);
		
	}
	
	public DoorBreakBehavior(int priority)
	{
		
		super(priority);
		
	}
	
	@Override
	public PathfinderGoal createPathfinderGoal(CraftGalMob<? extends LivingEntity> mob)
	{
		
		return new PathfinderGoalBreakDoor(mob.nmsEntity);
		
	}
	
	@Override
	public BehaviorType getType()
	{
		
		return BehaviorType.ACTION_BREAKDOOR;
		
	}

}

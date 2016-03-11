package com.GaloreGaming.GaloreLib.GaloreMobs.API.AI.GalBehaviors;

import org.bukkit.entity.LivingEntity;

import com.GaloreGaming.GaloreLib.GaloreMobs.API.AI.BehaviorType;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.CraftGalMob;

import net.minecraft.server.v1_8_R3.PathfinderGoal;
import net.minecraft.server.v1_8_R3.PathfinderGoalOpenDoor;

public class DoorOpenBehavior extends GalBehavior<LivingEntity> {
	
	private final boolean closeDoor;
	
	public DoorOpenBehavior(int priority)
	{
		
		this(priority, false);
		
	}
	
	public DoorOpenBehavior(int priority, boolean closeDoor)
	{
		
		super(priority);
		this.closeDoor = closeDoor;
		
	}
	
	@Override
	public PathfinderGoal createPathfinderGoal(CraftGalMob<? extends LivingEntity> mob)
	{
		
		return new PathfinderGoalOpenDoor(mob.nmsEntity, this.closeDoor);
		
	}
	
	@Override
	public BehaviorType getType()
	{
		
		return BehaviorType.ACTION_OPENDOOR;
		
	}

}

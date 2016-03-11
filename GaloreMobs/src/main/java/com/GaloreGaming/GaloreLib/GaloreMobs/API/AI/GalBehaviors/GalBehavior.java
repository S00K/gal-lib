package com.GaloreGaming.GaloreLib.GaloreMobs.API.AI.GalBehaviors;

import org.bukkit.entity.LivingEntity;

import com.GaloreGaming.GaloreLib.GaloreMobs.API.AI.BehaviorType;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.CraftGalMob;

import net.minecraft.server.v1_8_R3.PathfinderGoal;

public abstract class GalBehavior<E extends LivingEntity> {
	
	private final int priority;
	
	public GalBehavior(int priority)
	{
		
		this.priority = priority;
		
	}
	
	public final int getPriority(int lastBehaviorPriority)
	{
		
		return this.priority <= 0 ? lastBehaviorPriority + 1 : this.priority;
		
	}
	
	public abstract BehaviorType getType();
	
	public abstract PathfinderGoal createPathfinderGoal(CraftGalMob<? extends E> mob);

}

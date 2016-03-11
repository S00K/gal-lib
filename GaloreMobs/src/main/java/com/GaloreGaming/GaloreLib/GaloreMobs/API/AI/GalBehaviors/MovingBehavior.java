package com.GaloreGaming.GaloreLib.GaloreMobs.API.AI.GalBehaviors;

import org.bukkit.entity.LivingEntity;

public abstract class MovingBehavior<E extends LivingEntity> extends GalBehavior<E> {

	protected final double movementSpeedMultiplier;
	
	protected MovingBehavior(int priority, double movementSpeedMultiplier)
	{
		super(priority);
		this.movementSpeedMultiplier = movementSpeedMultiplier;
		
	}

	
	
}

package com.GaloreGaming.GaloreLib.GaloreMobs.API.AI;

import org.bukkit.entity.LivingEntity;

import com.GaloreGaming.GaloreLib.GaloreMobs.API.GalMob;
import com.GaloreGaming.GaloreLib.GaloreMobs.API.AI.GalBehaviors.GalBehavior;

public interface AIPart<E extends LivingEntity, B extends GalBehavior<? super E>> {

	public GalMob<E> getGalMob();
	
	public void unattach();
	
	public void reattach() throws IllegalStateException;
	
	public boolean isCustomized();
	
	public B getBehavior();
	
	public BehaviorState getState();
	
	public BehaviorType getType();
	
}

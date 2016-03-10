package com.GaloreGaming.GaloreLib.GaloreMobs.API;

import org.bukkit.entity.LivingEntity;

public interface GalMob<E extends LivingEntity> {

	public E getEntity();
	
	public GalMobAttributes getAttributes();
	
	public GalMobAI<E> getAI();
	
	public GalMobActions getActions();
	
}

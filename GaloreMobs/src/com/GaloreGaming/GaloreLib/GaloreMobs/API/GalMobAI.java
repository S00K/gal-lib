package com.GaloreGaming.GaloreLib.GaloreMobs.API;

import org.bukkit.entity.LivingEntity;

import com.GaloreGaming.GaloreLib.GaloreMobs.API.AI.AIPart;
import com.GaloreGaming.GaloreLib.GaloreMobs.API.AI.BehaviorType;
import com.GaloreGaming.GaloreLib.GaloreMobs.API.AI.GalBehaviors.GalBehavior;

public interface GalMobAI<E extends LivingEntity> {

	public <B extends GalBehavior<? super E>> AIPart<E,B> addBehavior(B behavior) throws IllegalArgumentException;
	
	@SuppressWarnings("unchecked")
	public AIPart<E, ?>[] addBehaviors(GalBehavior<? super E>... behaviors) throws IllegalArgumentException;
	
	public void remove(BehaviorType... typesToRemove);
	
	public void removeExcept(BehaviorType... typesToKeep);
	
	public void clear();
	
	public void reset();
	
	public AIPart<E,?> getParts();
	
	public AIPart<E,?>[] getPartsOf(BehaviorType... types);
	
	public boolean hasBehavior(BehaviorType type);
	
	public boolean hasBehavior(BehaviorType... types) throws IllegalArgumentException;
	
}

package com.GaloreGaming.GaloreLib.GaloreMobs.Java;

import org.bukkit.entity.LivingEntity;

import com.GaloreGaming.GaloreLib.GaloreMobs.API.GalMobAI;
import com.GaloreGaming.GaloreLib.GaloreMobs.API.AI.AIPart;
import com.GaloreGaming.GaloreLib.GaloreMobs.API.AI.BehaviorType;
import com.GaloreGaming.GaloreLib.GaloreMobs.API.AI.GalBehaviors.GalBehavior;

public class CraftGalMobAI<E extends LivingEntity> implements GalMobAI<E> {

	@Override
	public <B extends GalBehavior<? super E>> AIPart<E, B> addBehavior(B behavior) throws IllegalArgumentException
	{
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AIPart<E, ?>[] addBehaviors(GalBehavior<? super E>... behaviors) throws IllegalArgumentException
	{
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(BehaviorType... typesToRemove)
	{
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeExcept(BehaviorType... typesToKeep)
	{
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear()
	{
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reset()
	{
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public AIPart<E, ?> getParts()
	{
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AIPart<E, ?>[] getPartsOf(BehaviorType... types)
	{
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasBehavior(BehaviorType type)
	{
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasBehavior(BehaviorType... types) throws IllegalArgumentException
	{
		
		// TODO Auto-generated method stub
		return false;
	}

}

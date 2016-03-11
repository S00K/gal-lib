package com.GaloreGaming.GaloreLib.GaloreMobs.Java;

import org.bukkit.entity.LivingEntity;

import com.GaloreGaming.GaloreLib.GaloreMobs.API.GalMob;
import com.GaloreGaming.GaloreLib.GaloreMobs.API.GalMobAI;
import com.GaloreGaming.GaloreLib.GaloreMobs.API.GalMobActions;
import com.GaloreGaming.GaloreLib.GaloreMobs.API.GalMobAttributes;

import net.minecraft.server.v1_8_R3.EntityInsentient;

public class CraftGalMob<E extends LivingEntity> implements GalMob<E> {

	private E entity;
	private CraftGalMobAttributes attributes;
	private CraftGalMobAI<E> ai;
	private CraftGalMobActions actions;
	
	public EntityInsentient nmsEntity;
	
	public CraftGalMob(E entity, EntityInsentient nmsEntity)
	{
		
		this.entity = entity;
		this.nmsEntity = nmsEntity;
		this.attributes = new CraftGalMobAttributes(this);
		this.actions = new CraftGalMobActions(this);
		this.ai = new CraftGalMobAI(this);
		
	}
	
	private void disposedCall() throws IllegalStateException
	{
		
		throw new IllegalStateException("[GalMobs] Unassigned mob");
		
	}
	
	private void unassign(boolean resetAttributes)
	{
		
		if(this.entity == null)
			this.disposedCall();
		this.actions.dispose();
		this.ai.dispose();
		this.attributes.dispose(resetAttributes);
		
		this.nmsEntity = null;
		this.entity = null;
		
	}
	
	/*public GalMobActionManager getActionManager()
	{
		
		return this.actions.actionManager;
		
	}*/
	
	/*public void adjustMaximumNavigationDistance(double forDistance)
	{
		
		this.attributes.adjustMaximumNavigationDistnce(forDistance);
		
	}*/
	
	
	@Override
	public E getEntity()
	{
		
		return entity;
		
	}

	@Override
	public GalMobAttributes getAttributes()
	{
		
		if(this.attributes == null)
			this.disposedCall();
		
		return this.attributes;
		
	}

	@Override
	public GalMobActions getActions()
	{
		
		if(this.actions == null)
			this.disposedCall();
		
		return this.actions;
		
	}

	@Override
	public GalMobAI<E> getAI()
	{
		
		if(this.ai == null)
			this.disposedCall();
		
		return this.ai;
		
	}
	
	public String toString()
	{
		
		if(this.entity == null)
			return "GalMob<[unassigned]>";
		
		return "GalMob<" + this.entity.toString() + ">";
		
	}

}

package com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server;

import java.util.Collections;
import java.util.List;

import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.System.NativeMethodPublic;

import net.minecraft.server.v1_8_R3.AxisAlignedBB;
import net.minecraft.server.v1_8_R3.Entity;
import net.minecraft.server.v1_8_R3.IEntitySelector;
import net.minecraft.server.v1_8_R3.World;

public class NmsWorld {

public final SearchEntities METHOD_SEARCHENTITIES = new SearchEntities();
	
	public class SearchEntities extends NativeMethodPublic
	{
		
		@SuppressWarnings("unchecked")
		public <E extends Entity> List<E> invoke(World world, Class<E> classLookingFor, AxisAlignedBB area, IEntitySelector entitySelector)
		{
			
			try
			{
				
				return world.a(classLookingFor, area, entitySelector);
				
			} catch(Throwable e)
			{
				
				this.handleException(e);
				return Collections.emptyList();
				
			}
			
		}
		
	}
	
}

package com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server;

import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.System.NativeMethodPublic;

import net.minecraft.server.v1_8_R3.Entity;
import net.minecraft.server.v1_8_R3.EntityTypes;

public final class NmsEntityTypes {

	public final GetEntityClassById METHOD_GETCLASSBYID = new GetEntityClassById();

	public final class GetEntityClassById extends NativeMethodPublic
	{
		
		public Class<? extends Entity> invoke(int entityTypeId)
		{
			
			try
			{
				
				return EntityTypes.a(entityTypeId);
			
			}
			catch(Throwable e)
			{
				
				this.handleException(e);
				return null;
			
			}
			
		}
		
	}
	
}

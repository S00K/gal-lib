package com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server;

import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.System.NativeMethodPublic;

import net.minecraft.server.v1_8_R3.Entity;

public final class NmsEntity {

	public final GetEntityDistanceSquared METHOD_GETDISTANCETOENTITYSQUARED = new GetEntityDistanceSquared();
	public final GetLocationDistance METHOD_GETDISTANCETOLOCATION = new GetLocationDistance();
	public final GetLocationDistanceSquared METHOD_GETDISTANCETOLOCATIONSQUARED = new GetLocationDistanceSquared();
	
	public final class GetEntityDistanceSquared extends NativeMethodPublic
	{
		
		public double invoke(final Entity entity, final Entity target)
		{
			
			try
			{
				
				// method returns difLocX� + difLocY� + difLocZ� for entity
				return entity.h(target);
				
			} catch(Throwable e)
			{
				
				this.handleException(e);
				return 0;
				
			}
			
		}
		
	}
	
	public class GetLocationDistance extends NativeMethodPublic
	{
		
		public double invoke(final Entity entity, final double x, final double y, final double z)
		{
			
			try
			{
				// method returns Math.sqrt( difLocX� + difLocY� + difLocZ� ) for double values
				return entity.f(x, y, z);
				
			} catch(Throwable e)
			{
				
				this.handleException(e);
				return 0;
				
			}
			
		}
		
	}
	
	public class GetLocationDistanceSquared extends NativeMethodPublic
	{
		
		public double invoke(final Entity entity, final double x, final double y, final double z)
		{
			
			try
			{
				
				// method returns difLocX� + difLocY� + difLocZ� for double values
				return entity.e(x, y, z);
				
			} catch(Throwable e)
			{
				
				this.handleException(e);
				return 0;
				
			}
			
		}
		
	}
	
}

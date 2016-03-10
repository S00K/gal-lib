package com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server;

import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Primitives.NativeFieldObject;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.System.NativeMethodPublic;

import net.minecraft.server.v1_8_R3.EntityInsentient;
import net.minecraft.server.v1_8_R3.PathfinderGoalSelector;

public final class NmsEntityInsentient {

	public final NativeFieldObject<EntityInsentient,PathfinderGoalSelector> FIELD_GOALSELECTOR = new NativeFieldObject<EntityInsentient,PathfinderGoalSelector>(EntityInsentient.class, "goalSelector");
	public final NativeFieldObject<EntityInsentient,PathfinderGoalSelector> FIELD_TARGETSELECTOR = new NativeFieldObject<EntityInsentient,PathfinderGoalSelector>(EntityInsentient.class, "targetSelector");
	public final GetVerticalHeadSpeed METHOD_GETVERTICALHEADSPEED = new GetVerticalHeadSpeed();
	
	public final class GetVerticalHeadSpeed extends NativeMethodPublic
	{
		
		public int invoke(EntityInsentient entity)
		{
			
			try
			{
				
				return entity.w();
				
			} catch(Throwable e)
			{
				
				this.handleException(e);
				return 80;
				
			}
			
		}
		
	}
	
}

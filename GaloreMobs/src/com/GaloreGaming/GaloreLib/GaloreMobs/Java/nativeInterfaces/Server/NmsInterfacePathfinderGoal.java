package com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server;

import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.System.NativeMethodPublic;

import net.minecraft.server.v1_8_R3.PathfinderGoal;

public final class NmsInterfacePathfinderGoal {

	public final OnEnd METHOD_ONEND = new OnEnd();
	
	public class OnEnd extends NativeMethodPublic
	{
		
		public void invoke(PathfinderGoal goal)
		{
			try {
				
				goal.d();
				
			} catch(Throwable e)
			{
				
				this.handleException(e);
				
			}
			
		}
		
	}
	
}

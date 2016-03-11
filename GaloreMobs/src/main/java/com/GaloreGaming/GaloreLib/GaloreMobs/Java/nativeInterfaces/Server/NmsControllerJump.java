package com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server;

import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.System.NativeMethodPublic;

import net.minecraft.server.v1_8_R3.ControllerJump;

public final class NmsControllerJump {

public final Jump METHOD_JUMP = new Jump();
	
	public class Jump extends NativeMethodPublic
	{
		
		public void invoke(final ControllerJump controller)
		{
			
			try
			{
				
				controller.a();
				
			} catch(Throwable e)
			{
				
				this.handleException(e);
			
			}
			
		}
		
	}
	
}

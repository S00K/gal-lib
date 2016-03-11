package com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server;

import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.System.NativeMethodPublic;

import net.minecraft.server.v1_8_R3.ControllerLook;

public final class NmsControllerLook {

	public final Look METHOD_LOOKATCOORDINATES = new Look();
	
	public class Look extends NativeMethodPublic
	{
		
		public void invoke(final ControllerLook controller, double x, double y, double z, float horizontalFaceSpeed, float verticalFaceSpeed) 
		{
			
			try
			{
				
				controller.a(x,y,z,horizontalFaceSpeed,verticalFaceSpeed);
				
			} catch(Throwable e)
			{
				
				this.handleException(e);
				
			}
			
		}
		
	}
	
}

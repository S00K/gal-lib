package com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server;

import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.System.NativeMethodPublic;

import net.minecraft.server.v1_8_R3.IAttribute;

public final class NmsIAttribute {

	public final GetName METHOD_GETNAME = new GetName();

	public final class GetName extends NativeMethodPublic
	{
		
		public String invoke(IAttribute attribute)
		{
			
			try
			{
				
				return attribute.getName();
				
			} catch(Throwable t)
			{
				
				this.handleException(t);
				return null;
				
			}
			
		}
		
	}
	
}

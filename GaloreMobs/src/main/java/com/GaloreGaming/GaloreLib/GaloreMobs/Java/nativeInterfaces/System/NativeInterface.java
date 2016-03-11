package com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.System;


public abstract class NativeInterface {

	protected void handleException(final Throwable t)
	{
		
		if(ServerReflectionException.shouldShow(this))
		{
			
			ServerReflectionException e;
			if(t instanceof Exception)
			{
				
				e = new ServerReflectionException("This version of GalMobs isn't compatible with this version of Spigot"
						+ "+++ " + this.getClass() + ": " + this.getParameters() + " +++",
						(Exception) t);
				e.printStackTrace();
				
			} else
			{
				
				e = new ServerReflectionException("This version of GalMobs isn't compatible with this version of Spigot"
						+ "+++ " + this.getClass() + ": " + this.getParameters() + " +++",
						(Exception) t);
				e.printStackTrace();
				t.printStackTrace();
				
			}
			
		} else
		{
			
			ServerReflectionException.skip();
			
		}
		
	}
	
	protected abstract String getParameters();
	
}

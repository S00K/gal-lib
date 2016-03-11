package com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.System;

import java.util.List;
import java.util.logging.Logger;
import java.util.ArrayList;

public class ServerReflectionException extends RuntimeException {
	
	
	private static final long serialVersionUID = -8896664894594042490L;
	private static final List<NativeInterface> thrown = new ArrayList<NativeInterface>();
	private static int skipped = 0;
	private static long lastSkippedMessageTime = 0;
	
	public static boolean shouldShow(NativeInterface nativeInterface)
	{
		
		if(thrown.contains(nativeInterface))
		{
			
			return false;
			
		} else
		{
			
			thrown.add(nativeInterface);
			return true;
			
		}
		
	}
	
	public static void skip()
	{
		
		final long currentTime = System.currentTimeMillis();
		skipped++;
		if(lastSkippedMessageTime == 0)
		{
			
			lastSkippedMessageTime = currentTime;
			
		} else if(currentTime > lastSkippedMessageTime + 2000)
		{
			
			Logger.getLogger("Minecraft").severe("GalMobs skipped " + skipped + " errors in the last " + (currentTime - lastSkippedMessageTime) / 1000
					+ " seconds. Stop the server and fix it.");
			
		}
		
	}
	
	public ServerReflectionException(final String message, final Exception ancestor)
	{
		
		super(message, ancestor);
		
	}
	
	public ServerReflectionException(final String message)
	{
		
		super(message);
		
	}

}

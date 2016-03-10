package com.GaloreGaming.GaloreLib.PluginSupport;

public enum SupportedPlugins {
	
	NOCHEATPLUS(false), WORLDEDIT(false), FACTIONS(false);
	
	private boolean active;
	
	SupportedPlugins(boolean active)
	{
		
		this.active = active;
		
	}
	
	public boolean getActive()
	{
		
		return active;
		
	}
	
	public void setActive(boolean active)
	{
		
		this.active = active;
		
	}
	
}

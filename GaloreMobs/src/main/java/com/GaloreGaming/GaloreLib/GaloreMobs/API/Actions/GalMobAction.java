package com.GaloreGaming.GaloreLib.GaloreMobs.API.Actions;


public interface GalMobAction {

	public void cancel();
	
	public ActionState getState();
	
	public ActionType getType();
	
}

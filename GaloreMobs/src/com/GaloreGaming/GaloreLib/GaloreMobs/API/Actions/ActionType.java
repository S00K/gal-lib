package com.GaloreGaming.GaloreLib.GaloreMobs.API.Actions;


public enum ActionType {

	LOOK(true, false),
	MOVE(false, false),
	MOVEATTACKING(false, false),
	TARGET(false, false),
	WAIT(false, false),
	DIE(false, false),
	JUMP(false, true),
	CALLBACK(false, false),
	FOLLOW(true, true),
	TELEPORT(false, false);
	
	public final boolean isBackgroundTask;
	public final boolean isMultiCycleTask;
	
	private ActionType(final boolean isBackgroundTask, final boolean isMultiCycleTask)
	{
		
		this.isBackgroundTask = isBackgroundTask;
		this.isMultiCycleTask = isMultiCycleTask;
		
	}
	
}

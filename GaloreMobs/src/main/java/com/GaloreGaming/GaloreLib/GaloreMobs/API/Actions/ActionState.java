package com.GaloreGaming.GaloreLib.GaloreMobs.API.Actions;


public enum ActionState {

	IN_QUEUE(false),
	PREPARING(true),
	IDLE(true),
	BLOCKED(true),
	RUNNING(true),
	FINISHED(true),
	CANCELLED(false);
	
	public final boolean isMutable;
	
	private ActionState(final boolean mutable)
	{
		
		this.isMutable = mutable;
		
	}
	
}

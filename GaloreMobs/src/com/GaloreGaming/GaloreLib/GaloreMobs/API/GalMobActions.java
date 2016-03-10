package com.GaloreGaming.GaloreLib.GaloreMobs.API;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;

import com.GaloreGaming.GaloreLib.GaloreMobs.API.Actions.ActionType;
import com.GaloreGaming.GaloreLib.GaloreMobs.API.Actions.GalMobAction;

public interface GalMobActions {

public GalMobAction moveTo(Location loc);
	
	public GalMobAction moveTo(Location loc, boolean queue);

	public GalMobAction moveTo(Location loc, boolean queue, double movementSpeedMultiplicator) throws IllegalArgumentException;

	public GalMobAction moveToAttacking(Location loc);

	public GalMobAction moveToAttacking(Location loc, boolean queue);

	public GalMobAction moveToAttacking(Location loc, boolean queue, double maximumDistractionDistance) throws IllegalArgumentException;
	
	public GalMobAction moveToAttacking(Location loc, boolean queue, double maximumDistractionDistance, double movementSpeedMultiplicator) throws IllegalArgumentException;
	
	public GalMobAction lookAt(Location loc);

	public GalMobAction lookAt(Entity entity) throws IllegalArgumentException;

	public GalMobAction lookAt(Location loc, boolean queue);

	public GalMobAction lookAt(Entity entity, boolean queue) throws IllegalArgumentException;

	public GalMobAction target(LivingEntity entity) throws IllegalArgumentException;

	public GalMobAction target(LivingEntity entity, boolean queue) throws IllegalArgumentException;
	
	public GalMobAction wait(int serverTicks);

	public GalMobAction wait(int serverTicks, boolean queue);

	public void die();

	public GalMobAction die(boolean queue);
	
	public GalMobAction jump();

	public GalMobAction jump(int times);

	public GalMobAction jump(boolean queue);

	public GalMobAction jump(int times, boolean queue);
	
	public GalMobAction follow(LivingEntity entity) throws IllegalArgumentException;

	public GalMobAction follow(LivingEntity entity, boolean queue) throws IllegalArgumentException;

	public GalMobAction follow(LivingEntity entity, boolean queue, float radius) throws IllegalArgumentException;

	public GalMobAction follow(LivingEntity entity, boolean queue, float outerRadius, float targetRadius) throws IllegalArgumentException;

	public GalMobAction callback(Runnable runnable);
	
	public boolean isActionRunning(ActionType type);
	
	public void clearActionQueue();

	public void clearActionsRunning();

	public void clearActions();
	
	public boolean getDefaultQueuingFlag();

	public void setDefaultQueuingFlag(boolean defaultQueue);
	
}

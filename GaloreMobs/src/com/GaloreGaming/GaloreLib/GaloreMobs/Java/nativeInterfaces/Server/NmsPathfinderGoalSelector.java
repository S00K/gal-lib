package com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server;

import org.bukkit.craftbukkit.v1_8_R3.util.UnsafeList;

import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Primitives.NativeFieldObject;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.System.NativeMethodPublic;

import net.minecraft.server.v1_8_R3.PathfinderGoal;
import net.minecraft.server.v1_8_R3.PathfinderGoalSelector;

public final class NmsPathfinderGoalSelector {
	
	public final NativeFieldObject<PathfinderGoalSelector, UnsafeList<Object>> FIELD_GOALITEMS = new NativeFieldObject<PathfinderGoalSelector, UnsafeList<Object>>(PathfinderGoalSelector.class, "b");
	public final NativeFieldObject<PathfinderGoalSelector, UnsafeList<Object>> FIELD_ACTIVEGOALITEMS = new NativeFieldObject<PathfinderGoalSelector, UnsafeList<Object>>(PathfinderGoalSelector.class, "c");
	public final AddPathfinderGoal METHOD_ADDPATHFINDERGOAL = new AddPathfinderGoal();
	
	public class AddPathfinderGoal extends NativeMethodPublic
	{
		
		public void invoke(PathfinderGoalSelector selector, int priority, PathfinderGoal goal)
		{
			
			try
			{
				
				selector.a(priority, goal);
				
			} catch(Throwable e)
			{
				
				this.handleException(e);
				
			}
			
		}
		
	}

}

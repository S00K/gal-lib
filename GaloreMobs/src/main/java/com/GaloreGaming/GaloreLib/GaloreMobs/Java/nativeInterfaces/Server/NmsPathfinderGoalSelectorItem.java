package com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server;

import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Primitives.NativeFieldInt;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Primitives.NativeFieldObject;

import net.minecraft.server.v1_8_R3.PathfinderGoal;

public final class NmsPathfinderGoalSelectorItem {

	public final NativeFieldObject<Object, PathfinderGoal> FIELD_GOAL = new NativeFieldObject<Object, PathfinderGoal>("a");
	public final NativeFieldInt<Object> FIELD_PRIORITY = new NativeFieldInt<Object>("b");
	
}

package com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces;

import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server.CBInterfaceJavaPluginLoader;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server.CBInterfacePluginClassLoader;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server.NmsAttributeModifiable;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server.NmsAttributeModifier;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server.NmsAttributeRanged;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server.NmsControllerJump;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server.NmsControllerLook;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server.NmsEntity;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server.NmsEntityInsentient;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server.NmsEntityTypes;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server.NmsGenericAttributes;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server.NmsIAttribute;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server.NmsInterfacePathfinderGoal;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server.NmsNavigation;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server.NmsPathfinderGoalSelector;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server.NmsPathfinderGoalSelectorItem;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server.NmsWorld;

public final class NativeInterfaces {
	
	public static final NmsControllerJump CONTROLLERJUMP = new NmsControllerJump();
	public static final NmsControllerLook CONTROLLERLOOK = new NmsControllerLook();
	public static final NmsEntity ENTITY = new NmsEntity();
	public static final CBInterfaceJavaPluginLoader JAVAPLUGINLOADER = new CBInterfaceJavaPluginLoader();
	public static final NmsNavigation NAVIGATION = new NmsNavigation();
	public static final NmsInterfacePathfinderGoal PATHFINDERGOAL = new NmsInterfacePathfinderGoal();
	public static final NmsPathfinderGoalSelector PATHFINDERGOALSELECTOR = new NmsPathfinderGoalSelector();
	public static final NmsPathfinderGoalSelectorItem PATHFINDERGOALSELECTORITEM = new NmsPathfinderGoalSelectorItem();
	public static final CBInterfacePluginClassLoader PLUGINCLASSLOADER = new CBInterfacePluginClassLoader();
	public static final NmsWorld WORLD = new NmsWorld();
	public static final NmsIAttribute IATTRIBUTE = new NmsIAttribute();
	public static final NmsAttributeRanged ATTRIBUTERANGED = new NmsAttributeRanged();
	public static final NmsAttributeModifiable ATTRIBUTEMODIFIABLE = new NmsAttributeModifiable();
	public static final NmsAttributeModifier ATTRIBUTEMODIFIER = new NmsAttributeModifier();
	public static final NmsGenericAttributes GENERICATTRIBUTES = new NmsGenericAttributes();
	public static final NmsEntityInsentient ENTITYINSENTIENT = new NmsEntityInsentient();
	public static final NmsEntityTypes ENTITYTYPES = new NmsEntityTypes();
	
	private NativeInterfaces() {
		throw new AssertionError();
	}
	
}

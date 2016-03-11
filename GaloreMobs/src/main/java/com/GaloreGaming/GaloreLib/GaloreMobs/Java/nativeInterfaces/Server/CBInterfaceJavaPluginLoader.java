package com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server;

import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPluginLoader;

import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Primitives.NativeFieldObject;

public final class CBInterfaceJavaPluginLoader {

	public NativeFieldObject<JavaPluginLoader, Server> FIELD_SERVER = new NativeFieldObject<JavaPluginLoader, Server>(JavaPluginLoader.class, "server");
	
}

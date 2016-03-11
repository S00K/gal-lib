package com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server;

import org.bukkit.plugin.PluginLoader;
import org.bukkit.plugin.java.JavaPluginLoader;

import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Primitives.NativeFieldObject;

public final class CBInterfacePluginClassLoader {

	public NativeFieldObject<PluginLoader,JavaPluginLoader> FIELD_LOADER = new NativeFieldObject<PluginLoader,JavaPluginLoader>(PluginLoader.class, "loader");

}

package com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server;

import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Primitives.NativeFieldDouble;

import net.minecraft.server.v1_8_R3.AttributeRanged;

public final class NmsAttributeRanged {

	public final NativeFieldDouble<AttributeRanged> FIELD_MINIMUM = new NativeFieldDouble<AttributeRanged>(AttributeRanged.class, "a");
	public final NativeFieldDouble<AttributeRanged> FIELD_MAXIMUM = new NativeFieldDouble<AttributeRanged>(AttributeRanged.class, "b");
	
}

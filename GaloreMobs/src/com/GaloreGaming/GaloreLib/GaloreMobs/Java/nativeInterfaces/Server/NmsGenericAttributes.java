package com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Server;

import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.Primitives.NativeStaticFieldObject;

import net.minecraft.server.v1_8_R3.GenericAttributes;
import net.minecraft.server.v1_8_R3.IAttribute;

public final class NmsGenericAttributes {

	public final NativeStaticFieldObject<GenericAttributes,IAttribute> STATIC_FIELD_MAXHEALTH = new NativeStaticFieldObject<GenericAttributes,IAttribute>(GenericAttributes.class,"a");
	public final NativeStaticFieldObject<GenericAttributes,IAttribute> STATIC_FIELD_FOLLOWRANGE = new NativeStaticFieldObject<GenericAttributes,IAttribute>(GenericAttributes.class,"b");
	public final NativeStaticFieldObject<GenericAttributes,IAttribute> STATIC_FIELD_KNOCKBACKRESISTANCE = new NativeStaticFieldObject<GenericAttributes,IAttribute>(GenericAttributes.class,"c");
	public final NativeStaticFieldObject<GenericAttributes,IAttribute> STATIC_FIELD_MOVEMENTSPEED = new NativeStaticFieldObject<GenericAttributes,IAttribute>(GenericAttributes.class,"d");
	public final NativeStaticFieldObject<GenericAttributes,IAttribute> STATIC_FIELD_ATTACKDAMAGE = new NativeStaticFieldObject<GenericAttributes,IAttribute>(GenericAttributes.class,"e");
	
}

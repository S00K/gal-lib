package com.GaloreGaming.GaloreLib.GaloreMobs.Java.attributes;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import com.GaloreGaming.GaloreLib.GaloreMobs.API.Attributes.Attribute;
import com.GaloreGaming.GaloreLib.GaloreMobs.API.Attributes.AttributeModifier;
import com.GaloreGaming.GaloreLib.GaloreMobs.API.Attributes.ModifyOperation;
import com.GaloreGaming.GaloreLib.GaloreMobs.Java.nativeInterfaces.NativeInterfaces;

import net.minecraft.server.v1_8_R3.AttributeModifiable;
import net.minecraft.server.v1_8_R3.AttributeRanged;

public final class CraftAttribute implements Attribute {

	private static final Set<CraftAttribute> attributes = new HashSet<CraftAttribute>();
	private static final Map<UUID,CraftAttributeModifier> modifierMap = new HashMap<UUID,CraftAttributeModifier>();
	private AttributeModifiable nativeAttribute;
	private AttributeRanged nativeAttributeTemplate;
	private final double defaultBasisValue;
	
	public static void registerCustomModifier(CraftAttributeModifier modifier) {
		modifierMap.put(modifier.getUniqueID(), modifier);
		for(CraftAttribute attribute: attributes) {
			if(attribute.hasModifierAttached(modifier)) {
				modifier.setAttributeAttached(attribute);
			}
		}
	}
	
	public CraftAttribute(AttributeModifiable nativeAttribute) {
		this.nativeAttribute = nativeAttribute;
		this.nativeAttributeTemplate = (AttributeRanged) NativeInterfaces.ATTRIBUTEMODIFIABLE.METHOD_GETATTRIBUTETEMPLATE.invoke(nativeAttribute);
		this.defaultBasisValue = this.getBaseValue();
		
		Collection<net.minecraft.server.v1_8_R3.AttributeModifier> nativeModifiers = NativeInterfaces.ATTRIBUTEMODIFIABLE.METHOD_GETMODIFIERS.invoke(nativeAttribute);
		for(net.minecraft.server.v1_8_R3.AttributeModifier nativeModifier: nativeModifiers) {
			UUID uuid = NativeInterfaces.ATTRIBUTEMODIFIER.METHOD_GETUUID.invoke(nativeModifier);
			CraftAttributeModifier modifier = modifierMap.get(uuid);
			if(modifier!=null) modifier.setAttributeAttached(this);
		}
		
		attributes.add(this);
	}

	@Override
	public double getValue() {
		return nativeAttribute.getValue();
	}
	
	private CraftAttributeModifier[] resolveNativeModifiers(Collection<net.minecraft.server.v1_8_R3.AttributeModifier> nativeModifiers) {
		CraftAttributeModifier[] result = new CraftAttributeModifier[nativeModifiers.size()];
		int i = 0;
		for(net.minecraft.server.v1_8_R3.AttributeModifier nativeModifier: nativeModifiers) {
			UUID uuid = NativeInterfaces.ATTRIBUTEMODIFIER.METHOD_GETUUID.invoke(nativeModifier);
			CraftAttributeModifier modifier = modifierMap.get(uuid);
			if(modifier==null) {
				modifier = new CraftAttributeModifier(uuid, nativeModifier);
				modifierMap.put(uuid, modifier);
			}
			result[i] = modifier;
			i++;
		}
		return result;
	}

	@Override
	public CraftAttributeModifier[] getAttachedModifiers() {
		return this.resolveNativeModifiers(NativeInterfaces.ATTRIBUTEMODIFIABLE.METHOD_GETMODIFIERS.invoke(nativeAttribute));
	}

	@Override
	public void unattachModifiers() {
		CraftAttributeModifier[] modifiers = this.getAttachedModifiers();
		for(CraftAttributeModifier modifier: modifiers) {
			NativeInterfaces.ATTRIBUTEMODIFIABLE.METHOD_REMOVEMODIFIER.invoke(nativeAttribute, modifier.getNativeModifier());
			modifier.setAttributeUnattached(this);
		}
	}

	@Override
	public double getBaseValue() {
		return NativeInterfaces.ATTRIBUTEMODIFIABLE.METHOD_GETBASISVALUE.invoke(this.nativeAttribute);
	}

	@Override
	public void setBaseValue(double value) {
		this.nativeAttribute.setValue(value);
	}

	@Override
	public double getMin() {
		return NativeInterfaces.ATTRIBUTERANGED.FIELD_MINIMUM.get(this.nativeAttributeTemplate);
	}

	@Override
	public double getMax() {
		return NativeInterfaces.ATTRIBUTERANGED.FIELD_MAXIMUM.get(this.nativeAttributeTemplate);
	}

	@Override
	public String getAttributeName() {
		return NativeInterfaces.IATTRIBUTE.METHOD_GETNAME.invoke(this.nativeAttributeTemplate);
	}

	@Override
	public boolean attachModifier(AttributeModifier modifier) {
		try {
			NativeInterfaces.ATTRIBUTEMODIFIABLE.METHOD_ADDMODIFIER.invoke(nativeAttribute, ((CraftAttributeModifier) modifier).getNativeModifier());
			return true;
		} catch(IllegalArgumentException e) {
			return false;
		}
	}

	@Override
	public void unattachModifier(AttributeModifier mod) {
		this.unattachModifierWithoutUpdate((CraftAttributeModifier) mod);
		((CraftAttributeModifier) mod).setAttributeUnattached(this);
	}
	
	void unattachModifierWithoutUpdate(CraftAttributeModifier modifier) {
		NativeInterfaces.ATTRIBUTEMODIFIABLE.METHOD_REMOVEMODIFIER.invoke(nativeAttribute, modifier.getNativeModifier());
	}

	@Override
	public AttributeModifier[] getAttachedModifiers(ModifyOperation operation) {
		return this.resolveNativeModifiers(NativeInterfaces.ATTRIBUTEMODIFIABLE.METHOD_GETMODIFIERSBYTYPE.invoke(this.nativeAttribute, operation.getIntType()));
	}

	@Override
	public double resetBaseValue() {
		this.setBaseValue(defaultBasisValue);
		return this.defaultBasisValue;
	}

	@Override
	public void unattachCustomModifiers() {
		CraftAttributeModifier[] modifiers = this.getAttachedModifiers();
		for(CraftAttributeModifier modifier: modifiers) {
			if(modifier.isCustomModifier()) this.unattachModifier(modifier);
		}
	}

	@Override
	public void unattachNativeModifiers() {
		CraftAttributeModifier[] modifiers = this.getAttachedModifiers();
		for(CraftAttributeModifier modifier: modifiers) {
			if(!modifier.isCustomModifier()) this.unattachModifier(modifier);
		}
	}

	@Override
	public void resetAttribute() {
		this.unattachCustomModifiers();
		this.resetBaseValue();		
	}
	
	public void dispose(boolean reset) {
		if(reset) this.resetAttribute();
		CraftAttributeModifier[] modifiers = this.getAttachedModifiers();
		for(CraftAttributeModifier modifier: modifiers) {
			modifier.setAttributeUnattached(this);
		}
		this.nativeAttribute = null;
		this.nativeAttributeTemplate = null;
		attributes.remove(this);
	}

	@Override
	public boolean hasModifierAttached(AttributeModifier modifier) {
		return NativeInterfaces.ATTRIBUTEMODIFIABLE.METHOD_GETMODIFIERBYUUID.invoke(nativeAttribute, modifier.getUniqueID()) != null;
	}
	
}

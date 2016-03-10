package com.GaloreGaming.GaloreLib.GaloreMobs.API.Attributes;


public interface Attribute {
	
	public String getAttributeName();
	
	public double getBaseValue();
	
	public void setBaseValue(double value);
	
	public double resetBaseValue();
	
	public double getValue();
	
	public double getMin();
	
	public double getMax();
	
	public boolean hasModifierAttached(AttributeModifier mod);
	
	public boolean attachModifier(AttributeModifier mod);
	
	public void unattachModifier(AttributeModifier mod);
	
	public AttributeModifier[] getAttachedModifiers();
	
	public AttributeModifier[] getAttachedModifiers(ModifyOperation operation);
	
	public void unattachModifiers();
	
	public void unattachCustomModifiers();
	
	public void unattachNativeModifiers();
	
	public void resetAttribute();

}

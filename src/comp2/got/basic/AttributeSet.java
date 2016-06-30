package comp2.got.basic;

import java.util.HashMap;

import comp2.got.enumerators.Attribute;

public class AttributeSet {
	private HashMap attributes;
	
	public AttributeSet() {
		attributes = new HashMap<Attribute, Integer>();
		
		for (Attribute att : Attribute.values()) {
			attributes.put(att, 0);
		}
	}
	
	public Integer getAttributeValue(Attribute att){
		return (Integer) this.attributes.get(att);
	}
	
	public void setAttributeValue(Attribute att, Integer value){
		this.attributes.put(att, value);
	}
}
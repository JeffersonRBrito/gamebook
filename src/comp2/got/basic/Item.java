package comp2.got.basic;

import comp2.got.enumerators.ItemType;

public class Item {
	
	private String name;
	private String description;
	private float dropRate = 0.2f; //default chance of droping of 20%
	private ItemType type;
	public AttributeSet affectedAttributes;
	
	public Item(String name, String description, ItemType type) {
		this.name = name;
		this.description = description;
		this.type = type;
		this.affectedAttributes = new AttributeSet();
	}
	
	public Item(String name, String description, ItemType type, AttributeSet affectedAttributes){
		this.name = name;
		this.description = description;
		this.type = type;
		this.affectedAttributes = affectedAttributes;
	}
	
	public void setDropRate(float rate){
		if (rate > 0f && rate < 1f)
			this.dropRate = rate;
	}
	
	public float getDropRate(){
		return this.dropRate;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public ItemType getItemType(){
		return this.type;
	}
}

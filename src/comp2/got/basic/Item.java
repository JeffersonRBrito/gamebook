package comp2.got.basic;

import comp2.got.enumerators.ItemType;

public class Item {
	
	private String name;
	private String description;
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

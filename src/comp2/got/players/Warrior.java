package comp2.got.players;

import java.util.ArrayList;

import comp2.got.basic.Item;
import comp2.got.basic.Player;
import comp2.got.enumerators.Attribute;
import comp2.got.enumerators.ItemType;

public class Warrior extends Player{

	public Warrior(int life, int attack) {
		super(life, attack);
		
		// Set basic main attributes
		this.attributeSet.setAttributeValue(Attribute.PhysicalAttack, 2);
		this.attributeSet.setAttributeValue(Attribute.PhysicalDefense, 3);
	}

	@Override
	protected void setInitialItemSet() {
		ArrayList<Item> items = new ArrayList<Item>();
		
		Item basicSword = new Item("Basic sword", "Used by starter warriors", ItemType.Sword);
		basicSword.affectedAttributes.setAttributeValue(Attribute.PhysicalAttack, 2);
		
		Item basicRing = new Item("Ring of the warrior", "Used by warriors who just left the warrior academy", ItemType.Acessory);
		basicRing.affectedAttributes.setAttributeValue(Attribute.PhysicalAttack, 1);
		basicRing.affectedAttributes.setAttributeValue(Attribute.PhysicalDefense, 1);
		
		items.add(basicSword);
		items.add(basicRing);
		
		for (Item item : items) {
			this.equipItem(item);
		}
	}
}

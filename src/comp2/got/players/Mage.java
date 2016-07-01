package comp2.got.players;

import java.util.ArrayList;

import comp2.got.basic.Item;
import comp2.got.basic.Player;
import comp2.got.enumerators.Attribute;
import comp2.got.enumerators.ItemType;

public class Mage extends Player {

	public Mage(int life, int attack) {
		super(life, attack);
		
		// Set basic main attributes
		this.attributeSet.setAttributeValue(Attribute.MagicAttack, 2);
		this.attributeSet.setAttributeValue(Attribute.MagicDefense, 4);
	}

	@Override
	protected void setInitialItemSet() {
		ArrayList<Item> items = new ArrayList<Item>();
		
		Item basicStaff = new Item("Basic staff", "Used by starter mages", ItemType.Staff);
		basicStaff.affectedAttributes.setAttributeValue(Attribute.MagicAttack, 2);
		basicStaff.affectedAttributes.setAttributeValue(Attribute.MagicDefense, 1);
		
		Item basicRing = new Item("Aprentice Ring", "Used by mages who just left the mage academy", ItemType.Acessory);
		basicRing.affectedAttributes.setAttributeValue(Attribute.MagicAttack, 1);
		basicRing.affectedAttributes.setAttributeValue(Attribute.MagicDefense, 1);
		
		items.add(basicStaff);
		items.add(basicRing);
		
		for (Item item : items) {
			this.equipItem(item);
		}
	}
	
	
}

package comp2.got.enemies;

import comp2.got.basic.Enemy;
import comp2.got.basic.Item;
import comp2.got.enumerators.Attribute;
import comp2.got.enumerators.ItemType;

public class WhiteWalker extends Enemy {

	public WhiteWalker(int life, int attack) {
		super(life, attack);
	}
	
	@Override
	protected void applyLoot() {
		Item staffOfTheAncient = new Item("Staff of the Ancient", "Staff created by the time of the old gods", ItemType.Staff);
		staffOfTheAncient.affectedAttributes.setAttributeValue(Attribute.MagicAttack, 15);
		staffOfTheAncient.affectedAttributes.setAttributeValue(Attribute.MagicDefense, 10);
		staffOfTheAncient.setDropRate(0.1f);
		
		Item valyrianRing = new Item("Valyrian Steel Ring", "Ring used by powerful kings", ItemType.Acessory);
		valyrianRing.affectedAttributes.setAttributeValue(Attribute.PhysicalDefense, 7);
		valyrianRing.affectedAttributes.setAttributeValue(Attribute.MagicDefense, 7);
		valyrianRing.setDropRate(0.15f);
		
		Item faithRing = new Item("Ring of the Faith", "Ring used by high priests", ItemType.Acessory);
		faithRing.affectedAttributes.setAttributeValue(Attribute.MagicDefense, 10);
		faithRing.affectedAttributes.setAttributeValue(Attribute.PhysicalDefense, 5);
		faithRing.setDropRate(0.25f);
		
		this.loot.add(staffOfTheAncient);
		this.loot.add(valyrianRing);
		this.loot.add(faithRing);
	}
}

package comp2.got.enemies;

import comp2.got.basic.Enemy;
import comp2.got.basic.Item;
import comp2.got.enumerators.Attribute;
import comp2.got.enumerators.ItemType;

public class King extends Enemy {

	public King(int life, int attack) {
		super(life, attack);
	}
	
	@Override
	protected void applyLoot() {
		
		Item valyrianSword = new Item("Valyrian Steel Sword", "Sword used by powerful kings", ItemType.Sword);
		valyrianSword.affectedAttributes.setAttributeValue(Attribute.PhysicalAttack, 10);
		valyrianSword.affectedAttributes.setAttributeValue(Attribute.PhysicalDefense, 7);
		valyrianSword.affectedAttributes.setAttributeValue(Attribute.MagicAttack, 8);
		valyrianSword.setDropRate(0.1f);
		
		Item valyrianShield = new Item("Valyrian Steel Shield", "Shield used by powerful kings", ItemType.Shield);
		valyrianShield.affectedAttributes.setAttributeValue(Attribute.PhysicalAttack, 5);
		valyrianShield.affectedAttributes.setAttributeValue(Attribute.MagicAttack, 5);
		valyrianShield.affectedAttributes.setAttributeValue(Attribute.PhysicalDefense, 15);
		valyrianShield.affectedAttributes.setAttributeValue(Attribute.MagicDefense, 15);
		valyrianShield.setDropRate(0.1f);
		
		Item valyrianRing = new Item("Valyrian Steel Ring", "Ring used by powerful kings", ItemType.Acessory);
		valyrianRing.affectedAttributes.setAttributeValue(Attribute.PhysicalDefense, 7);
		valyrianRing.affectedAttributes.setAttributeValue(Attribute.MagicDefense, 7);
		valyrianRing.setDropRate(0.15f);
		
		Item faithRing = new Item("Ring of the Faith", "Ring used by high priests", ItemType.Acessory);
		faithRing.affectedAttributes.setAttributeValue(Attribute.MagicDefense, 10);
		faithRing.affectedAttributes.setAttributeValue(Attribute.PhysicalDefense, 5);
		faithRing.setDropRate(0.25f);
		
		this.loot.add(valyrianSword);
		this.loot.add(valyrianShield);
		this.loot.add(valyrianRing);
		this.loot.add(faithRing);
	}
}

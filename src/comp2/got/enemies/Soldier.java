package comp2.got.enemies;

import comp2.got.basic.Enemy;
import comp2.got.basic.Item;
import comp2.got.enumerators.Attribute;
import comp2.got.enumerators.ItemType;

public class Soldier extends Enemy {

	public Soldier(int life, int attack) {
		super(life, attack);
	}
	
	@Override
	protected void applyLoot() {
		Item steelSword = new Item("Steel Sword", "Sword made of refined steel for common soldiers", ItemType.Sword);
		steelSword.affectedAttributes.setAttributeValue(Attribute.PhysicalAttack, 4);
		steelSword.setDropRate(0.5f);
		
		Item steelShield = new Item("Steel Shield", "Shield made of refined steel for common soldiers", ItemType.Shield);
		steelShield.affectedAttributes.setAttributeValue(Attribute.PhysicalDefense, 5);
		steelShield.setDropRate(0.5f);
		
		Item engagementRing = new Item("Engagement Ring", "Ring representing a memory of its partner", ItemType.Acessory);
		engagementRing.affectedAttributes.setAttributeValue(Attribute.PhysicalDefense, 3);
		engagementRing.affectedAttributes.setAttributeValue(Attribute.MagicDefense, 3);
		engagementRing.setDropRate(0.2f);
		
		this.loot.add(steelSword);
		this.loot.add(steelShield);
		this.loot.add(engagementRing);
	}
}

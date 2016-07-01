package comp2.got.enemies;

import comp2.got.basic.Enemy;
import comp2.got.basic.Item;
import comp2.got.enumerators.Attribute;
import comp2.got.enumerators.ItemType;

public class ReanimatedCorpse extends Enemy {

	public ReanimatedCorpse(int life, int attack) {
		super(life, attack);
	}
	
	@Override
	protected void applyLoot() {
		Item swordOfTheDead = new Item("Sword of the Dead", "Sword used by old knights and common soldiers whose life was taken and controled", ItemType.Sword);
		swordOfTheDead.affectedAttributes.setAttributeValue(Attribute.PhysicalAttack, 2);
		swordOfTheDead.affectedAttributes.setAttributeValue(Attribute.PhysicalDefense, 1);
		swordOfTheDead.setDropRate(0.5f);
		
		this.loot.add(swordOfTheDead);
	}
}

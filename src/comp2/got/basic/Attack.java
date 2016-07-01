package comp2.got.basic;

import comp2.got.enumerators.AttackType;

public class Attack {
	
	private String name;
	private AttackType type;
	private int damageAmount;
	private int modifiedDamageAmount = 0;
	
	public Attack(String name, AttackType type, int damage) {
		this.name = name;
		this.type = type;
		this.damageAmount = damage;
	}

	public String getName() {
		return name;
	}

	public AttackType getType() {
		return type;
	}

	public int getDamageAmount() {
		return damageAmount + modifiedDamageAmount;
	}
	
	public void setDamageModifier(int amount) {
		modifiedDamageAmount = amount;
	}
}

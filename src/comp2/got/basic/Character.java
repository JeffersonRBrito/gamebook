package comp2.got.basic;
import java.util.ArrayList;
import java.util.Collection;

import comp2.got.enumerators.AttackType;
import comp2.got.enumerators.Attribute;

/**
 * Created by filipebraida on 31/05/16.
 */
public class Character {

    public Character(int life, int attack) {
        this.life = life;
        this.attack = attack;
        this.attributeSet = new AttributeSet();
        
        this.attackMoves = new ArrayList<Attack>();
        this.addAttackMoves(new Attack("Basic attack", AttackType.Physical, 2));
    }

    public void battle(Character enemy) {
        this.takeDamage(enemy.getAttack());
        enemy.takeDamage(this.getAttack());
    }
    
    protected void addAttackMoves(Attack attack){
    	this.attackMoves.add(attack);
    }
    
    public boolean isAlive() {
        if(this.life > 0)
            return true;

        return false;
    }

    public void takeDamage(Attack attack) {
    	Attribute defenseAttribute = attack.getType() == AttackType.Physical
    			? Attribute.PhysicalDefense
				: Attribute.MagicDefense;
    	
    	int damageDefense = this.attributeSet.getAttributeValue(defenseAttribute);
    	int damageAmount = Math.max(0, attack.getDamageAmount() - damageDefense);
    	
        this.life -= damageAmount;
    }

    public Attack getAttack() {
    	int numberOfAttacks = attackMoves.size();
    	double triggerChance = 1d / numberOfAttacks;
    	Attack moveToUse = null;
    	
    	do {
    		double dice;
    		for (Attack attack : attackMoves) {
				dice = Math.random();
				if (dice <= triggerChance)
					moveToUse = attack;
			}
    	} while (moveToUse == null);
    	
		if (moveToUse.getType() == AttackType.Physical)
			moveToUse.setDamageModifier(this.attributeSet.getAttributeValue(Attribute.PhysicalAttack) + this.attack);
		else
			moveToUse.setDamageModifier(this.attributeSet.getAttributeValue(Attribute.MagicAttack) + this.attack);
    		
        return moveToUse;
    }

    private int life;
    private int attack; // basic attack
    protected AttributeSet attributeSet;
    protected Collection<Attack> attackMoves;
}

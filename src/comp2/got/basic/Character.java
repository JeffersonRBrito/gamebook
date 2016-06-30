package comp2.got.basic;
import java.util.HashMap;

import comp2.got.enumerators.Attribute;

/**
 * Created by filipebraida on 31/05/16.
 */
public class Character {

    public Character(int life, int attack) {
        this.life = life;
        this.attack = attack;
        this.attributeSet = new AttributeSet();
    }

    public void battle(Character enemy) {
        this.takeDamage(enemy.getAttack());
        enemy.takeDamage(this.getAttack());
    }

    public boolean isAlive() {
        if(this.life > 0)
            return true;

        return false;
    }

    public void takeDamage(int attack) {
        this.life -= attack;
    }

    public int getAttack() {
        return this.attack;
    }

    private int life;
    private int attack; // basic attack
    protected AttributeSet attributeSet;
}

package comp2.got.basic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by filipebraida on 31/05/16.
 */
public class Enemy extends Character {
	
	public Collection<Item> loot;
	
    public Enemy(int life, int attack) {
        super(life, attack);
        loot = new ArrayList<Item>();
        applyLoot();
    }
    
    protected void applyLoot(){
    	// Method used to fill the loot collection, please override on extension classes
    }
    
    public void addItemToLoot(Item item){
    	this.loot.add(item);
    }
    
    // Try getting an item from collection by rolling a dice
    public Item getLootReward(){
    	if (!this.isAlive() && loot.size() > 0){
    		double dice;
    		for (Item item : loot) {
				dice = Math.random();
				if (dice <= item.getDropRate())
					return item;
			}
    	}
    	
    	return null;
    }
}

package comp2.got.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import comp2.got.enumerators.ItemType;

/**
 * Created by filipebraida on 31/05/16.
 */
public abstract class Player extends Character {

	private HashMap maximumItemByType;
	protected Collection equipedItem;
	
    public Player(int life, int attack) {
        super(life, attack);
        
        // Load a hash containing the maximum for each given item type
        this.maximumItemByType = new HashMap<ItemType, Integer>();
        
        this.maximumItemByType.put(ItemType.Sword, 1);
        this.maximumItemByType.put(ItemType.Shield, 1);
        this.maximumItemByType.put(ItemType.Staff, 1);
        this.maximumItemByType.put(ItemType.Acessory, 3);
    }
    
    public boolean equipItem(Item item){
    	Integer availbleSlots = (Integer) maximumItemByType.get(item.getItemType());
    	if (availbleSlots > 0) {
    		this.equipedItem.add(item);
    		this.maximumItemByType.put(item.getItemType(), availbleSlots--);
    		return true;
    	}
    	
    	return false;
    }
    
    protected abstract void setInitialItemSet();
}

package comp2.got.basic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by filipebraida on 31/05/16.
 */
public class Enemy extends Character {
	
	public Collection loot;
	
    public Enemy(int life, int attack) {
        super(life, attack);
        loot = new ArrayList<Item>();
    }
}

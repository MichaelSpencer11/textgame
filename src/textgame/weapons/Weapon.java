package textgame.weapons;

import java.util.ArrayList;
import java.util.List;
import textgame.EquipableBy;
import textgame.elements.*;
import textgame.Item;
import textgame.SpecialEffect;

public class Weapon extends Item{
	protected String type;
	protected int battlePower;
	protected int hitRate;
	protected int level;
	protected int delay;

	protected String description;
	protected boolean canThrow;
	protected boolean canUseSwdtech;
	protected boolean canUseRunic;
	protected boolean canUse2Handed;
	protected Element element;
	protected SpecialEffect specialEffect;
	

	public int getBattlePower() {return battlePower;}
	public int getHitRate() {return hitRate;}
	public int getDelay(){return delay;}

	public Weapon(String name, int lvl, int dly, int batPow){
		this.setRarity();
		this.itemName = rarity + " " + name;
		this.type = "weapon";
		this.hitRate = 100;
		this.level = lvl;
		this.delay = dly;
		this.dropRate = 85;
		if(this.rarity.equalsIgnoreCase("ultra")){
			this.battlePower = (int)Math.ceil(batPow * 3);
		} else if(this.rarity.equalsIgnoreCase("legendary")){
			this.battlePower = (int)Math.ceil(batPow * 2);
		}else if(this.rarity.equalsIgnoreCase("rare")){
			this.battlePower = (int)Math.ceil(batPow * 1.8);
		}else if(this.rarity.equalsIgnoreCase("exceptional")){
			this.battlePower = (int)Math.ceil(batPow * 1.6);
		}else if(this.rarity.equalsIgnoreCase("fine")){
			this.battlePower = (int)Math.ceil(batPow * 1.4);
		}else if(this.rarity.equalsIgnoreCase("common")){
			this.battlePower = (int)Math.ceil(batPow * 1.2);
		}else if(this.rarity.equalsIgnoreCase("coarse")){
			this.battlePower = batPow ;
		}

		this.gpValue = battlePower * 20;
	}

	//simple copy constructor
	public Weapon(Weapon w){
		this.itemName = w.itemName;
		this.type = w.type;
		this.battlePower = w.battlePower;
		this.hitRate = w.hitRate;
		this.level = w.level;
		this.delay = w.delay;
		this.rarity = w.rarity;
		this.gpValue = w.gpValue;
	}

	public String getType(){return this.type;}
	
	
}

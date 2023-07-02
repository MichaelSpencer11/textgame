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

	public Weapon(String name, int lvl, String type){
		this.setRarity();
		this.itemName = rarity + " " + name;
		this.type = type;
		this.hitRate = 100;
		this.level = lvl;

		if(type.equalsIgnoreCase("dagger")){
			this.delay = 250;
			this.battlePower = (int) (((level + 2) * 5) * .6);
		} else if(type.equalsIgnoreCase("cesti")){
			this.delay = 400;
			this.battlePower = (int) (((level + 2) * 5) * 1);
		} else if(type.equalsIgnoreCase("axe")){
			this.delay = 500;
			this.battlePower = (int) (((level + 2) * 5) * 1);
		} else if(type.equalsIgnoreCase("staff")){
			this.delay = 300;
			this.battlePower = (int) (((level + 2) * 5) * .7);
		} else if(type.equalsIgnoreCase("rod")){
			this.delay = 300;
			this.battlePower = (int) (((level + 2) * 5) * .7);
		} else if(type.equalsIgnoreCase("sword")){
			this.delay = 425;
			this.battlePower = (int) (((level + 2) * 5) * .85);
		}

		this.dropRate = 85;
		if(this.rarity.equalsIgnoreCase("ultra")){
			this.battlePower = battlePower * 3;
		} else if(this.rarity.equalsIgnoreCase("legendary")){
			this.battlePower = battlePower * 2;
		}else if(this.rarity.equalsIgnoreCase("rare")){
			this.battlePower = (int)(battlePower * 1.8);
		}else if(this.rarity.equalsIgnoreCase("exceptional")){
			this.battlePower = (int)(battlePower * 1.6);
		}else if(this.rarity.equalsIgnoreCase("fine")){
			this.battlePower = (int)(battlePower * 1.4);
		}else if(this.rarity.equalsIgnoreCase("common")){
			this.battlePower = (int)(battlePower * 1.2);
		}else if(this.rarity.equalsIgnoreCase("coarse")){

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

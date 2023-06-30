package textgame;

import java.util.ArrayList;


import textgame.armors.Armor;
import textgame.battle.*;
import textgame.elements.Element;
import textgame.battle.Battle;
import textgame.items.Tincture;
import textgame.items.Tonic;
import textgame.weapons.Weapon;

public class Monster {
	protected String name;
	protected int level;
	protected int hp;
	protected int maxHp;
	protected int mp;
	protected int maxMp;
	protected int xp;
	protected int gp;
	protected int battlePower;
	protected int vigor;
	protected int vigor2 = vigor * 2;
	protected int hitRate;
	protected int delay;
	protected int magicPower;
	protected int speed;
	protected int stamina;
	protected int defense;
	protected int mdef;
	protected int evade;
	protected int MBlock;
	protected int blockValue = (255 - this.getMBlock() * 2) + 1;
	protected ArrayList<Item> stolenItems = new ArrayList<Item>();
	protected ArrayList<Item> drops = new ArrayList<Item>();
	protected Room currentRoom;
	protected Room roomIn;
	protected String description;
	protected int atbGauge = 0;
	protected Character target;
	protected boolean protect;
	protected boolean shell;
	protected Element absorbs;
	protected Element immune;
	protected Element resistant;
	protected Element weak;
	protected boolean berserked;
	protected int respawnTime;

	protected Room blocking;

	public String typeToString() {
		return this.getClass().toString().substring(15);
	}

	public void incrementATBGauge() {
		this.atbGauge += (96 * (speed + 20)) / 16;
    }

	public void startCounter(Battle battleContext){
			
			new BattleMenu(battleContext);
			
		
	}

	//monster that does not block another room
	public Monster(String name, int lvl, int delay, int respawnTime, Room room){
		int randomNess = Random.roll(1,100);
		this.name = name;
		this.level = lvl;
		setStartingMaxHp(level);
		setStartingVigor(level);
		setStartingBatPow(level);
		setStartingDefense(level);
		setStartingMdef(level);
		this.delay = delay;
		this.respawnTime = respawnTime;
		this.hitRate = 100;
		setStartingGp(level);
		setStartingXp(level);
		//drop
		if(randomNess >= 1 && randomNess <= 25){
			generatePotionDrops(this.level);
		} else if(randomNess >= 26 && randomNess <= 75){
			generateArmorDrops(this.level);
		} else {
			generateWeaponDrops(this.level);
		}
		this.currentRoom = room;
		currentRoom.getMonsters().add(this);
	}

	//monster blocking another room
	public Monster(String name, int lvl, int delay,int respawnTime, Room room, Room blocking){
		int randomNess = Random.roll(1,100);
		this.name = name;
		this.level = lvl;
		setStartingMaxHp(level);
		setStartingVigor(level);
		setStartingBatPow(level);
		setStartingDefense(level);
		setStartingMdef(level);
		this.delay = delay;
		this.respawnTime = respawnTime;
		this.hitRate = 100;
		setStartingGp(level);
		setStartingXp(level);
		//drop
		if(randomNess >= 1 && randomNess <= 25){
			generatePotionDrops(this.level);
		} else if(randomNess >= 26 && randomNess <= 75){
			generateArmorDrops(this.level);
		} else {
			generateWeaponDrops(this.level);
		}
		this.currentRoom = room;
		currentRoom.getMonsters().add(this);

		this.blocking = blocking;
	}

	public Monster(){}

	public void attack(Battle battleContext) {
		new MonsterAttack(battleContext);
	}

	public void applyDamage(int damage){
		this.hp = this.hp - damage;
	}

	public void applyHealing(int amount){
		hp = hp + amount;
		if(hp > maxHp ){
			hp = maxHp;
		}
	}

	public void generateArmorDrops(int level){
		String name;
		StringBuilder itemName = new StringBuilder();
		String type = "";
		int itemLevel = level;
		int randomWeight = Random.roll(1,3);
		int randomType = Random.roll(1,5);
		if(level >= 2 && level <= 9){
			if(randomWeight == 1){
				itemName.append("Cotton ");
			}else if(randomWeight == 2){
				itemName.append("Leather ");
			} else if(randomWeight == 3){
				itemName.append("Ceramic ");
			}
		}
		else if(level >= 10 && level <= 19){
			if(randomWeight == 1){
				itemName.append("Silk ");
			}else if(randomWeight == 2){
				itemName.append("Hard Leather ");
			} else if(randomWeight == 3){
				itemName.append("Iron ");
			}
		}
		else if(level >= 20 && level <= 29){
			if(randomWeight == 1){
				itemName.append("Polyester ");
			}else if(randomWeight == 2){
				itemName.append("Plasteel ");
			} else if(randomWeight == 3){
				itemName.append("Steel ");
			}
		}
		else if(level >= 30 && level <= 39){
			if(randomWeight == 1){
				itemName.append("Hide ");
			}else if(randomWeight == 2){
				itemName.append("Bone ");
			} else if(randomWeight == 3){
				itemName.append("Mithril ");
			}
		}
		else if(level >= 40 && level <= 49){
			if(randomWeight == 1){
				itemName.append("Plastic ");
			}else if(randomWeight == 2){
				itemName.append("Scale ");
			} else if(randomWeight == 3){
				itemName.append("Gold ");
			}
		}
		else if(level >= 50 && level <= 59){
			if(randomWeight == 1){
				itemName.append("Hardrope ");
			}else if(randomWeight == 2){
				itemName.append("Ring ");
			} else if(randomWeight == 3){
				itemName.append("Dragonscale ");
			}
		}
		else if(level >= 60 && level <= 69){
			if(randomWeight == 1){
				itemName.append("Birdbone ");
			}else if(randomWeight == 2){
				itemName.append("Plate ");
			} else if(randomWeight == 3){
				itemName.append("Darkstone ");
			}
		}
		else if(level >= 70 && level <= 79){
			if(randomWeight == 1){
				itemName.append("Cherrywood ");
			}else if(randomWeight == 2){
				itemName.append("Hardwood ");
			} else if(randomWeight == 3){
				itemName.append("Platinum ");
			}
		}
		else if(level >= 80 && level <= 89){
			if(randomWeight == 1){
				itemName.append("Polyweave ");
			}else if(randomWeight == 2){
				itemName.append("Aluminum ");
			} else if(randomWeight == 3){
				itemName.append("Ebony ");
			}
		}
		else if(level >= 90 && level <= 99){
			if(randomWeight == 1){
				itemName.append("Platweave ");
			}else if(randomWeight == 2){
				itemName.append("Glass ");
			} else if(randomWeight == 3){
				itemName.append("Titanium ");
			}
		}
		else if(level >= 100 && level <= 110){
			if(randomWeight == 1){
				itemName.append("Nanoweave ");
			}else if(randomWeight == 2){
				itemName.append("Nano ");
			} else if(randomWeight == 3){
				itemName.append("Diamond ");
			}
		}

		if(randomType == 1){
			itemName.append("Helm");
			type = "head";
		}else if(randomType == 2){
			itemName.append("Vest");
			type = "body";
		}else if(randomType == 3){
			itemName.append("Gloves");
			type = "hands";
		}else if(randomType == 4){
			itemName.append("Leggings");
			type = "legs";
		}else if(randomType == 5){
			itemName.append("Boots");
			type = "feet";
		}
		name = String.valueOf(itemName);

		Armor a = new Armor(name,itemLevel,type,randomWeight);
		this.drops.add(a);

	}

	public void generateWeaponDrops(int level){
		String name = "";
		int batPow = 0;
		int delay = 0;
		StringBuilder itemName = new StringBuilder();
		int randomType = Random.roll(1,6);
		if(level >= 2 && level <= 9){
			itemName.append("Ceramic ");
		} else if(level >= 10 && level <= 19){
			itemName.append("Iron ");
		} else if(level >= 20 && level <= 29){
			if(randomType >= 1 && randomType <= 3){
				itemName.append("Steel ");
			} else if(randomType >= 4 && randomType <= 5){
				itemName.append("Plasteel ");
			} else if(randomType == 6){
				itemName.append("Steel ");
			}
		} else if(level >= 30 && level <= 39){
			if(randomType >= 1 && randomType <= 3){
				itemName.append("Mithril ");
			}else if(randomType >= 4 && randomType <= 6){
				itemName.append("Bone ");
			}
		} else if(level >= 40 && level <= 49){
			itemName.append("Gold ");
		} else if(level >= 50 && level <= 59){
			itemName.append("Dragonscale ");
		} else if(level >= 60 && level <= 69){
			if(randomType >= 1 && randomType <= 3){
				itemName.append("Darkstone ");
			} else if(randomType >= 4 && randomType <= 6){
				itemName.append("Birdbone ");
			}
		} else if(level >= 70 && level <= 79){
			if(randomType == 1 || randomType == 3 || randomType == 6){
				itemName.append("Platinum ");
			} else if(randomType == 2 || randomType == 4 || randomType == 5){
				itemName.append("Cherrywood ");
			}
		} else if(level >= 80 && level <= 89){
			if((randomType >= 1 && randomType <= 3) || randomType == 6){
				itemName.append("Ebony ");
			} else if(randomType >= 4 && randomType <= 5){
				itemName.append("Aluminum ");
			}
		} else if(level >= 90 && level <= 99){
			if(randomType == 1 || randomType == 4 || randomType == 5){
				itemName.append("Glass ");
			} else {
				itemName.append("Titanium ");
			}
		} else if(level >= 100 && level <= 110){
			if(randomType == 1 || randomType == 4 || randomType == 5){
				itemName.append("Nano ");
			} else {
				itemName.append("Diamond ");
			}
		}
		if(randomType == 1){
			itemName.append("Dagger");
			delay = 250;
			batPow = (int)(Math.ceil((level + 2) / .2) * .6);
		} else if(randomType == 2){
			itemName.append("Cesti");
			delay = 400;
			batPow = (int)Math.ceil((level + 2) / .2);
		}else if(randomType == 3){
			itemName.append("Axe");
			delay = 500;
			batPow = (int)Math.ceil((level + 2) / .2);
		} else if(randomType == 4){
			itemName.append("Staff");
			delay = 300;
			batPow = (int)(Math.ceil((level + 2) / .2) * .7);
		}else if(randomType == 5){
			itemName.append("Rod");
			delay = 300;
			batPow = (int)(Math.ceil((level + 2) / .2) * .7);
		}else if(randomType == 6){
			itemName.append("Sword");
			delay = 425;
			batPow = (int)(Math.ceil((level + 2) / .2) * .85);
		}

		name = String.valueOf(itemName);
		Weapon w = new Weapon(name,level,delay,batPow);
		this.drops.add(w);
	}

	public void generatePotionDrops(int level){
		int randomType = Random.roll(1,2);
		String name = "";
		StringBuilder itemName = new StringBuilder();
		if(level >= 10 && level <= 19){
			itemName.append("Spiced ");
		}else if(level >= 20 && level <= 29){
			itemName.append("Hi");
		}else if(level >= 30 && level <= 39){
			itemName.append("Nex");
		}else if(level >= 40 && level <= 49){
			itemName.append("Survival ");
		}else if(level >= 50 && level <= 59){
			itemName.append("Medical ");
		}else if(level >= 60 && level <= 69){
			itemName.append("Hyper ");
		}else if(level >= 70 && level <= 79){
			itemName.append("Super ");
		}else if(level >= 80 && level <= 89){
			itemName.append("Mega ");
		}else if(level >= 90 && level <= 99){
			itemName.append("Giga ");
		}else if(level >= 100 && level <= 110){
			itemName.append("Nano ");
		}

		if(randomType == 1){
			itemName.append("Potion");
			name = String.valueOf(itemName);
			Tonic t = new Tonic(name,level);
			this.drops.add(t);
		} else{
			itemName.append("Ether");
			name = String.valueOf(itemName);
			Tincture t = new Tincture(name,level);
			this.drops.add(t);
		}



	}

	public String getName () {return name;}
	public int getLevel () {return level;}
	public int getHp () {return hp;}
	public int getMp () {return mp;}
	public int getXp () {return xp;}
	public int getGp () {return gp;}
	public int getBattlePower () {return battlePower;}
	public int getHitRate () {return hitRate;}
	public int getMagicPower () {return magicPower;}
	public int getSpeed () {return speed;}
	public int getStamina () {return stamina;}
	public int getDefense () {return defense;}
	public int getMagicDefense () {return mdef;}
	public int getEvade () {return evade;}
	public boolean getProtect(){return protect;}
	public boolean getShell(){return shell;}
	public int getMBlock () {return MBlock;}
	public int getBlockValue(){return blockValue;}
	public ArrayList<Item> getStolenItems () {return stolenItems;}
	public ArrayList<Item> getDrops () {return drops;}
	public String getDescription() {return description;}
	public boolean getBerserked() {return berserked;}
	public int getCritChance() {return Random.roll(1,32);}
	public int getVigor2() {return vigor2;}
	public Element getAbsorbs(){return absorbs;}
	public Element getImmune(){return immune;}
	public Element getResistant(){return resistant;}
	public Element getWeak(){return weak;}
	public Room getCurrentRoom(){return currentRoom;}
	public int getDelay(){return delay;}
	public int getRespawnTime(){return respawnTime;}

	public void respawn(){
		int randomNess = Random.roll(1,100);
		setStartingMaxHp(level);
		this.mp = maxMp;
		this.drops.clear();
		if(randomNess >= 1 && randomNess <= 25){
			generatePotionDrops(this.level);
		} else if(randomNess >= 26 && randomNess <= 75){
			generateArmorDrops(this.level);
		} else {
			generateWeaponDrops(this.level);
		}
	}



	public int getVigor() {
		return vigor;
	}
	public void setStartingMaxHp(int level){
		hp = (level + 1) * 10 /*battle length*/ * 3;
	}

	public void setStartingVigor(int level){
		vigor = 40 + level;
	}

	public void setStartingBatPow(int level){
		battlePower = (int)((level + 2) / .2);
	}

	public void setStartingDefense(int level){
		defense = (int)((level + 1) * 10);
	}

	public void setStartingMdef(int level){mdef = (int)((level + 1) * 20);}

	public void setStartingGp(int level){
		gp = (int) (((level + 1) * 10) + (Random.roll(1,10) * 10) );
	}

	public void setStartingXp(int level){
		xp = (int) ((level * level ) + Random.roll((int)level / 2,level * 2));
	}
}

package textgame.jobs;

import textgame.Random;

import java.util.ArrayList;

public class Warrior extends Job {

	protected ArrayList<Ability> abilities;
	protected Ability attack;
	protected Ability magic;
	protected Ability item;
	
    public Warrior() {
		this.level = 2;
		setMaxHp(level);
		setMaxExp(level);
		setMaxMp(level);
		setVigor(level);
		this.speed = 28;
		this.stamina = 33;
		this.magicPower = 25;
		this.defMod = 4;
		this.defense = 47;
		this.magicDefense = 30;
		this.mBlock = 1;
		this.evade = 6;

		this.abilities = new ArrayList<Ability>();
		this.attack = new Ability("a: Attack");
		this.magic = new Ability("m: Magic");
		this.item = new Ability("i: Item");
		this.abilities.add(attack);
		this.abilities.add(magic);
		this.abilities.add(item);
	}

	public void setMaxHp(int newLevel){
		maxHp = (int)Math.floor((.3 + (newLevel / 7.0)) * 100/*battle length*/ * 3 );
		hp = maxHp;
	}

	public void setMaxMp(int newLevel){
		maxMp = (int)Math.floor((.16 + (newLevel / 25.0)) * 100 );
		mp = maxMp;
	}

	public void setVigor(int newLevel)
	{
		vigor = 43 + newLevel;
	}

	public void setDefense(int level){
		defense = (((level + 1) * 10));
	}

	public void loadAbilities(){
		for (Ability a : abilities){
			System.out.println(a.getName());
		}
	}

	public void setIntelligence(int newLevel)
	{
		intelligence = 35 + newLevel;
	}
}

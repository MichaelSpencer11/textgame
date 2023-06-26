package textgame.jobs;

import java.util.ArrayList;

public class WhiteMage extends Job {

	protected ArrayList<Ability> abilities;
	protected Ability attack;
	protected Ability magic;
	protected Ability item;

    public WhiteMage() {
		this.level = 2;
		setMaxHp(level);
		setHp(getMaxHp());
		setMaxExp(level);
		setMaxMp(level);
		setMp(getMaxMp());
		setVigor(level);
		setIntelligence(level);
		this.defense = 36;
		this.magicDefense = 35;
		this.mBlock = 9;
		this.evade = 13;
		this.defMod = 2;
		this.abilities = new ArrayList<Ability>();
		this.attack = new Ability("a: Attack");
		this.magic = new Ability("m: Magic");
		this.item = new Ability("i: Item");
		this.abilities.add(attack);
		this.abilities.add(magic);
		this.abilities.add(item);
		
	}

	public void setMaxHp(int newLevel){
		maxHp = (int)Math.floor((.18 + (newLevel / 12.0)) * 100 );
		hp = maxHp;
	}

	public void setMaxMp(int newLevel){
		maxMp = (int)Math.floor((.2 + (newLevel / 15.0)) * 100 );
		mp = maxMp;
	}

	public void setVigor(int newLevel){
		vigor = 26 + newLevel;
	}
	public void setDefense(int level){
		defense = (((level + 1) * 10));
	}
	public void setIntelligence(int newLevel)
	{
		intelligence = 42 + newLevel;
	}

	public void loadAbilities(){
		for (Ability a : abilities){
			System.out.println(a.getName());
		}
	}
}

package textgame.jobs;

import textgame.battle.PlayerMagicCast;
import textgame.spells.Spell;

import java.util.ArrayList;

public class RedMage extends Job {

	protected ArrayList<Ability> abilities;
	protected ArrayList<Spell> spells;
	protected Ability attack;
	protected Ability magic;
	protected Ability item;

    public RedMage() {
		this.level = 2;
		setMaxHp(level);
		setHp(getMaxHp());
		setMaxExp(level);
		setMaxMp(level);
		setMp(getMaxMp());
		setVigor(level);
		setIntelligence(level);
		this.defMod = 3;
		this.defense = 39;
		this.magicDefense = 40;
		this.mBlock = 9;
		this.evade = 14;

		this.abilities = new ArrayList<>();
		this.attack = new Ability("a: Attack");
		this.magic = new Ability("m: Magic");
		this.item = new Ability("i: Item");
		this.abilities.add(attack);
		this.abilities.add(magic);
		this.abilities.add(item);
		this.spells = new ArrayList<>();

	}

	public void setMaxHp(int newLevel){
		maxHp = (int)Math.floor((.24 + (newLevel / 9.0)) * 100 );
		hp = maxHp;
	}

	public void setMaxMp(int newLevel){
		maxMp = (int)Math.floor((.2 + (newLevel / 16.0)) * 100 );
		mp = maxMp;
	}

	public void setVigor(int newLevel){
		vigor = 34 + newLevel;
	}
	public void setDefense(int level){
		defense = (((level + 1) * 10));
	}

	public void setIntelligence(int newLevel)
	{
		intelligence = 43 + newLevel;
	}

	public void loadAbilities(){
		for (Ability a : abilities){
			System.out.println(a.getName());
		}
	}
}

package textgame.jobs;

import java.io.Serializable;
import java.util.ArrayList;

import textgame.spells.Cure;
import textgame.spells.Spell;

public class WhiteMage extends Job implements Serializable {

	protected Spell cure = new Cure();

	protected ArrayList<Ability> abilities;
	protected ArrayList<Spell> spells;
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
		setInitialVigor();
		setInitialIntel();
		setInitialVitality();
		this.defense = 36;
		this.magicDefense = 35;
		this.mBlock = 9;
		this.evade = 13;
		this.defMod = 2;
		this.abilities = new ArrayList<Ability>();
		this.spells = new ArrayList<Spell>();
		this.attack = new Ability("a: Attack");
		this.magic = new Ability("m: Magic");
		this.item = new Ability("i: Item");
		this.abilities.add(attack);
		this.abilities.add(magic);
		this.abilities.add(item);
		this.spells.add(cure);
		
	}

	public void setMaxHp(int newLevel){
		maxHp = (int)Math.floor((.18 + (newLevel / 12.0)) * 100 /*battle length*/ * 3 );
		hp = maxHp;
	}

	public void setMaxMp(int newLevel){
		maxMp = (int)Math.floor((.2 + (newLevel / 15.0)) * 100 );
		mp = maxMp;
	}

	public void setInitialVigor(){
		vigor = 26;
	}
	public void setNextLevelVigor(int newLevel){vigor = vigor + newLevel;}
	public void setInitialIntel(){intelligence = 42;}
	public void setNextLevelIntel(int newLevel){intelligence = intelligence + newLevel;}
	public void setInitialVitality(){vitality = 30;}
	public void setNextLevelVitality(int newLevel){vitality = (((newLevel + 1) * 10));}

	public void loadAbilities(){
		for (Ability a : abilities){
			System.out.println(a.getName());
		}
	}

	@Override
	public ArrayList<Spell> getSpells(){return spells;}
	@Override
	public void setEnSpellIsActive(boolean enSpellIsActive) {this.enSpellIsActive = enSpellIsActive;}
	@Override
	public boolean enSpellIsActive() {return enSpellIsActive;}
}

package textgame.jobs;

import textgame.spells.*;

import java.io.Serializable;
import java.util.ArrayList;

public class BlackMage extends Job implements Serializable {

	protected Spell fire = new Fire();
	protected Spell ice = new Ice();
	protected Spell bolt = new Bolt();

	protected ArrayList<Ability> abilities;
	protected ArrayList<Spell> spells;
	protected Ability attack;
	protected Ability magic;
	protected Ability item;

    public BlackMage() {
		this.level = 2;
		setMaxHp(level);
		setHp(maxHp);
		setHp(getMaxHp());
		setMaxExp(level);
		setMaxMp(level);
		setMp(maxMp);
		setInitialVigor();
		setInitialIntel();
		setInitialVitality();
		this.magicDefense = 40;
		this.mBlock = 7;
		this.evade = 14;
		this.defMod = 2;
		//this.spells.add(new Fire());
		this.abilities = new ArrayList<>();
		this.attack = new Ability("a: Attack");
		this.magic = new Ability("m: Magic");
		this.item = new Ability("i: Item");
		this.abilities.add(attack);
		this.abilities.add(magic);
		this.abilities.add(item);
		this.spells = new ArrayList<>();
		this.spells.add(fire);

	}

	public void setMaxHp(int newLevel){
		maxHp = (int)Math.floor((.2 + (newLevel / 12.0)) * 100 /*battle length*/ * 3 );
		hp = maxHp;
	}

	public void setMaxMp(int newLevel){
		maxMp = (int)Math.floor((.2 + (newLevel / 14.0)) * 100 );
		mp = maxMp;
	}

	public void setInitialVigor(){
		vigor = 28 ;
	}
	public void setNextLevelVigor(int newLevel){vigor = vigor + newLevel;}

	public void setInitialIntel()
	{
		intelligence = 47;
	}
	public void setNextLevelIntel(int newLevel){intelligence = intelligence + newLevel;}
	public void setInitialVitality(){
		vitality = 30;
	}
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

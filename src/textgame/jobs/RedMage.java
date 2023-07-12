package textgame.jobs;

import textgame.battle.PlayerMagicCast;
import textgame.spells.Enfire;
import textgame.spells.Spell;

import java.io.Serializable;
import java.util.ArrayList;

public class RedMage extends Job implements Serializable {

	protected ArrayList<Ability> abilities;
	protected ArrayList<Spell> spells;
	protected Ability attack;
	protected Ability magic;
	protected Ability item;
	protected Spell enfire = new Enfire();

    public RedMage() {
		this.level = 2;
		setMaxHp(level);
		setHp(getMaxHp());
		setMaxExp(level);
		setMaxMp(level);
		setMp(getMaxMp());
		setInitialVigor();
		setInitialIntel();
		setInitialVitality();
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
		this.spells.add(enfire);

	}

	public void setMaxHp(int newLevel){
		maxHp = (int)Math.floor((.24 + (newLevel / 9.0)) * 100 /*battle length */ * 3 );
		hp = maxHp;
	}

	public void setMaxMp(int newLevel){
		maxMp = (int)Math.floor((.2 + (newLevel / 16.0)) * 100 );
		mp = maxMp;
	}

	public void setInitialVigor(){
		vigor = 34;
	}
	public void setNextLevelVigor(int newLevel){vigor = vigor + newLevel;}
	public void setInitialIntel(){intelligence = 43;}
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
	public int getBattlePower(){return battlePower;}
	@Override
	public void setEnSpellIsActive(boolean enSpellIsActive) {this.enSpellIsActive = enSpellIsActive;}
	@Override
	public boolean enSpellIsActive() {return enSpellIsActive;}
}

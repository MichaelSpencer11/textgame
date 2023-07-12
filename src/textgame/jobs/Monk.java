package textgame.jobs;

import java.io.Serializable;
import java.util.ArrayList;

public class Monk extends Job implements Serializable {

	protected ArrayList<Ability> abilities;
	protected Ability attack;
	protected Ability magic;
	protected Ability item;

    public Monk() {
		this.level = 2;
		setMaxHp(level);
		setHp(maxHp);
		setHp(getMaxHp());
		setMaxExp(level);
		setMaxMp(level);
		setMp(maxMp);
		setInitialVigor();
		setInitialVitality();
		setInitialIntel();
		this.vigor = 47;
		this.speed = 37;
		this.stamina = 39;
		this.magicPower = 28;
		this.battlePower = 26;
		//this.defense = 42;
		this.magicDefense = 21;
		this.mBlock = 4;
		this.evade = 12;
		this.defMod = 3;
		this.abilities = new ArrayList<>();
		this.attack = new Ability("a: Attack");
		this.magic = new Ability("m: Magic");
		this.item = new Ability("i: Item");
		this.abilities.add(attack);
		this.abilities.add(magic);
		this.abilities.add(item);
	}

	public void setMaxHp(int newLevel){
		maxHp = (int)Math.floor((.28 + (newLevel / 8.0)) * 100 * /*battle length */ 3 );
		hp = maxHp;
	}

	public void setMaxMp(int newLevel){
		maxMp = (int)Math.floor((.18 + (newLevel / 23.0)) * 100 );
		mp = maxMp;
	}

	public void setInitialVigor(){
		vigor = 47;
	}
	public void setInitialVitality(){vitality = 30;}
	public void setInitialIntel() {intelligence = 35;}
	public void setNextLevelVigor(int newLevel){vigor = vigor + newLevel;}
	public void setNextLevelIntel(int newLevel){intelligence = intelligence + newLevel;}
	public void setNextLevelVitality(int level){
		vitality = (((level + 1) * 10));
	}
	public void loadAbilities(){
		for (Ability a : abilities){
			System.out.println(a.getName());
		}
	}

	@Override
	public void setEnSpellIsActive(boolean enSpellIsActive) {this.enSpellIsActive = enSpellIsActive;}
	@Override
	public boolean enSpellIsActive() {return enSpellIsActive;}


	
}

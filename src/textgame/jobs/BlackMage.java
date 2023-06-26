package textgame.jobs;

import textgame.spells.*;
import java.util.ArrayList;

public class BlackMage extends Job {

	protected Spell fire = new Fire();
	protected Spell ice = new Ice();
	protected Spell bolt = new Bolt();

	protected ArrayList<Ability> abilities;
	protected ArrayList<Spell> spells;
	protected Ability attack;
	protected Ability magic;
	protected Ability item;

    public BlackMage() {
		this.level = 10;
		setMaxHp(level);
		setHp(maxHp);
		setMaxExp(level);
		setMaxMp(level);
		setMp(maxMp);
		setVigor(level);
		setIntelligence(level);
		setDefense(level);
		this.magicDefense = 40;
		this.mBlock = 7;
		this.evade = 14;
		this.defMod = 2;
		//this.spells.add(new Fire());
		this.abilities = new ArrayList<Ability>();
		this.attack = new Ability("a: Attack");
		this.magic = new Ability("m: Magic");
		this.item = new Ability("i: Item");
		this.abilities.add(attack);
		this.abilities.add(magic);
		this.abilities.add(item);
		this.spells = new ArrayList<>();
		this.spells.add(fire);
		this.spells.add(ice);
		this.spells.add(bolt);
	}

	public void setMaxHp(int newLevel){
		maxHp = (int)Math.floor((.2 + (newLevel / 12.0)) * 100 /*battle length*/ * 3 );
		hp = maxHp;
	}

	public void setMaxMp(int newLevel){
		maxMp = (int)Math.floor((.2 + (newLevel / 14.0)) * 100 );
		mp = maxMp;
	}

	public void setVigor(int newLevel){
		vigor = 28 + newLevel;
	}

	public void setIntelligence(int newLevel)
	{
		intelligence = 47 + newLevel;
	}
	@Override
	public void setDefense(int level){
		defense = (((level + 1) * 10));
	}

	public void loadAbilities(){
		for (Ability a : abilities){
			System.out.println(a.getName());
		}
	}

	@Override
	public ArrayList<Spell> getSpells(){return spells;}

	
}

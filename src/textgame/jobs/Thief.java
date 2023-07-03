package textgame.jobs;

import textgame.*;
import textgame.Character;
import textgame.jobs.Job;

import java.util.ArrayList;
import textgame.jobs.Ability;

public class Thief extends Job {

	protected ArrayList<Ability> abilities;
	protected Ability attack;
	protected Ability steal;
	protected Ability item;

	public Thief() {
		this.level = 2;
		setMaxExp(level);
		setMaxHp(level);
		setHp(getMaxHp());
		setMaxMp(level);
		setMp(getMaxMp());
		setVigor(level);
		this.speed = 40;
		this.stamina = 31;
		this.magicPower = 28;
		this.battlePower = 14;
		this.vitality = 38;
		this.defense = vitality;
		this.magicDefense = 23;
		this.mBlock = 2;
		this.evade = 15;
		this.defMod = 3;
		this.abilities = new ArrayList<Ability>();
		this.attack = new Ability("a: Attack");
		this.steal = new Ability("s: Steal");
		this.item = new Ability("i: Item");
		this.abilities.add(attack);
		this.abilities.add(steal);
		this.abilities.add(item);
	}
	
	public void steal(Monster monster, Character player) {
		int chance = Random.roll(1,100);
		if(monster.getStolenItems().isEmpty()){
			System.out.println("Nothing to steal!");
			return;
		} else if (chance >= 65){
			for(Item i : monster.getStolenItems()){
				System.out.println("Stole " + i.getItemName() + "!");
				player.getInventory().add(i);
				monster.getStolenItems().remove(i);
				break;
			}
		} else {
			System.out.println("Failed to steal!");
		}

	}

	public void setMaxHp(int newLevel){
		maxHp = (int)Math.floor((.2 + (newLevel / 10.0) ) * 100 /*battle length */ * 3);
		hp = maxHp;
	}

	public void setMaxMp(int newLevel){
		maxMp = (int)Math.floor((.17 + (newLevel / 22.0)) * 100 );
		mp = maxMp;
	}

	public void setVigor(int newLevel){
		this.vigor = 37 + newLevel;
	}
	public void setDefense(){}

	public void loadAbilities(){
		for (Ability a : abilities){
			System.out.println(a.getName());
		}
	}

	public void setIntelligence(int newLevel)
	{
		intelligence = 38 + newLevel;
	}

}

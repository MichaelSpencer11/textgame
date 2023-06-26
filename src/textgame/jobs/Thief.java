package textgame.jobs;

import java.util.Random;
import textgame.Item;
import textgame.jobs.Job;
import textgame.Monster;
import textgame.Player;
import java.util.ArrayList;
import textgame.jobs.Ability;

public class Thief extends Job {

	protected ArrayList<Ability> abilities;
	protected Ability attack;
	protected Ability magic;
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
		this.defense = 38;
		this.magicDefense = 23;
		this.mBlock = 2;
		this.evade = 15;
		this.defMod = 3;
		this.abilities = new ArrayList<Ability>();
		this.attack = new Ability("a: Attack");
		this.magic = new Ability("m: Magic");
		this.item = new Ability("i: Item");
		this.abilities.add(attack);
		this.abilities.add(magic);
		this.abilities.add(item);
	}
	
	public void steal(Monster monster, Player player) {
		Random r = new Random();
		int selected = r.nextInt(monster.getStolenItems().size());
		Item stolen = monster.getStolenItems().get(selected);
		monster.getStolenItems().remove(selected);
		player.getInventory().add(stolen);
		
	}

	public void setMaxHp(int newLevel){
		maxHp = (int)Math.floor((.2 + (newLevel / 10.0) ) * 100);
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

}

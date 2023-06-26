package textgame.jobs;

import textgame.Esper;
import textgame.Form;

import java.util.ArrayList;

public class Polymorph extends Job {

	protected ArrayList<Ability> abilities;
	protected Ability attack;
	protected Ability magic;
	protected Ability item;
	protected Form<Esper> form;
	protected boolean morphed;
	
	public Polymorph() {
		this.level = 1;
		this.hp = 31;
		this.mp = 42;
		this.vigor = 31;
		this.speed = 33;
		this.stamina = 28;
		this.magicPower = 42;
		this.battlePower = 12;
		this.defense = 42;
		this.magicDefense = 33;
		this.mBlock = 7;
		this.evade = 5;
		this.form = null;
		this.abilities = new ArrayList<Ability>();
		this.attack = new Ability("Attack");
		this.magic = new Ability("Magic");
		this.item = new Ability("Item");
		this.abilities.add(attack);
		this.abilities.add(magic);
		this.abilities.add(item);

		
	}
	
	public void morph(Form<Esper> newForm) {
		this.form = newForm;
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
		vigor = 31 + newLevel;
	}
	public void setDefense(){}

	public void loadAbilities(){
		for (Ability a : abilities){
			System.out.println(a.getName());
		}
	}
}

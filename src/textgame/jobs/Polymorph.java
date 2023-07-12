package textgame.jobs;

import textgame.Esper;
import textgame.Form;

import java.io.Serializable;
import java.util.ArrayList;

public class Polymorph extends Job implements Serializable {

	protected ArrayList<Ability> abilities;
	protected Ability attack;
	protected Ability magic;
	protected Ability item;
	protected Form<Esper> form;
	protected boolean morphed;
	
	public Polymorph() {
		this.level = 2;
		setMaxHp(level);
		setHp(getMaxHp());
		setMaxMp(level);
		setMp(getMaxMp());
		setInitialVigor();
		setInitialIntel();
		setInitialVitality();
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

	public void setInitialVigor(){
		vigor = 31;
	}
	public void setNextLevelVigor(int newLevel){vigor = vigor + newLevel;}
	public void setInitialIntel(){intelligence = 39;}
	public void setNextLevelIntel(int newLevel){intelligence = intelligence + newLevel;}
	public void setInitialVitality(){vitality = 30;}
	public void setNextLevelVitality(int newLevel){vitality = (((newLevel + 1) * 10));}

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

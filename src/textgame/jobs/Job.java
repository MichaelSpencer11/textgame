package textgame.jobs;

import java.io.Serializable;
import java.util.ArrayList;

import textgame.battle.PlayerMagicCast;
import textgame.spells.Spell;
import textgame.techniques.*;

public abstract class Job implements Serializable {


	public int level;
	protected int hp;
	protected int maxHp;
	protected int mp;
	protected int maxMp;
	protected int exp;
	protected int maxExp;
	protected int vigor;
	protected int intelligence;
	protected int vitality;
	protected int speed;
	protected int stamina;
	protected int magicPower;
	protected int battlePower;
	protected int defense;
	protected int magicDefense;
	protected int mBlock;
	protected int evade;
	protected int defMod;
	protected ArrayList<Spell> spells;
	protected boolean enSpellIsActive;


	public void addHp(int hp){
		this.hp += hp;
		if (this.hp > maxHp){
			this.hp = maxHp;
		}
	}

	public void addMp(int mp){
		this.mp += mp;
		if (this.mp > maxMp){
			this.mp = maxMp;
		}
	}

	public void addBp(int amount){
		this.setBattlePower(this.getBattlePower() + amount);
	}

	public void subtractBp(int amount){
		this.setBattlePower(this.getBattlePower() - amount);
	}


	public void applyDamage(int damage){
		this.hp = this.hp - damage;
	}

	public abstract void loadAbilities();

	public int getLevel(){return level;}
	public void setLevel(int newLevel){level = newLevel;}
	public int getHp(){return hp;}
	public int getMaxHp(){return maxHp;}
	public abstract void setMaxHp(int newLevel);
	public abstract void setMaxMp(int newLevel);
	public abstract void setInitialVigor();
	public abstract void setNextLevelVigor(int newLevel);
	public abstract void setInitialIntel();
	public abstract void setNextLevelIntel(int newLevel);
	public abstract void setInitialVitality();
	public abstract void setNextLevelVitality(int newLevel);
	public void setDefenseForLevelUp(int level){
		this.defense = (level + 1) * 10;
		//add armors' defense back in
		
	}
	public String typeToString(){
		return this.getClass().toString().substring(20);
	}
	public void setMaxExp(int newLevel){
		maxExp = (newLevel * newLevel) * 25;
	}
	public int getMp(){return mp;}
	public int getMaxMp(){return maxMp;}
	public int getExp(){return exp;}
	public int getMaxExp(){return maxExp;}
	public int getVigor(){return vigor;}
	public int getSpeed(){return speed;}
	public int getStamina(){return stamina;}
	public int getMagicPower(){return magicPower;}
	public int getBattlePower(){return battlePower;}
	public int getDefense(){return defense;}
	public int getMagicDefense(){return magicDefense;}
	public int getMBlock(){return mBlock;}
	public int getEvade(){return evade;}
	public int getIntelligence(){return intelligence;}
	public int getVitality(){return vitality;}
	public void setVitality(int vit){this.vitality = vit;}
	public ArrayList<Spell> getSpells(){return spells;}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getIntel() {return intelligence;}
	public void setIntelligence(int intelligence){

	};
	public void setDefense(int defense){this.defense = defense;}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public void setBattlePower(int battlePower) {this.battlePower = battlePower;}
	public void setEnSpellIsActive(boolean enSpellIsActive) {this.enSpellIsActive = enSpellIsActive;}
	public boolean enSpellIsActive() {return enSpellIsActive;}
}



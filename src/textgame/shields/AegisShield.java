package textgame.shields;

import textgame.Shield;

public class AegisShield extends Shield{
	
	public AegisShield() {
		this.defense = 46;
		this.magicDefense = 52;
		this.equipableBy.setWarrior(true);
		this.equipableBy.setRedMage(true);
		this.equipableBy.setWhiteMage(true);
		this.description = "Randomly evades magic attack";
		this.weakVs = null;
		this.halfDamage = null;
		this.noEffect = null;
		this.absorbs = null;
	}
}

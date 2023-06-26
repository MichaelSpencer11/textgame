package textgame.shields;

import textgame.Shield;

public class Buckler extends Shield {
	
	public Buckler() {
		this.defense = 16;
		this.magicDefense = 10;
		this.equipableBy.setAll(true);
		this.weakVs = null;
		this.halfDamage = null;
		this.noEffect = null;
		this.absorbs = null;
		// +10 Evade
		this.specialEffect = null;
	}
}

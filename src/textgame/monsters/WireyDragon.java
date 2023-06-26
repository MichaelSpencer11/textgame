package textgame.monsters;

import textgame.Monster;
import textgame.Room;

public class WireyDragon extends Monster {
	public WireyDragon(Room roomIn) {
		this.level = 26;
		this.hp = 2802;
		this.mp = 200;
		this.xp = 895;
		this.gp = 1300;
		this.battlePower = 35;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 31;
		this.stamina = 5;
		this.defense = 150;
		this.mdef = 115;
		this.evade = 0;
		this.MBlock = 0;
		roomIn.getMonsters().add(this);
		this.description = "A " + this.typeToString() + ". Its muscles are taut and it stands with grey scales.";
		
	}
}

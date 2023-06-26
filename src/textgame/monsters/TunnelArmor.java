package textgame.monsters;

import textgame.Monster;
import textgame.Room;

public class TunnelArmor extends Monster {
	public TunnelArmor(Room roomIn) {
		
		this.level = 16;
		this.hp = 1300;
		this.mp = 900;
		this.xp = 0;
		this.gp = 250;
		this.battlePower = 10;
		this.hitRate = 100;
		this.magicPower = 15;
		this.speed = 40;
		this.stamina = 2;
		this.defense = 29;
		this.mdef = 145;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for TunnelArmor

	}
}

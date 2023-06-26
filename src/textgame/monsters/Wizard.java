package textgame.monsters;

import textgame.Monster;
import textgame.Room;

public class Wizard extends Monster {
    public Wizard(Room roomIn) {
        this.level = 32;
		this.hp = 1677;
		this.mp = 200;
		this.xp = 587;
		this.gp = 388;
		this.battlePower = 13;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 33;
		this.stamina = 3;
		this.defense = 50;
		this.mdef = 160;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for TunnelArmor

    }
}

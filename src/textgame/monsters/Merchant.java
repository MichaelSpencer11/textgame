package textgame.monsters;

import textgame.Monster;
import textgame.Room;

public class Merchant extends Monster {
    public Merchant(Room roomIn) {

        this.level = 5;
		this.hp = 119;
		this.mp = 20;
		this.xp = 26;
		this.gp = 60;
		this.battlePower = 10;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 30;
		this.stamina = 0;
		this.defense = 50;
		this.mdef = 150;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster


    }
}

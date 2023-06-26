package textgame.monsters;

import textgame.Monster;
import textgame.Room;

public class Chupon extends Monster {
    public Chupon(Room roomIn) {

        this.level = 26;
		this.hp = 10000;
		this.mp = 40000;
		this.xp = 0;
		this.gp = 0;
		this.battlePower = 13;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 10;
		this.stamina = 19;
		this.defense = 100;
		this.mdef = 55;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster


    }
}

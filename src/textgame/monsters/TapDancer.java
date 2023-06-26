package textgame.monsters;

import textgame.Monster;
import textgame.Room;

public class TapDancer extends Monster {
    public TapDancer(Room roomIn) {

        this.level = 43;
		this.hp = 4452;
		this.mp = 270;
		this.xp = 1727;
		this.gp = 526;
		this.battlePower = 13;
		this.hitRate = 100;
		this.magicPower = 11;
		this.speed = 39;
		this.stamina = 8;
		this.defense = 105;
		this.mdef = 150;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster


    }
}

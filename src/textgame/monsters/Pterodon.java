package textgame.monsters;

import textgame.Monster;
import textgame.Room;

public class Pterodon extends Monster {
    public Pterodon(Room roomIn) {

        this.level = 12;
		this.hp = 380;
		this.mp = 70;
		this.xp = 464;
		this.gp = 325;
		this.battlePower = 25;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 45;
		this.stamina = 1;
		this.defense = 65;
		this.mdef = 180;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster


    }
}

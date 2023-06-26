package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Ralph extends Monster {
    public Ralph(Room roomIn) {

        this.level = 17;
		this.hp = 620;
		this.mp = 10;
		this.xp = 255;
		this.gp = 345;
		this.battlePower = 14;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 35;
		this.stamina = 1;
		this.defense = 135;
		this.mdef = 145;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);

    }
}

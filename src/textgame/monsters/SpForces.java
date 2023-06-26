package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class SpForces extends Monster {
    public SpForces(Room roomIn) {

        this.level = 21;
		this.hp = 700;
		this.mp = 20;
		this.xp = 200;
		this.gp = 0;
		this.battlePower = 13;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 40;
		this.stamina = 1;
		this.defense = 100;
		this.mdef = 140;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);

    }
}

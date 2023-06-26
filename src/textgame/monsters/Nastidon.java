package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Nastidon extends Monster {
    public Nastidon(Room roomIn) {

        this.level = 32;
		this.hp = 1877;
		this.mp = 100;
		this.xp = 697;
		this.gp = 298;
		this.battlePower = 13;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 35;
		this.stamina = 3;
		this.defense = 145;
		this.mdef = 105;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);

    }
}

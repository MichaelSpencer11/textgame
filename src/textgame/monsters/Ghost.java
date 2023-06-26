package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Ghost extends Monster {
    public Ghost(Room roomIn) {

        this.level = 10;
		this.hp = 226;
		this.mp = 70;
		this.xp = 48;
		this.gp = 75;
		this.battlePower = 1;
		this.hitRate = 100;
		this.magicPower = 1;
		this.speed = 30;
		this.stamina = 0;
		this.defense = 105;
		this.mdef = 150;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);
		this.drops.add(tonic);
    }
}

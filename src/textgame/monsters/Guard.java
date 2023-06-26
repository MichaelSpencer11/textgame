package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Guard extends Monster {
    public Guard(Room roomIn) {

        this.level = 5;
		this.hp = 40;
		this.mp = 15;
		this.xp = 48;
		this.gp = 48;
		this.battlePower = 16;
		this.hitRate = 100;
		this.magicPower = 6;
		this.speed = 30;
		this.stamina = 0;
		this.defense = 100;
		this.mdef = 140;
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

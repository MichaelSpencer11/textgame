package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class GreaseMonk extends Monster {
    public GreaseMonk(Room roomIn) {

        this.level = 8;
		this.hp = 132;
		this.mp = 100;
		this.xp = 53;
		this.gp = 256;
		this.battlePower = 15;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 35;
		this.stamina = 0;
		this.defense = 100;
		this.mdef = 150;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);

    }
}

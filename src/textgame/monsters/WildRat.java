package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class WildRat extends Monster {
    public WildRat(Room roomIn) {

        this.level = 12;
		this.hp = 160;
		this.mp = 10;
		this.xp = 135;
		this.gp = 135;
		this.battlePower = 10;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 30;
		this.stamina = 0;
		this.defense = 85;
		this.mdef = 100;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);

    }
}

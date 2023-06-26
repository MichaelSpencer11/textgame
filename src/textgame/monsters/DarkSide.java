package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class DarkSide extends Monster {
    public DarkSide(Room roomIn) {

        this.level = 13;
		this.hp = 255;
		this.mp = 85;
		this.xp = 165;
		this.gp = 138;
		this.battlePower = 10;
		this.hitRate = 100;
		this.magicPower = 8;
		this.speed = 30;
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

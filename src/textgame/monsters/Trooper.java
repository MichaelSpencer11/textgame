package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Trooper extends Monster {
    public Trooper(Room roomIn) {

        this.level = 13;
		this.hp = 255;
		this.mp = 60;
		this.xp = 90;
		this.gp =96;
		this.battlePower = 15;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 25;
		this.stamina = 0;
		this.defense = 100;
		this.mdef = 125;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);

    }
}

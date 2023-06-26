package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Cruller extends Monster {
    public Cruller(Room roomIn) {

        this.level = 28;
		this.hp = 1334;
		this.mp = 100;
		this.xp = 419;
		this.gp = 797;
		this.battlePower = 11;
		this.hitRate = 100;
		this.magicPower = 4;
		this.speed = 30;
		this.stamina = 2;
		this.defense = 110;
		this.mdef = 70;
		this.evade = 100;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);

    }
}

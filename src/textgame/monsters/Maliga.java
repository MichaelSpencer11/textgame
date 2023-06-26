package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Maliga extends Monster {
    public Maliga(Room roomIn) {

        this.level = 26;
		this.hp = 952;
		this.mp = 100;
		this.xp = 360;
		this.gp = 576;
		this.battlePower = 13;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 30;
		this.stamina = 1;
		this.defense = 110;
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

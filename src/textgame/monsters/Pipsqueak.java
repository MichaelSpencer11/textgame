package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Pipsqueak extends Monster {
    public Pipsqueak(Room roomIn) {

        this.level = 18;
		this.hp = 250;
		this.mp = 50;
		this.xp = 115;
		this.gp = 100;
		this.battlePower = 13;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 25;
		this.stamina = 0;
		this.defense = 200;
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

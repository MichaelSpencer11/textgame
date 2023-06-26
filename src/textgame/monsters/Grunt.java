package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Grunt extends Monster {
    public Grunt(Room roomIn) {

        this.level = 12;
		this.hp = 100;
		this.mp = 10;
		this.xp = 38;
		this.gp = 48;
		this.battlePower = 11;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 35;
		this.stamina = 0;
		this.defense = 50;
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

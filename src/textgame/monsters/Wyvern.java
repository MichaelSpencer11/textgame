package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Wyvern extends Monster {
    public Wyvern(Room roomIn) {

        this.level = 18;
		this.hp = 892;
		this.mp = 95;
		this.xp = 484;
		this.gp = 434;
		this.battlePower = 15;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 30;
		this.stamina = 1;
		this.defense = 140;
		this.mdef = 155;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);

    }
}

package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Bomb extends Monster {
    public Bomb(Room roomIn) {

        this.level = 8;
		this.hp = 160;
		this.mp = 50;
		this.xp = 35;
		this.gp = 80;
		this.battlePower = 10;
		this.hitRate = 100;
		this.magicPower = 1;
		this.speed = 30;
		this.stamina = 0;
		this.defense = 90;
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

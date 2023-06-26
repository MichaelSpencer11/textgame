package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Vargas extends Monster {
    public Vargas(Room roomIn) {

        this.level = 12;
		this.hp = 11600;
		this.mp = 220;
		this.xp = 0;
		this.gp = 0;
		this.battlePower = 13;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 30;
		this.stamina = 22;
		this.defense = 85;
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

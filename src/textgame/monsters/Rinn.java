package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Rinn extends Monster {
    public Rinn(Room roomIn) {

        this.level = 11;
		this.hp = 110;
		this.mp = 10;
		this.xp = 95;
		this.gp = 100;
		this.battlePower = 10;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 25;
		this.stamina = 0;
		this.defense = 55;
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

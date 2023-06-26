package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Aspik extends Monster {
    public Aspik(Room roomIn) {

        this.level = 12;
		this.hp = 220;
		this.mp = 330;
		this.xp = 48;
		this.gp = 115;
		this.battlePower = 2;
		this.hitRate = 100;
		this.magicPower = 2;
		this.speed = 40;
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

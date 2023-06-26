package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Hazer extends Monster {
    public Hazer(Room roomIn) {

        this.level = 12;
		this.hp = 120;
		this.mp = 100;
		this.xp = 35;
		this.gp = 101;
		this.battlePower = 5;
		this.hitRate = 100;
		this.magicPower = 7;
		this.speed = 25;
		this.stamina = 0;
		this.defense = 110;
		this.mdef = 150;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
        this.drops.add(tonic);

    }
}

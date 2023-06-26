package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Poplium extends Monster {
    public Poplium(Room roomIn) {

        this.level = 11;
		this.hp = 145;
		this.mp = 25;
		this.xp = 55;
		this.gp = 55;
		this.battlePower = 13;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 25;
		this.stamina = 0;
		this.defense = 55;
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

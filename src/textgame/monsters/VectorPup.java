package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class VectorPup extends Monster {
    public VectorPup(Room roomIn) {

        this.level = 11;
		this.hp = 166;
		this.mp = 10;
		this.xp = 128;
		this.gp = 83;
		this.battlePower = 14;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 25;
		this.stamina = 0;
		this.defense = 80;
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

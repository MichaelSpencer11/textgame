package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Rhinotaur extends Monster {
    public Rhinotaur(Room roomIn) {

        this.level = 8;
		this.hp = 232;
		this.mp = 100;
		this.xp = 246;
		this.gp = 186;
		this.battlePower = 13;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 30;
		this.stamina = 0;
		this.defense = 100;
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

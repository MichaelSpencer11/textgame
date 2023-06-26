package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class RedWolf extends Monster {
    public RedWolf(Room roomIn) {

        this.level = 32;
		this.hp = 1510;
		this.mp = 110;
		this.xp = 687;
		this.gp = 412;
		this.battlePower = 10;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 25;
		this.stamina = 2;
		this.defense = 155;
		this.mdef = 140;
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

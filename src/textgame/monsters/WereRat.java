package textgame.monsters;

import textgame.Monster;
import textgame.Random;
import textgame.Room;
import textgame.items.Tonic;

public class WereRat extends Monster {
    public WereRat(Room roomIn) {


		this.name = "WereRat";
        this.level = 4;
		this.maxHp = 55;
		this.hp = maxHp;
		this.mp = 0;
		this.xp = Random.roll(41,47);
		this.gp = 22;
		this.vigor = 20;
		this.battlePower = 27;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 30;
		this.stamina = 0;
		this.defense = 60;
		this.mdef = 150;
		this.evade = 0;
		this.MBlock = 0;
		this.respawnTime = 10000;
		this.currentRoom = roomIn;
		currentRoom.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);
		this.drops.add(tonic);

    }
}

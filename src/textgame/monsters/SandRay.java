package textgame.monsters;

import textgame.Monster;
import textgame.Random;
import textgame.Room;
import textgame.items.Tonic;

public class SandRay extends Monster {
    
    public SandRay(Room roomIn) {

		this.name = "SandRay";
		this.level = 6;
		this.maxHp = 67;
		this.hp = maxHp;
		this.mp = 0;
		this.xp = Random.roll(53,63);
		this.gp = 38;
		this.vigor = 28;
		this.battlePower = 30;
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

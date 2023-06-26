package textgame.monsters;

import textgame.Monster;
import textgame.Random;
import textgame.Room;
import textgame.items.Tonic;

public class Leafer extends Monster {
    public Leafer(Room firstRoom) {

		this.name = "Leafer";
        this.level = 2;
		setStartingMaxHp(this.level);
		this.hp = maxHp;
		this.maxMp = 0;
		this.mp = maxMp;
		this.vigor = 15;
		this.xp = Random.roll(35,40);
		this.gp = Random.roll(10,20);
		this.battlePower = 19;
		this.hitRate = 100;
		this.delay = 300;
		this.magicPower = 10;
		this.speed = 30;
		this.stamina = 0;
		this.defense = 40;
		this.mdef = 140;
		this.evade = 0;
		this.MBlock = 0;
		this.respawnTime = 10000;
		this.currentRoom = firstRoom;
		currentRoom.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);
		this.drops.add(tonic);

    }
}

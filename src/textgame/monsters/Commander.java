package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Commander extends Monster {
    public Commander(Room firstRoom, Room blocking) {

		this.name = "Commander";
        this.level = 2;
		this.maxHp = 50;
		this.hp = maxHp;
		this.mp = 50;
		this.xp = 85;
		this.gp = 153;
		this.battlePower = 7;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 30;
		this.stamina = 0;
		this.defense = 70;
		this.mdef = 150;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		this.respawnTime = 60000;
		this.currentRoom = firstRoom;
		currentRoom.getMonsters().add(this);
		this.blocking = blocking;

		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);


    }
}

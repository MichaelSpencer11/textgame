package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Scorpion extends Monster {
    public Scorpion(Room roomIn) {

        this.level = 26;
		this.hp = 290;
		this.mp = 19;
		this.xp = 199;
		this.gp = 336;
		this.battlePower = 10;
		this.hitRate = 100;
		this.magicPower = 9;
		this.speed = 20;
		this.stamina = 0;
		this.defense = 5;
		this.mdef = 215;
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

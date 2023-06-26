package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Joker extends Monster {
    public Joker(Room roomIn) {

        this.level = 17;
		this.hp = 467;
		this.mp = 90;
		this.xp = 194;
		this.gp = 320;
		this.battlePower = 13;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 35;
		this.stamina = 0;
		this.defense = 125;
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

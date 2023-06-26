package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Psychot extends Monster {
    public Psychot(Room roomIn) {

        this.level = 32;
		this.hp = 900;
		this.mp = 55;
		this.xp = 347;
		this.gp = 275;
		this.battlePower = 14;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 33;
		this.stamina = 1;
		this.defense = 165;
		this.mdef = 125;
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

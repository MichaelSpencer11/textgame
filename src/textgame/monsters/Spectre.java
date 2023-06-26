package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Spectre extends Monster {
    public Spectre(Room roomIn) {

        this.level = 13;
		this.hp = 235;
		this.mp = 120;
		this.xp = 220;
		this.gp = 138;
		this.battlePower = 1;
		this.hitRate = 100;
		this.magicPower = 8;
		this.speed = 35;
		this.stamina = 0;
		this.defense = 0;
		this.mdef = 160;
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

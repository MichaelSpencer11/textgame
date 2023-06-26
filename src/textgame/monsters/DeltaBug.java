package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class DeltaBug extends Monster {
    public DeltaBug(Room roomIn) {

        this.level = 26;
		this.hp = 612;
		this.mp = 80;
		this.xp = 288;
		this.gp = 211;
		this.battlePower = 11;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 30;
		this.stamina = 1;
		this.defense = 220;
		this.mdef = 5;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);

    }
}

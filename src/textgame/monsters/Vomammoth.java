package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Vomammoth extends Monster {
    public Vomammoth(Room roomIn) {

        this.level = 1;
		this.hp = 115;
		this.mp = 30;
		this.xp = 50;
		this.gp = 90;
		this.battlePower = 110;
		this.hitRate = 100;
		this.magicPower = 0;
		this.speed = 25;
		this.stamina = 0;
		this.defense = 75;
		this.mdef = 160;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);

    }
}

package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class MindCandy extends Monster {
    public MindCandy(Room roomIn) {

        this.level = 15;
		this.hp = 290;
		this.mp = 100;
		this.xp = 128;
		this.gp = 168;
		this.battlePower = 14;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 30;
		this.stamina = 0;
		this.defense = 105;
		this.mdef = 165;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);

    }
}

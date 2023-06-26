package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class AlloVer extends Monster {
    public AlloVer(Room roomIn) {

        this.level = 19;
		this.hp = 8000;
		this.mp = 8000;
		this.xp = 0;
		this.gp = 0;
		this.battlePower = 13;
		this.hitRate = 100;
		this.magicPower = 55;
		this.speed = 55;
		this.stamina = 15;
		this.defense = 140;
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

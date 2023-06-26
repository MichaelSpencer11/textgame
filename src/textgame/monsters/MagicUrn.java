package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class MagicUrn extends Monster {
    public MagicUrn(Room roomIn) {

        this.level = 31;
		this.hp = 100;
		this.mp = 10000;
		this.xp = 53;
		this.gp = 80;
		this.battlePower = 5;
		this.hitRate = 100;
		this.magicPower = 35;
		this.speed = 40;
		this.stamina = 0;
		this.defense = 220;
		this.mdef = 190;
		this.evade = 100;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);

    }
}

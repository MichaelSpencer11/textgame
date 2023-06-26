package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class General extends Monster {
    public General(Room roomIn) {

        this.level = 19;
		this.hp = 650;
		this.mp = 30;
		this.xp = 232;
		this.gp = 308;
		this.battlePower = 13;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 30;
		this.stamina = 1;
		this.defense = 155;
		this.mdef = 105;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);

    }
}

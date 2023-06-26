package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class ChickenLip extends Monster {
    public ChickenLip(Room roomIn) {

        this.level = 18;
		this.hp = 545;
		this.mp = 155;
		this.xp = 190;
		this.gp = 279;
		this.battlePower = 11;
		this.hitRate = 100;
		this.magicPower = 3;
		this.speed = 30;
		this.stamina = 1;
		this.defense = 150;
		this.mdef = 135;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);

    }
}

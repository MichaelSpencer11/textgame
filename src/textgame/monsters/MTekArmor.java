package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class MTekArmor extends Monster {
    public MTekArmor(Room roomIn) {

        this.level = 8;
		this.hp = 210;
		this.mp = 250;
		this.xp = 150;
		this.gp = 148;
		this.battlePower = 18;
		this.hitRate = 100;
		this.magicPower = 3;
		this.speed = 25;
		this.stamina = 0;
		this.defense = 30;
		this.mdef = 130;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);

    }
}

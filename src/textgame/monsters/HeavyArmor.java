package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class HeavyArmor extends Monster {
    public HeavyArmor(Room roomIn) {

        this.level = 13;
		this.hp = 495;
		this.mp = 150;
		this.xp = 80;
		this.gp = 195;
		this.battlePower = 53;
		this.hitRate = 100;
		this.magicPower = 11;
		this.speed = 40;
		this.stamina = 0;
		this.defense = 150;
		this.mdef = 110;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);

    }
}

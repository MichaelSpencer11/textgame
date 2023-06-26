package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class StrayCat extends Monster {
    public StrayCat(Room roomIn) {

        this.level = 10;
		this.hp = 156;
		this.mp = 30;
		this.xp = 42;
		this.gp = 90;
		this.battlePower = 9;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 30;
		this.stamina = 0;
		this.defense = 10;
		this.mdef = 135;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.drops.add(tonic);

    }
}

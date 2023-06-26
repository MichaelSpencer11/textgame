package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Rhobite extends Monster {
    public Rhobite(Room roomIn) {

        this.level = 10;
		this.hp = 135;
		this.mp = 40;
		this.xp = 53;
		this.gp = 110;
		this.battlePower = 9;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 30;
		this.stamina = 0;
		this.defense = 70;
		this.mdef = 140;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.drops.add(tonic);

    }
}

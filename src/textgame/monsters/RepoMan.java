package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class RepoMan extends Monster {
    public RepoMan(Room roomIn) {

        this.level = 5;
		this.hp = 35;
		this.mp = 10;
		this.xp = 25;
		this.gp = 25;
		this.battlePower = 19;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 35;
		this.stamina = 0;
		this.defense = 90;
		this.mdef = 120;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);
		this.drops.add(tonic);
    }
}

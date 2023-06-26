package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Brawler extends Monster{
    public Brawler(Room roomIn) {

        this.level = 9;
		this.hp = 137;
		this.mp = 100;
		this.xp = 79;
		this.gp = 84;
		this.battlePower = 14;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 35;
		this.stamina = 0;
		this.defense = 100;
		this.mdef = 70;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.drops.add(tonic);

    }
}

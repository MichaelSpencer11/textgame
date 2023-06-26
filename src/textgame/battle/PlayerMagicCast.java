package textgame.battle;

import textgame.ConsoleColors;
import textgame.elements.Element;
import textgame.Action;
import textgame.Random;
import textgame.spells.Spell;

public class PlayerMagicCast extends Action {

	protected Battle battleContext;
	protected int dmg;
	protected int damage;
	
	public PlayerMagicCast(Spell spell, Battle battle){

		this.battleContext = battle;

		int bp = spell.getBp();
		int level = battleContext.getPlayer().getJob().getLevel();
		int intel = battleContext.getPlayer().getJob().getIntel();
		int eMDef = battleContext.getMonster().getMagicDefense();
		if(this.hits()){
			dmg = bp * level / 4;
			dmg = dmg * intel;
			dmg = dmg * Random.roll(7,15) / 10;
			dmg = dmg / eMDef;
			damage = (int)Math.floor(dmg);
		}
	}

	public boolean hits(){

		if(battleContext.getPlayer().getClear()){
			return true;
		}
		if(this.unblockable){
			return true;
		}
		if(battleContext.getPlayer().getAsleep() ||
				battleContext.getPlayer().getPetrify() ||
				battleContext.getPlayer().getFrozen() ||
				battleContext.getPlayer().getStop()) {
			return true;
		}
		//when implementing ninja
		// if(battleContext.getMonster().getImage()){

		// }
		if(battleContext.getMonster().getBlockValue() > 255){battleContext.getPlayer().setBlockValue(255);}
		if(battleContext.getMonster().getBlockValue() < 1){battleContext.getPlayer().setBlockValue(1);}

		if((battleContext.getPlayer().getMainHand().getHitRate() * battleContext.getMonster().getBlockValue()) >= (int) Random.roll(0,99)){
			return true;
		}

		System.out.println(ConsoleColors.YELLOW + "You miss the " + battleContext.getMonster().typeToString() + ConsoleColors.RESET);
		return false;

	}

	public PlayerMagicCast(){}
	
}

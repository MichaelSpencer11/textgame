package textgame.spells;

import textgame.Random;
import textgame.battle.Battle;

public class Cure extends Spell {

    public Cure(){
        super("Cure",20,"c",6,new textgame.elements.Pearl(),"Bathes the target in pearly light that heals minor damage.");
    }

    public void cast(Battle battle){
        int amount = 0;
        int bp = this.bp;
        int level = battle.getPlayer().getJob().getLevel();
        int intel = battle.getPlayer().getJob().getIntelligence();

            amount = bp * level / 2;
            amount = amount * intel;
            amount = amount * Random.roll(7,15) / 10;
            amount = (int)Math.floor(amount);

        battle.getPlayer().getJob().setMp(battle.getPlayer().getJob().getMp() - this.mp);

        battle.getPlayer().getJob().addHp(amount);
        System.out.println("You healed yourself for " + amount + "hp.");
    }
    
    
}

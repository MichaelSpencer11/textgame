package textgame.spells;

import textgame.Character;
import textgame.Random;
import textgame.battle.Battle;

import java.io.Serializable;

public class Cure extends Spell implements Serializable {

    public Cure(){
        super("Cure",1,"c",6,new textgame.elements.Pearl(),"Bathes the target in pearly light that heals minor damage.");
    }

    public void cast(Battle battle){
        amount = 0;
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

    
    public void cast(Character source, Character target){
        amount = 0;
        int bp = this.bp;
        int level = source.getJob().getLevel();
        int intel = source.getJob().getIntelligence();

            amount = bp * level / 2;
            amount = amount * intel;
            amount = amount * Random.roll(7,15) / 10;
            amount = (int)Math.floor(amount);

        source.getJob().setMp(source.getJob().getMp() - this.mp);

        target.getJob().addHp(amount);
        System.out.println("You healed " + target.getName() + " for " + amount + "hp.");
    }
    
    
}

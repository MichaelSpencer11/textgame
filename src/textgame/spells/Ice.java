package textgame.spells;

import textgame.Character;
import textgame.ConsoleColors;
import textgame.Random;
import textgame.battle.Battle;
import textgame.battle.Victory;

public class Ice extends Spell{
    public Ice(){
        super("Ice",35,"i",9,new textgame.elements.Ice(),"Propels a flurry of frozen nanomaterial that inflicts cold damage.");
    }

    public void cast(Battle battle){
        int dmg = 0;
        int bp = this.bp;
        int level = battle.getPlayer().getJob().getLevel();
        int intel = battle.getPlayer().getJob().getIntelligence();
        int eMDef = battle.getMonster().getMagicDefense();

        dmg = bp * level / 2;
        dmg = dmg * intel;
        dmg = dmg * Random.roll(7,15) / 10;
        dmg = dmg / eMDef;
        dmg = (int)Math.floor(dmg);

        battle.getPlayer().getJob().setMp(battle.getPlayer().getJob().getMp() - this.mp);
        battle.getMonster().applyDamage(dmg);
        System.out.println(ConsoleColors.RED + battle.getPlayer().getName() + "'s " + this.name + " hits " + battle.getMonster().getName() + " for " + dmg + " damage." + ConsoleColors.RESET);

        if(battle.getMonster().getHp() <= 0){

            new Victory(battle);
        }

    }

    public void cast(Character source, Character target){}
}

package textgame.spells;

import textgame.ConsoleColors;
import textgame.Random;
import textgame.battle.Battle;
import textgame.battle.Victory;

public class Bolt extends Spell{

    public Bolt(){
        super("Bolt",60,"b",12,new textgame.elements.Lightning(),"Strikes the target with a bolt of pure electrical energy.");
    }

    public void cast(Battle battle) {
        int dmg = 0;
        int bp = this.bp;
        int level = battle.getPlayer().getJob().getLevel();
        int intel = battle.getPlayer().getJob().getIntelligence();
        int eMDef = battle.getMonster().getMagicDefense();

        dmg = bp * level / 2;
        dmg = dmg * intel;
        dmg = dmg * Random.roll(7, 15) / 10;
        dmg = dmg / eMDef;
        dmg = (int) Math.floor(dmg);

        battle.getPlayer().getJob().setMp(battle.getPlayer().getJob().getMp() - this.mp);
        battle.getMonster().applyDamage(dmg);
        System.out.println(ConsoleColors.RED + battle.getPlayer().getName() + "'s " + this.name + " hits " + battle.getMonster().getName() + " for " + dmg + " damage." + ConsoleColors.RESET);

        if (battle.getMonster().getHp() <= 0) {

            new Victory(battle);
        }

    }
}

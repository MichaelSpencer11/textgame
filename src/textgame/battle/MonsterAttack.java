package textgame.battle;

import textgame.Action;
import textgame.ConsoleColors;
import textgame.Random;

public class MonsterAttack extends Action {
    protected Battle battleContext;
    protected int attack;
    protected int damage;
    protected double dmg;
    protected int damageMultiplier;
    public MonsterAttack(Battle battle){
        this.battleContext = battle;
        int bp = battleContext.getMonster().getBattlePower();
        int vigor = battleContext.getMonster().getVigor();
        int level = battleContext.getMonster().getLevel();
        int pDef = battleContext.getPlayer().getJob().getDefense();

        if(this.hits()){
            dmg = bp * level / 4;
            dmg = dmg * vigor;
            dmg = dmg * Random.roll(9,11) / 10;
            dmg = dmg / pDef;
            damage = (int)Math.floor(dmg);

            battleContext.getPlayer().getJob().applyDamage(damage); 
            System.out.println(ConsoleColors.RED + battleContext.getMonster().getName() + " hits " + battleContext.getPlayer().getName() + " for " + damage + " damage." + ConsoleColors.RESET);
        } else {
            System.out.println("The " + battleContext.getMonster().getName() + " misses you.");
        }
        if(battleContext.getPlayer().getJob().getHp() <= 0){
            new Defeat(battleContext);
        }
    }

    public boolean hits(){
        if(battleContext.getPlayer().getClear()){
            return false;
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
        // if(battleContext.getPlayer().getImage()){

        // }
        
        if((battleContext.getMonster().getHitRate() * battleContext.getPlayer().getBlockValue()) >= Random.roll(1,100)){
            return true;
        }

        System.out.println(ConsoleColors.YELLOW + "The " + battleContext.getMonster().getName() + "misses you." + ConsoleColors.RESET);
        return false;

    }
}

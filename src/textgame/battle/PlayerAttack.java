package textgame.battle;

import java.net.SocketTimeoutException;

import textgame.Action;
import textgame.ConsoleColors;
import textgame.Random;

public class PlayerAttack extends Action {
    protected Battle battleContext;
    protected double dmg;
    protected int damage;
    public PlayerAttack(Battle battle){
        this.battleContext = battle;
        int bp = battleContext.getPlayer().getMainHand().getBattlePower();
        int level = battleContext.getPlayer().getJob().getLevel();
        int vigor = battleContext.getPlayer().getJob().getVigor();
        int eDef = battleContext.getMonster().getDefense();
        if(this.hits()){

            dmg = bp * level / 4;
            dmg = dmg * vigor;
            dmg = dmg * Random.roll(7,15) / 10;
            dmg = dmg / eDef;
            damage = (int)Math.floor(dmg);

            battleContext.getMonster().applyDamage(damage); 
            System.out.println(ConsoleColors.RED + battleContext.getPlayer().getName() + " hits " + battleContext.getMonster().getName() + " for " + damage + " damage." + ConsoleColors.RESET);
        } else {
            System.out.println("You miss the " + battleContext.getMonster().getName() + ".");
        }
        if(battleContext.getMonster().getHp() <= 0){

            new Victory(battleContext);
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
}

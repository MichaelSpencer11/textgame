package textgame.battle;

import textgame.ConsoleColors;
import textgame.Item;
import textgame.battle.Battle;
import textgame.Random;
import textgame.Monster;
import textgame.battle.RespawnThread;

public class Victory {

    Battle battleContext;
    RespawnThread respawnThread;

    public Victory(Battle battle){
        battleContext = battle;
        battleContext.battleOn = false;
        int exp = battleContext.getMonster().getXp() * (battleContext.getMonster().getLevel() / battleContext.getPlayer().getJob().getLevel() + 1);
        if (exp < 0 ) exp = Math.abs(exp);
        System.out.println(ConsoleColors.BLUE + "Victory!");
        System.out.println("Exp : " + exp);
        System.out.println("GP: " + battleContext.getMonster().getGp());
        battleContext.getPlayer().addGp(battleContext.getMonster().getGp());
        //check for level up and level up if necessary, and adding random variance to exp gain
        battleContext.getPlayer().addExp(exp);
        System.out.println("Items : ");
        //go through the drops of the monster, if it drops, put it in player inventory and notify
         for (Item i : battleContext.getMonster().getDrops()){
            if(i.getDropRate() >= Random.roll(1, 100)){
                battleContext.getPlayer().getInventory().add(i);
                System.out.println(i.getItemName() + ConsoleColors.RESET);
            }
            else {
                System.out.println("None" + ConsoleColors.RESET);
            }
         }
         //remove monster from room
         respawnThread = new RespawnThread(battleContext);
         battleContext.getMonster().getCurrentRoom().getMonsters().remove(battleContext.getMonster());
         battleContext.getPlayer().setTarget(null);

    }
}

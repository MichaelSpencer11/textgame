package textgame.battle;

public class Defeat {
    public Defeat (Battle battleContext){
        battleContext.battleOn = false;
        battleContext.getPlayerThread().isAlive(false);
        System.out.println("Defeated by " + battleContext.getMonster().getName() + ".");
        battleContext.getPlayer().homePoint();

    }
}

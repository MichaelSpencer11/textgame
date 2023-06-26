package textgame.battle;

import textgame.Monster;

public class MonsterThread implements Runnable{
    
    Battle battleContext;
    boolean isAlive;
    Thread mt;
    

    public MonsterThread(Battle battle){
        this.isAlive = true;
        this.battleContext = battle;
        mt = new Thread(this, "monsterThread");
    }

    public boolean isAlive(boolean isAlive){
        return isAlive;
    }

    public void run(){
        while ((battleContext.getMonster().getHp() >= 0 && battleContext.battleOn) || (battleContext.getPlayer().getJob().getHp() >= 0 && battleContext.battleOn) ) {

                try {
                    Thread.sleep(battleContext.getMonster().getDelay());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                if(battleContext.getMonster().getHp() >= 0 && battleContext.battleOn) {
                    new MonsterAttack(battleContext);
                }

        }
    }

    public void run(Battle battleContext){

    }





    
}

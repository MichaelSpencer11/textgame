package textgame.battle;

public class PlayerThread implements Runnable {

    Battle battleContext;
    boolean isAlive;
    Thread pt;
    

    public PlayerThread(Battle battleContext){
        this.isAlive = true;
        this.battleContext = battleContext;
        pt = new Thread(this, "playerThread");

        
    }

    public boolean isAlive(boolean isAlive){
        return isAlive;
    }

    public void run(){
        while((battleContext.getMonster().getHp() >= 0 && battleContext.battleOn) || (battleContext.getPlayer().getJob().getHp() >= 0 && battleContext.battleOn)) {
            try {
                Thread.sleep(battleContext.getPlayer().getMainHand().getDelay());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            new BattleMenu(battleContext);
        }
              
    }

    public void run(Battle battleContext){

    }




}

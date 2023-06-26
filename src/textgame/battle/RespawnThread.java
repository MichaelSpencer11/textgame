package textgame.battle;


public class RespawnThread implements Runnable {
    Battle battleContext;
    Thread respawnThread;

    public RespawnThread(Battle battleContext){
        this.battleContext = battleContext;
        respawnThread = new Thread(this, "respawnThread");
        respawnThread.start();
    }

    public void run(){
        try{
        Thread.sleep(battleContext.getMonster().getRespawnTime());
        } catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }
        battleContext.getMonster().respawn();
        battleContext.getCurrentRoom().getMonsters().add(battleContext.getMonster());

    }
}

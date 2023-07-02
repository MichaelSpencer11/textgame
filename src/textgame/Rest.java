package textgame;

public class Rest implements Runnable {

    Character player;
    Thread t;



    protected boolean resting;

    public Rest(Character player){
        t = new Thread(this,"restThread");
        this.player = player;

    }


    public void run(){
        while(true){
            try {
                this.t.sleep(10000);
            } catch (InterruptedException ie){
                System.out.println(ie.getMessage());
            }
            if (resting) {
                player.getJob().addHp(player.getJob().getMaxHp() / 10);
                player.getJob().addMp(player.getJob().getMaxMp() / 10);
                System.out.println("You rest and recover " + (player.getJob().getMaxHp() / 10) + "hp and " + (player.getJob().getMaxMp() / 10) + " mp." );
            }

        }
    }
    public void setResting(boolean resting) {
        this.resting = resting;
    }

    public boolean isResting() {
        return resting;
    }

}

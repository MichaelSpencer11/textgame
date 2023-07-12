package textgame.util;

import textgame.Character;
import textgame.spells.Spell;

public class EnSpellTimer implements Runnable {

    Character player;
    int amount;
    public Thread t;

    public EnSpellTimer(Character player, int amount){
        this.player = player;
        this.amount = amount;
        t = new Thread(this, "enSpellTimer");

    }

    public void run(){
        this.player.getJob().setEnSpellIsActive(true);
        //player.getMainHand().addBp(spell.getAmount());
        System.out.println("You imbued your weapon with fire.");
        System.out.println("Used Enfire on " + player.getName());
        try{
            Thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        player.getJob().setEnSpellIsActive(false);
        player.getMainHand().subtractBp(amount);
        System.out.println(player.getName() + "'s enfire effect wears off.");
    }
}

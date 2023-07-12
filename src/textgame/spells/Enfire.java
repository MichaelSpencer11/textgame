package textgame.spells;

import textgame.Character;
import textgame.Random;
import textgame.battle.Battle;
import textgame.util.EnSpellTimer;

import java.io.Serializable;

public class Enfire extends Spell implements Serializable {


    int amount = 0;
    public Enfire(){
        super("Enfire",1,"ef",6,new textgame.elements.Fire(),"Imbues the target's weapon in flame and increases damage.");
    }

    public void cast(Battle battle){
        amount = 0;
        double multiplier = 0;
        bp = Random.roll(1,100);
        if(bp >=1 && bp <= 25){
            multiplier = 1.1;
        }else if(bp >= 26 && bp <= 84){
            multiplier = 1.2;
        } else if(bp >= 85 && bp <= 100){
            multiplier = 1.3;
        }

        amount = (int)((battle.getPlayer().getMainHand().getBattlePower() * multiplier) - battle.getPlayer().getMainHand().getBattlePower());
        System.out.println("Amount: " + amount);

        battle.getPlayer().getJob().setMp(battle.getPlayer().getJob().getMp() - this.mp);
        if(!battle.getPlayer().getJob().enSpellIsActive()) {
            new EnSpellTimer(battle.getPlayer(), amount);
            System.out.println("You imbued your weapon with fire.");
        } else{
            System.out.println("An enhancement spell is already active.");
        }


    }

    public void cast(Character source, Character target){
        amount = 0;
        double multiplier = 0;
        bp = Random.roll(1,source.getJob().getIntel());
        if(bp >=1 && bp <= 10){
            multiplier = 1.1;
        }else if(bp >= 11 && bp <= 20){
            multiplier = 1.2;
        } else if(bp >= 21 && bp <= 30){
            multiplier = 1.3;
        } else if(bp >= 31 && bp <= 40){
            multiplier = 1.4;
        } else if(bp >= 41 && bp <= 50){
            multiplier = 1.5;
        } else if(bp >= 51 && bp <= 60){
            multiplier = 1.6;
        } else if(bp >= 61 && bp <= 70){
            multiplier = 1.7;
        } else if(bp >= 71 && bp <= 80){
            multiplier = 1.8;
        } else if(bp >= 81 && bp <= 90){
            multiplier = 1.9;
        } else if(bp >= 91 && bp <= 100){
            multiplier = 2;
        }
        System.out.println("SpellBP: " + bp);
        System.out.println("Multiplier: " + multiplier);

        amount = (int)((target.getMainHand().getBattlePower() * multiplier) - target.getMainHand().getBattlePower());
        System.out.println("Total BP Gain: " + amount);


        if(target.getJob().enSpellIsActive() == false) {
            source.getJob().setMp(source.getJob().getMp() - this.mp);
            target.getMainHand().setBattlePower(target.getMainHand().getBattlePower() + amount);
            EnSpellTimer est = new EnSpellTimer(target, amount);
            est.t.start();
        } else{
            System.out.println("An enhancement spell is already active.");
        }
    }




}

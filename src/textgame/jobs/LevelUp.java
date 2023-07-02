package textgame.jobs;

import textgame.Character;
import textgame.ConsoleColors;

public class LevelUp {
    public LevelUp(Character player, int exp, int maxExp ){
        System.out.println(ConsoleColors.BLUE + "Level Up!" + ConsoleColors.RESET);
        //carry over exp from previous level
        exp = exp - maxExp;
        //level up
        player.getJob().setLevel(player.getJob().getLevel() + 1);
        //set new exp need for next level up
        player.getJob().setMaxExp(player.getJob().getLevel());
        //set new hp
        player.getJob().setMaxHp(player.getJob().getLevel());
        //set new mp
        player.getJob().setMaxMp(player.getJob().getLevel());
        //set new vigor
        player.getJob().setVigor(player.getJob().getLevel());
        //set new vit and defense
        player.getJob().setVitForLevelUp(player.getJob().getLevel());
        player.getJob().setDefense(player.getJob().getVitality() +
                player.getHead().getDefense() +
                player.getBody().getDefense() +
                player.getHands().getDefense() +
                player.getLegs().getDefense() +
                player.getFeet().getDefense());
        //set new intelligence
        player.getJob().setIntelligence(player.getJob().getLevel());

        if(player.getJob() instanceof BlackMage){
            if(player.getJob().getLevel() == 5){
                player.getJob().spells.add(((BlackMage) player.getJob()).ice);
            } else if (player.getJob().getLevel() == 10) {
                player.getJob().spells.add(((BlackMage) player.getJob()).bolt);
            }

        } else if (player.getJob() instanceof WhiteMage) {

        } else if (player.getJob() instanceof RedMage) {

        } else if (player.getJob() instanceof Warrior) {

        } else if (player.getJob() instanceof Monk) {

        } else if (player.getJob() instanceof Thief) {

        }


    }
}

package textgame.jobs;

import textgame.ConsoleColors;

public class LevelUp {
    public LevelUp(Job job, int exp, int maxExp ){
        System.out.println(ConsoleColors.BLUE + "Level Up!" + ConsoleColors.RESET);
        //carry over exp from previous level
        exp = exp - maxExp;
        //level up
        job.setLevel(job.getLevel() + 1);
        //set new exp need for next level up
        job.setMaxExp(job.getLevel());
        //set new hp
        job.setMaxHp(job.getLevel());
        //set new mp
        job.setMaxMp(job.getLevel());
        //set new vigor
        job.setVigor(job.getLevel());
        //set new defense
        job.setConForLevelUp(job.getLevel());
        //set new intelligence
        job.setIntelligence(job.getLevel());

        if(job instanceof BlackMage){
            if(job.getLevel() == 5){
                job.spells.add(((BlackMage) job).ice);
            } else if (job.getLevel() == 10) {
                job.spells.add(((BlackMage) job).bolt);
            }

        } else if (job instanceof WhiteMage) {

        } else if (job instanceof RedMage) {

        } else if (job instanceof Warrior) {

        } else if (job instanceof Monk) {

        } else if (job instanceof Thief) {

        }


    }
}

package textgame.jobs;

import textgame.jobs.Job;

public class Ability {
    protected String name;

    public Ability (String name){
        this.setName(name);
    }

    public String getName(){return name;}

    public void setName(String name){
        this.name = name;
    }

}
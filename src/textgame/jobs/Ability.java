package textgame.jobs;

import textgame.jobs.Job;

import java.io.Serializable;

public class Ability implements Serializable {
    protected String name;

    public Ability (String name){
        this.setName(name);
    }

    public String getName(){return name;}

    public void setName(String name){
        this.name = name;
    }

}
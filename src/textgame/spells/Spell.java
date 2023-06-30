package textgame.spells;

import textgame.Character;
import textgame.battle.Battle;
import textgame.elements.Element;

public abstract class Spell {



    protected String name;
    protected int bp;
    protected String shortcut;
    protected boolean learned;
    protected int mp;
    protected Element element;
    protected String description;

    public Spell(String name, int bp, String shortcut, int mp, Element element,String description ){
        this.name = name;
        this.bp = bp;
        this.shortcut = shortcut;
        this.mp = mp;
        this.element = element;
        this.description = description;
    }

    public Spell(){}

    public String getName() {return name;}
    public int getBp() {return bp;}
    public String getShortcut() {return shortcut;}
    public boolean isLearned(){return learned;}
    public void setLearned(boolean learned){
        this.learned = learned;
    }

    public abstract void cast(Battle battle);
    public abstract void cast(Character source, Character target);
}

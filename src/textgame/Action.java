package textgame;

import textgame.elements.Element;

public class Action {
    protected boolean unblockable;
    protected String type;
	protected int mpCost;
	protected int spellPower;
	protected int hitRate;
	protected boolean reflectable;
	protected boolean absorbedByRunic;
	protected Element element;
	protected boolean physicalDamage;
	protected boolean ignoresDefense;
	protected boolean ignoresMBlock;
	protected String targets;
	protected String description;
	protected String effect;

    public Action(){

    }
}

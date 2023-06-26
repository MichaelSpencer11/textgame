package textgame;

import textgame.elements.Element;

import java.util.List;

public class Shield {
	
	protected int defense;
	protected int magicDefense;
	protected EquipableBy equipableBy;
	protected String description;
	protected Element weakVs;
	protected Element halfDamage;
	protected Element noEffect;
	protected Element absorbs;
	protected SpecialEffect specialEffect;
}

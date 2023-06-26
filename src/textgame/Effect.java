package textgame;

import java.util.ArrayList;

public class Effect {
	protected String name;
	protected long number;
	protected static String currentEffect;

	static public void apply(ArrayList<Effect> effects, Character character){
		for (Effect effect : effects) {
			if(effect.name == "vigor") {
				character.vigor += effect.number;
			}
			if(effect.name == "speed") {
				character.speed += effect.number;
			}
			if(effect.name == "stamina") {
				character.stamina += effect.number;
			}
			if(effect.name == "magicPower") {
				character.magicPower += effect.number;
			}
			if(effect.name == "battlePower") {
				character.battlePower += effect.number;
			}
			if(effect.name == "defense") {
				character.defense += effect.number;
			}
			if(effect.name == "magicDefense") {
				character.magicDefense += effect.number;
			}
			if(effect.name == "mBlock") {
				character.mBlock += effect.number;
			}
			if(effect.name == "evade") {
				character.evade += effect.number;
			}
			
			
				
		}
	}
	
	public Effect(String name, long number) {
		this.name = name;
		this.number = number;
	}
}

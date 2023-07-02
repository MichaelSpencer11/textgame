package textgame;

import java.util.ArrayList;

//there are items in the game, here are some attributes and stuff
public class Item{
		protected int itemId;
		protected static int itemTracker;
		protected String itemName;
		protected String description;
		protected String closeDescription;
		protected Room roomIn;



	protected boolean equipped;
		protected boolean plural;
		protected boolean takeable;
		protected boolean consumable;
		protected ArrayList<String> stolenFrom;
		protected ArrayList<Monster> morphedInto;
		protected int dropRate;
		protected boolean equippable;
		protected int gpValue;
		protected String type;

		protected int battlePower;
		protected int defense;
		protected int delay;
		protected int hitRate;
		protected int weight;
		protected enum Rarity{
			Coarse,
			Common,
			Fine,
			Exceptional,
			Rare,
			Legendary,
			Ultra
		}

		protected String rarity;
		protected int rarityValueMod;



	protected int level;


		
		public Item() {
			this.itemId = itemTracker++;
		}
		
		public Item(String name, boolean plural, String description, String desc2, Room room) {
			this.itemName = name;
			this.plural = plural;
			this.description = description;
			this.closeDescription = desc2;
			this.itemId = itemTracker++;
			this.roomIn = room;
			this.takeable = true;

			room.getInventory().add(this);

		}

		//copy constructor
		public Item(Item i){
			this.itemName = i.itemName;
			this.description = i.description;
			this.closeDescription = i.closeDescription;
			this.roomIn = i.roomIn;
			this.equipped = i.equipped;
			this.plural = i.plural;
			this.takeable = i.takeable;
			this.consumable = i.consumable;
			this.stolenFrom = i.stolenFrom;
			this.morphedInto = i.morphedInto;
			this.dropRate = i.dropRate;
			this.equippable = i.equippable;
			this.gpValue = i.gpValue;
			this.type = i.type;
			this.battlePower = i.battlePower;
			this.defense = i.defense;
			this.delay = i.delay;
			this.hitRate = i.hitRate;
			this.weight = i.weight;
		}

		public int getDropRate() {
			return this.dropRate;
		}
		public String getItemName() {
			return itemName;
		}
		public String getType(){
			return type;
		}
		public int getDelay() {
			return delay;
		}
		public int getBattlePower() {return battlePower;}
		public int getDefense(){return defense;}
		public int getHitRate(){return hitRate;}
		public int getWeight(){return weight;}
		public String getDescription() {
			return this.description;
		}
		public int getGpValue(){return gpValue;}
		public int getLevel() {return level;}
		
		public String getDesc2() {
			return this.closeDescription;
		}
		
		public String typeToString(){
			return this.getClass().toString().substring(6);
		}
		
		public void applyEffect(Character target){};
		public boolean isEquipped() {
			return equipped;
		}

		public void setEquipped(boolean equipped) {
			this.equipped = equipped;
		}

		public void setRarity(){
			int rareNumber = Random.roll(1,10000);
			if(rareNumber >= 9990  && rareNumber <= 10000){
				this.rarity = Rarity.Ultra.name();
			} else if(rareNumber >= 8990  && rareNumber <= 9989){
				this.rarity = Rarity.Legendary.name();
			}else if(rareNumber >= 8790  && rareNumber <= 8989){
				this.rarity = Rarity.Rare.name();
			}else if(rareNumber >= 8390  && rareNumber <= 8789){
				this.rarity = Rarity.Exceptional.name();
			}else if(rareNumber >= 7590  && rareNumber <= 8389){
				this.rarity = Rarity.Fine.name();
			}else if(rareNumber >= 5990  && rareNumber <= 7589){
				this.rarity = Rarity.Common.name();
			}else if(rareNumber >= 1  && rareNumber <= 5989){
				this.rarity = Rarity.Coarse.name();
			}

		}

	}

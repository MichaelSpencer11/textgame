package textgame.armors;

import textgame.Item;

public class Armor extends Item {

    protected int level;
    protected int gpValue;
    protected int defense;

    public Armor(String name, int lvl , String type, int weight) {
        super();
        this.equippable = true;
        this.level = lvl;
        this.type = type;
        this.weight = weight;
        this.setRarity();
        this.dropRate = 85;
        this.itemName = rarity + " " + name;
        if(this.type.equalsIgnoreCase("feet")){
            defense = (level * 14) * (int)Math.ceil(.15);
        }else if(this.type.equalsIgnoreCase("hands")){
            defense = (level * 14) * (int)Math.ceil(.2);
        }else if(this.type.equalsIgnoreCase("legs")){
            defense = (level * 14) * (int)Math.ceil(.2);
        }else if(this.type.equalsIgnoreCase("body")){
            defense = (level * 14) * (int)Math.ceil(.25);
        }else if(this.type.equalsIgnoreCase("head")){
            defense = (level * 14) * (int)Math.ceil(.2);
        }

        if(this.rarity.equalsIgnoreCase("ultra")){
            defense = defense * (int)Math.ceil(3);
        } else if(this.rarity.equalsIgnoreCase("legendary")){
            defense = this.defense * (int)Math.ceil(2);
        }else if(this.rarity.equalsIgnoreCase("rare")){
            this.defense = this.defense * (int)Math.ceil(1.8);
        }else if(this.rarity.equalsIgnoreCase("exceptional")){
            this.defense = this.defense * (int)Math.ceil(1.6);
        }else if(this.rarity.equalsIgnoreCase("fine")){
            this.defense = this.defense * (int)Math.ceil(1.4);
        }else if(this.rarity.equalsIgnoreCase("common")){
            this.defense = this.defense * (int)Math.ceil(1.2);
        }else if(this.rarity.equalsIgnoreCase("coarse")){

        }

        this.gpValue = this.defense * 20 ;
    }

    //simple copy constructor
    public Armor(Armor a){
        this.equippable = a.equippable;
        this.itemName = a.itemName;
        this.level = a.level;
        this.type = a.type;
        this.weight = a.weight;
        this.defense = a.defense;
        this.rarity = a.rarity;
        this.gpValue = a.gpValue;
    }

    public int getLevel() {
        return level;
    }
    public int getGpValue(){return gpValue;}

    @Override
    public int getDefense() {
        return defense;
    }






}

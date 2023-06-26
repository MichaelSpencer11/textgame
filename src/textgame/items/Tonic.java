package textgame.items;

import textgame.Item;
import textgame.Character;

public class Tonic extends Item {
    protected int healingAmount;
    protected int level;
    protected int gpValue;
    public Tonic(){
        this.itemName = "Tonic";
        this.dropRate = 85;

        
    }


    public void applyEffect(Character player) {
        player.getJob().addHp(healingAmount);
    }

    public Tonic(String name, int lvl ){
        super();
        this.level = lvl;
        this.healingAmount = level * 10;
        this.setRarity();
        this.dropRate = 85;
        this.itemName = rarity + " " + name;
        if(this.rarity.equalsIgnoreCase("ultra")){
            this.healingAmount = (int)Math.ceil(healingAmount * 2);
        } else if(this.rarity.equalsIgnoreCase("legendary")){
            this.healingAmount = (int)Math.ceil(healingAmount * 1.9);
        }else if(this.rarity.equalsIgnoreCase("rare")){
            this.healingAmount = (int)Math.ceil(healingAmount * 1.8);
        }else if(this.rarity.equalsIgnoreCase("exceptional")){
            this.healingAmount = (int)Math.ceil(healingAmount * 1.6);
        }else if(this.rarity.equalsIgnoreCase("fine")){
            this.healingAmount = (int)Math.ceil(healingAmount * 1.4);
        }else if(this.rarity.equalsIgnoreCase("common")){
            this.healingAmount = (int)Math.ceil(healingAmount * 1.2);
        }else if(this.rarity.equalsIgnoreCase("coarse")){

        }

        this.gpValue = this.healingAmount * 10 ;
    }

    @Override
    public int getGpValue(){return gpValue;}
}

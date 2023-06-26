package textgame;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopKeep extends Automaton{



    protected ArrayList<Item> boughtItems;

    public ShopKeep(String name, Room roomIn, Item... items){
        this.name = name;
        this.hasName = true;
        this.currentRoom = roomIn;
        this.currentRoom.getPeople().add(this);
        this.inventory = new ArrayList<>();
        this.boughtItems = new ArrayList<>();
        for(Item i : items){
            this.inventory.add(i);
        }
    }

    public ArrayList<Item> getBoughtItems() {
        return boughtItems;
    }

    public void shop(Character player){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello. How can I help you today?");
        System.out.println("Buy");
        System.out.println("Sell");
        String response = sc.nextLine();
        if(response.equalsIgnoreCase("buy")){
            this.buy(sc, player);
        }
        if(response.equalsIgnoreCase("sell")){
            this.sell(sc, player);
        }

    }

    public void buy(Scanner sc, Character player){
        String selection;
        System.out.println("What can I get for you?");
        System.out.println("/`^^~~vv.._,_,..vv~Shop~vv..,_,_..vv~~^^`\\");
        System.out.println("|                                        |");
        System.out.println("| Item                               GP  |");
        for(Item i : this.inventory){
            System.out.print("| ");
            System.out.print(i.itemName);
            for (int j = 0; j < (this.invLength - i.getItemName().length()) - 3; j++) {
                System.out.print(".");
            }
            System.out.println(i.gpValue + " |");
        }
        System.out.println("|________________________________________|");
        System.out.println("Your GP: " + player.getGp());
        selection = sc.nextLine();
        for(Item i : this.inventory){
            if(selection.equalsIgnoreCase(i.itemName)){
                System.out.println("Confirm purchase of:");
                System.out.println(i.itemName + " : " + i.gpValue + "GP : y/n");
                if(sc.nextLine().equalsIgnoreCase("y")){
                    player.getInventory().add(i);
                    player.setGp(player.getGp() - i.gpValue);
                }else{
                    System.out.println("Would you like to buy something else? y/n");
                    if(sc.nextLine().equalsIgnoreCase("y")){
                        this.buy(sc, player);
                    }
                }
            }
        }
    }

    public void sell(Scanner sc, Character player){
        String selection;
        System.out.println("What would you like to sell?");
        player.printInv();
        selection = sc.nextLine();
        for(Item i : player.getInventory()){
            if(selection.equalsIgnoreCase(i.getItemName())) {
                System.out.println("Confirm selling of:");
                System.out.println(i.getItemName() + " : " + (int)Math.ceil(i.gpValue * .75) + "GP : y/n");
                if(sc.nextLine().equalsIgnoreCase("y")){
                    player.getInventory().remove(i);
                    player.setGp(player.getGp() + (int)Math.ceil(i.gpValue * .75));

                }
            }
        }
    }

    public void getResponse(String inputString){
        System.out.println("Hello, I am a shopkeep. My name is " + this.name + ".");
    }
}

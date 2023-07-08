package textgame;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.Scanner;

public class Utilities {

    public Utilities(){

    }
    public static void save(Character player){
        try{
            FileOutputStream saveFile = new FileOutputStream( player.getName() + ".ser");
            ObjectOutputStream saveObject = new ObjectOutputStream(saveFile);
            saveObject.writeObject(player);
            saveObject.close();
            System.out.println(player.getName() + "saved successfully!");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static Character load(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type your character name exactly.");
        String name = sc.nextLine();

        try {
            FileInputStream loadInputStream = new FileInputStream(name + ".ser");
            ObjectInputStream loadObjectInputStream = new ObjectInputStream(loadInputStream);
            Character player = (Character) loadObjectInputStream.readObject();
            return player;

        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        return null;

    }
}

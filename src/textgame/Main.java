package textgame;

import textgame.World;

//the main method. Java needs this to run the stuff
//I try to have this do as little as possible and have the classes do all the work

public class Main extends Thread{

    public static void main(String[] args){    
    	World world = new World();
        world.createWorld();
    }
}
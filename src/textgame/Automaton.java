package textgame;

import java.util.ArrayList;
import java.util.Scanner;

public class Automaton extends Character {
	
	protected int autoStoryCount = 0;
	protected boolean following;

	public Automaton(){

	}
	
	public Automaton(String name, String description, Room firstRoom){
		this.name = name;
		this.type = this.typeToString();
		this.description = description;
    	this.hasName = true;
    	this.inventory = new ArrayList<Item>();
    	this.asleep = false;
        this.prone = false;
        this.sitting = false;
        this.standing = true;
        this.currentRoom = firstRoom;
        this.currentRoom.people.add(this);
        
        
        
    }

	public void getResponse(String inputString){
		System.out.println("I am an automaton. My name is " + this.name + ".");
	}


}

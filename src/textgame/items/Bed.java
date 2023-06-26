package textgame.items;

import textgame.Item;
import textgame.Room;

public class Bed extends Item {
	
	
	public Bed(String name, String description, Room room) {
		this.itemName = name;
		this.description = description;
		this.itemId = itemTracker++;
		this.roomIn = room;
		this.takeable = false;
		
		room.getInventory().add(this);
		
		
	}
}

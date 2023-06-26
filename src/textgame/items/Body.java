package textgame.items;

import textgame.Item;
import textgame.Room;

public class Body extends Item {

	public Body(String name, String description, String desc2, Room room) {
		this.itemName = name;
		this.description = description;
		this.closeDescription = desc2;
		this.itemId = itemTracker++;
		this.roomIn = room;
		this.takeable = true;
		
		room.getInventory().add(this);
	}
}

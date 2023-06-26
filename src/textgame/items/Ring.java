package textgame.items;

import textgame.Item;
import textgame.Room;

public class Ring extends Item {

	public Ring(String name, boolean plural, String description, String desc2, Room room) {
		this.itemName = name;
		this.plural = plural;
		this.description = description;
		this.closeDescription = desc2;
		this.itemId = itemTracker++;
		this.roomIn = room;
		this.takeable = true;
		
		room.getInventory().add(this);
	}
}

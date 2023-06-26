package textgame;

public class Key extends Item {

	private Object fits;

	//key just has to be created after the item it locks/unlocks
	public Key(String name, String description, Object fits , Room room) {
		this.itemName = name;
		this.description = description;
		this.itemId = itemTracker++;
		this.roomIn = room;
		this.takeable = true;
		this.fits = fits;
		
		room.getInventory().add(this);
		
		
	}
}

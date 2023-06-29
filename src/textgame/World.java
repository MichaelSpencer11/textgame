package textgame;

import java.util.ArrayList;

import textgame.*;
import textgame.Item;
import textgame.Door;
import textgame.items.*;
import textgame.monsters.*;
import textgame.regions.Cave1;
import textgame.regions.PlayerHome;
import textgame.regions.Region;
import textgame.regions.TsiporimTown;




public class World {
	
	private static ArrayList<Room> globalRoomList = new ArrayList<Room>();
	private static ArrayList<Item> globalItemList = new ArrayList<Item>();
	private static ArrayList<Door> globalDoorList = new ArrayList<Door>();
	private static ArrayList<Character> globalCharacterList = new ArrayList<Character>();
	private static ArrayList<Party> globalPartyList = new ArrayList<Party>();

	public static ArrayList<ShopKeep> getGlobalShopKeepList() {
		return globalShopKeepList;
	}

	private static ArrayList<ShopKeep> globalShopKeepList = new ArrayList<ShopKeep>();

	//regions
	PlayerHome playerHome;
	TsiporimTown tsiporimTown;
	Cave1 cave1;

	public static String aAn(String thing) {
		if(thing.toLowerCase().startsWith("a") ||
		thing.toLowerCase().startsWith("e") ||
		thing.toLowerCase().startsWith("i") ||
		thing.toLowerCase().startsWith("o") ||
		thing.toLowerCase().startsWith("u")) {
		return "an";
		} else return "a";
		}

		public static String capAAn(String thing) {
		if(thing.toLowerCase().startsWith("a") ||
		thing.toLowerCase().startsWith("e") ||
		thing.toLowerCase().startsWith("i") ||
		thing.toLowerCase().startsWith("o") ||
		thing.toLowerCase().startsWith("u")){
		return "An";
		} else return "A";
		}
		
		public static void setAllRoomsUnchecked() {
			
		}

		public static void startThread(Runnable runnable){
			new Thread(() -> {
				
				try {
					runnable.run();
				}
				catch (Exception e){
					System.err.println(e);
				}
			}).start();
		}

		public static void setTimeout2(Runnable runnable){
			new Thread(() -> {
				try {
					runnable.run();
				}
				catch (Exception e){
					System.err.println(e);
				}
			}).start();
		}
		


		//this creates the world and begins the game. This is where you will place all the things to go in the world.
		public void createWorld() {

			//create regions
			System.out.println("Creating regions...");
			playerHome = new PlayerHome(this);
			tsiporimTown = new TsiporimTown(this);
			cave1 = new Cave1(this);

			//link regions
			System.out.println("Linking regions...");
			//playerhome and tsiporim town via front lawn
			playerHome.getSLink().setsRoom(tsiporimTown.getNLink());
			playerHome.getSLink().getAdjacentRooms().add(tsiporimTown.getNLink());
			playerHome.getSLink().setHasS(true);
			tsiporimTown.getNLink().setnRoom(playerHome.getSLink());
			tsiporimTown.getNLink().getAdjacentRooms().add(playerHome.getSLink());
			tsiporimTown.getNLink().setHasN(true);
			//playerhome and tsiporimtown via back alley
			playerHome.getBackyardLink().setnRoom(tsiporimTown.getAlleyLink());
			playerHome.getBackyardLink().getAdjacentRooms().add(tsiporimTown.getAlleyLink());
			playerHome.getBackyardLink().setHasN(true);
			tsiporimTown.getAlleyLink().setsRoom(playerHome.getBackyardLink());
			tsiporimTown.getAlleyLink().getAdjacentRooms().add(playerHome.getBackyardLink());
			tsiporimTown.getAlleyLink().setHasS(true);
			//cave and tsiporimtown via cave entrance
			cave1.getOutLink().setnRoom(tsiporimTown.getCaveLink());
			cave1.getOutLink().getAdjacentRooms().add(tsiporimTown.getCaveLink());
			cave1.getOutLink().setHasN(true);
			tsiporimTown.getCaveLink().setsRoom(cave1.getOutLink());
			tsiporimTown.getCaveLink().getAdjacentRooms().add(cave1.getOutLink());
			tsiporimTown.getCaveLink().setHasS(true);

		    Input input = new Input(playerHome.getPlayer());
		    input.input();
}
		
		public World(){}

		public ArrayList<Room> getGlobalRoomList(){
			return globalRoomList;
		}
		
		public ArrayList<Item> getGlobalItemList(){
			return globalItemList;
		}
		
		public ArrayList<Door> getGlobalDoorList() {
			return globalDoorList;
		}

		public static ArrayList<Character> getGlobalCharacterList(){
			return globalCharacterList;
		}

		public static ArrayList<Party> getGlobalPartyList(){
			return globalPartyList;
		}
		
		public static void addRoomToGlobalRoomList(Room room) {
			globalRoomList.add(room);
		}
		
		public static void addItemToGlobalItemList(Item item) {
			globalItemList.add(item);
		}
		
		public static void addDoorToGlobalDoorList(Door door) {
			globalDoorList.add(door);
		}

		public void linkRegions(Room room1, Room room2){
			
		}
		
}		

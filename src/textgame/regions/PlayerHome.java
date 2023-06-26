package textgame.regions;

import textgame.Door;
import textgame.Familiar;
import textgame.Key;
import textgame.Monster;
import textgame.Room;
import textgame.World;
import textgame.items.Bed;
import textgame.items.Desk;
import textgame.Automaton;
import textgame.Character;
import textgame.monsters.Commander;
import textgame.monsters.Leafer;
import textgame.monsters.SandRay;
import textgame.monsters.WereRat;


public class PlayerHome extends Region {


    Character player;
    Room sLink;
	Room backyardLink;
    
	
    public PlayerHome(){}

    public PlayerHome(World world){
    Room room = new Room("interior", "Your room","This is your room. Your twin size bed is against one wall. Your desk is against another. There is a black computer monitor, a keyboard and a mouse on the desk.", null, null, null, null, null, null, null, null, null, null);
	Bed yourBed = new Bed("bed", "A basic twin four post bed. It is a little squeaky but pretty comfortable.", room);
	Room playerCloset = new Room("interior", "Your closet","Your walk-in closet. There are clothes hanging up in the closet and some on the floor neatly placed under the racks.", null, null, room, null, null, null, null, null, null, null);
	Door closetDoor = new Door("east", "locked", playerCloset);
	Key closetDoorKey = new Key("closet door key", "A small door key", closetDoor, playerCloset);
    Room hallwayStairs = new Room("interior", "The hallway stairs","The upstairs hallway in your home. There is a stairway here that goes down.", room, null, null,null,null,null,null,null,null,null);
	Room hallway = new Room("interior", "A hallway","The upstairs hallway in your house. There is a bannister next to the staircase and a way to the bathroom and your parents' room.", null, null, null, null, null, null, hallwayStairs, null, null, null);
	Room bathroom = new Room("interior", "A bathroom" ,"The upstairs bathroom in your house. There is a large garden tub, a toilet and a sink. The room is decorated in floral drapes and leafy brown towels.", null, null, null, null, hallway, null, null, null, null, null);
    Room parentsRoom = new Room("interior", "Your parents' room","Your parents' master bedroom. There is a king size bed with end tables and a dresser.", null, null, null, null, null, null, hallway, null, null, null);
	Room stairway = new Room("interior", "A stairway", "The bottom of the stairway at your house. The stairs are carpeted with a thick woolish material and are alternating tan and brown. The kitchen is to the north and the living room is to the east.", null, null, null, null, null, null, null, null, hallwayStairs, null);
	Room kitchen = new Room("interior", "The kitchen", "The kitchen looks modern, with muted colors for cabinets and a slate grey backsplash. There is also a kitchen island. The dining room is to the east and the stairway is to the south.", null, null, null, null, stairway, null, null, null, null, null);
	Room livingRoom = new Room("interior", "The living room", "The living room feels very comfortable, with couches and pillows and blankets. Potted plants line the walls and windows. There is a lot of light in the room. ", null, null, null, null, null, null, stairway, null, null, null);
	Room diningRoom = new Room("interior", "The dining room", "An oakwood dinner table is in the center of the room, surrounded by four folding chairs.", null, null, null, null, livingRoom, null, kitchen, null, null, null );
	Room garage = new Room("interior", "The garage", "The family car is in here, as well as some storage containers.", null, null, null, null, null, null, livingRoom, null, null, null);
	Room frontLawn = new Room("grass", "The front Lawn", "The lawn is overgrown and looks like it hasn't been taken care of in ages.", livingRoom, null, null, null, null, null, null, null, null, null);
	Room backyard = new Room("grass", "The backyard","The backyard of your childhood home, its got green grass freshly cut.",null,null,null,null,diningRoom,null,null,null,null,null);
	
	//Item practiceStaff = new Weapon("wooden staff", "A wooden practice staff. It has a few nicks and cuts in it and is quite worn.", "The staff feels as heavy as a metal staff in your hand, but it is still made out of wood.", playerCloset);
	//Item practicesword = new Weapon("wooden sword", "A wooden practice sword. It has a few nicks and cuts in it and is quite worn.", "The sword feels as heavy as a metal sword in your hand, but it is still made out of wood.", playerCloset);
	Desk desk = new Desk("desk", "Your wooden desk in your room. It has a few nicks in the finish but is very sturdy.", room);
	player = new Character(room);
	
    Character familiar = new Familiar("Someone is standing or floating here, it is very hard to see them, they are almost not there but you know that there is definitely a presence here.", room, player);
	Character automaton = new Automaton("Incom","An ordinary looking automaton with mechanical limbs and a rudimentary programmed action stack. It is currently sitting in a corner non-functionally." , room);
	Monster l1 = new Monster("l2",2,3000,hallwayStairs);
	Monster l10 = new Monster("l10", 10,3000,hallwayStairs);
	Monster l20 = new Monster("l20",20,3000,hallwayStairs);
	Monster l30 = new Monster("l30", 30,3000,hallwayStairs);
	Monster l40 = new Monster("l40",40,3000,hallwayStairs);
	Monster l50 = new Monster("l50", 50, 3000,hallwayStairs);
	Monster l60 = new Monster("l60",60,3000,hallwayStairs);
	Monster l70 = new Monster("l70",70,3000,hallwayStairs);
	Monster l80 = new Monster("l80", 80, 3000,hallwayStairs);
	Monster l90 = new Monster("l90", 90,3000,hallwayStairs);
	Monster l100 = new Monster("l100",100,3000, hallwayStairs);
	//Monster commander = new Commander(livingRoom, frontLawn);
    sLink = frontLawn;
	backyardLink = backyard;
    }

    public Character getPlayer() {
        return player;
    }

    public Room getSLink(){
        return sLink;
    }

	public Room getBackyardLink(){
		return backyardLink;
	}

}

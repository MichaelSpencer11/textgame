package textgame.regions;

import textgame.Monster;
import textgame.Room;
import textgame.World;

public class Cave1 extends Region {

    Room outLink;

    public Cave1(World world){
        
        Room insideCave = new Room("interior", "Just inside the cave", "This is the cave entrance. You can see light coming from the outside, and fainter lights coming from further in. The slight smell of smoke is present.",null,null,null,null,null,null,null,null,null,null);
        Room room2 = new Room("interior", "Cave with a split path", "The path splits to the southeast and southwest. There is dim light coming from both directions. Signs of scuffling feet can be seen here.",insideCave,null,null,null,null,null,null,null,null,null);
        Monster miner1 = new Monster("X-Zone Miner",2,1000,60000,room2);
        Room room3 = new Room("interior","Cave with campsite","A makeshift camp with a campfire is here.",null,room2,null,null,null,null,null,null,null,null);
        Room room4 = new Room("interior","Cave with torches on wall","The tunnel turns slightly here and slopes slightly down.",null,null,room3,null,null,null,null,null,null,null);
        Monster miner2 = new Monster("X-Zone Miner",2,1000,60000,room4);
        Room room5 = new Room("interior","Darker extent of tunnel","The tunnel has no lights in this area and it's harder to see.",null,room4,null,null,null,null,null,null,null,null);
        Room room6 = new Room("interior","Cave with light seeping in from above","There are sparse rays of light creeping in from above.",null,room5,null,null,null,null,null,null,null,null);
        Monster miner3 = new Monster("X-Zone Miner",2,1000,60000,room6);
        Room room7 = new Room("interior","Cave with campfire","The burning smell of charred meat is here, and there is a weapon rack in the far side.",null,null,null,null,null,null,null,room2,null,null);
        Monster miner4 = new Monster("X-Zone Miner",2,1000,60000,room7);
        Room room8 = new Room("interior","Garbage room","This seems to a garbage room, detritus is strewn about the room.",null,null,null,null,null,null,null,room7,null,null);
        Room room9 = new Room("interior","Another garbage room","Lots of garbage is just thrown in random places and in corners of this part of the cave.",room8,null,null,null,null,null,null,null,null,null);
        Monster miner5 = new Monster("X-Zone Miner",2,1000,60000,room9);
        Room room10 = new Room("interior","Burn pit","It looks like they tried to throw garbage in a burn pit at the side of the room, a bunch of burnt garbage is piled up and the acrid smell is permeating.",room9,null,null,null,null,null,null,null,null,null);
        Monster miner6 = new Monster("X-Zone Miner",2,1000,60000,room10);
        Room room11 = new Room("internal","Command tent", "A tan command tent takes up this whole area of the cave, there is a table with maps on it.",null,null,room10,null,null,null,null,null,null,null);
        Room room12 = new Room("interior","Empty tunnel", "This portion of the tunnel is empty, just rocks and dirt.",null,room11,null,null,null,null,null,null,null,null);
        Monster heavyMiner1 = new Monster("X-Zone Heavy Miner",3,1000,60000,room11,room12);//blocking monster
        Room room13 = new Room("interior","Waterfall cave northeast", "There is a large waterfall in the center of this chamber. This is the upper section in the northeast corner.",null,room12,null,null,null,null,null,null,null,null);
        Monster heavyMiner2 = new Monster("X-Zone Heavy Miner",3,1000,60000,room13);
        Room room14 = new Room("interior", "On top of waterfall", "The water is flowing here into the center of the chamber from a hole in the rock to the south.",null,null,room13,null,null,null,null,null,null,null);
        Room room15 = new Room("interior","Waterfall northwest corner","The northwest corner part of the waterfall. There are some bones piled up in the corner.",null,null,room14,null,null,null,null,null,null,null);
        Monster heavyMiner3 = new Monster("X-Zone Heavy Miner",3,1000,60000,room15);
        Room room16 = new Room("interior","Waterfall west side", "The west side of the waterfall chamber slopes down gently.",room15,null,null,null,null,null,null,null,null,null);
        Monster heavyMiner4 = new Monster("X-Zone Heavy Miner",3,1000,60000,room16);
        Room room17 = new Room("interior","Southwest waterfall chamber","The slope flattens out and ends at the southern wall of the waterfall chamber.",room16,null,null,null,null,null,null,null,null,null);
        Room room18 = new Room("interior","Waterfall room south","The ground is dry here despite all the water pouring into the chamber.",null,null,null,null,null,null,room17,null,null,null);
        Monster heavyMiner5 = new Monster("X-Zone Heavy Miner",3,1000,60000,room18);
        Room room19 = new Room("interior","Waterfall pool", "The water drops into a large pool here. There doesn't seem to be a visible exit for the water.",null,null,null,null,room18,null,null,null,null,null);
        Room room20 = new Room("interior","Southeast corner waterfall room","The ground slopes up to the north.",null,null,null,null,null,null,room18,null,null,null);
        Room room21 = new Room("interior","West waterfall area", "A ladder connects this area to the top the landing.",null,null,null,null,room20,null,null,null,room13,null);
        Monster heavyMiner6 = new Monster("X-Zone Heavy Miner",3,1000,60000,room21);
        Room room22 = new Room("interior","Tented area","Several tents are set up here, probably for housing. Torches light from the walls.",null,null,null,null,null,null,null,room10,null,null);
        Room room23 = new Room("interior","Campfire area", "A few campfires are seen in this part of the cave.",room22,null,null,null,null,null,null,null,null,null);
        Monster brute1 = new Monster("X-Zone Brute",4,1000,60000,room22,room23);//blocking monster
        Room room24 = new Room("interior","Forked cave section","The cave splits off southwest and southeast here.",room23,null,null,null,null,null,null,null,null,null);
        Monster brute2 = new Monster("X-Zone Brute",4,1000,60000,room24);
        Room room25 = new Room("interior","Wet room","Water is dripping down from the ceiling making the floor wet here.",null,room24,null,null,null,null,null,null,null,null);
        Room room26 = new Room("interior","Dead end","The cave abruptly ends here with a bare wall.",room25,null,null,null,null,null,null,null,null,null);
        Monster brute3 = new Monster("X-Zone Brute",4,1000,60000,room26);
        Room room27 = new Room("interior","Framed area", "The cave narrows here and is framed with wooden logs for stability.",null,null,null,null,null,null,null,room24,null,null);
        Monster brute4 = new Monster("X-Zone Brute",4,1000,60000,room27);
        Room room28 = new Room("interior","Narrow space","The cave considerably narrows here to a meter or so wide.",room27,null,null,null,null,null,null,null,null,null);
        Room room29 = new Room("interior","Bare area", "This area is devoid of objects, just bare rock.",room28,null,null,null,null,null,null,null,null,null);
        Monster guard1 = new Monster("X-Zone Guard",5,1000,60000,room28,room29);
        Monster guard2 = new Monster("X-Zone Guard",5,1000,60000,room29);
        Room room30 = new Room("interior","Reinforced room", "This area is reinforced by wooden planks, and there are crumbly rocks on the ground.",null,null,room29,null,null,null,null,null,null,null);
        Monster guard3 = new Monster("X-Zone Guard",5,1000,60000,room30);
        Room room31 = new Room("interior","Area with a mushroom","A little brown mushroom is growing in the dirt at the side of the room.",null,null,room30,null,null,null,null,null,null,null);
        Monster guard4 = new Monster("X-Zone Guard",5,1000,60000,room31);
        Room room32 = new Room("interior","Area with camp","There are a few tents a a fire set up in this area. A few half-eaten mushrooms are found here.",null,null,room31,null,null,null,null,null,null,null);
        Room room33 = new Room("interior","Rock and dirt room", "An empty room with rock walls and dirt floor.",null,null,room32,null,null,null,null,null,null,null);
        Room room34 = new Room("interior","Thicker mushroom area","There are a few mushrooms growing here in the dirt, and there is a wooden trapdoor going down.",null,null,room33,null,null,null,null,null,null,null);
        Monster captain = new Monster("X-Zone Captain",6,1000,60000,room33,room34);



        outLink = insideCave;

    }

    public Room getOutLink(){return outLink;}
    
}

package textgame.regions;

import textgame.Room;
import textgame.World;

public class Cave1 extends Region {

    Room outLink;

    public Cave1(World world){
        
        Room insideCave = new Room("interior", "Just inside the cave", "This is the cave entrance. You can see light coming from the outside, and fainter lights coming from further in.",null,null,null,null,null,null,null,null,null,null);
        


        outLink = insideCave;

    }

    public Room getOutLink(){return outLink;}
    
}

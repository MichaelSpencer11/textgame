package textgame.battle;

import textgame.World;

public class BattleTimeCounter {
 

    public static long btCounter = 0;
    public BattleTimeCounter(Battle battleContext){
        
    }

    public void startCounter(){
        while(true){
           // World.setTimeout(() -> incrementBattleTimeCounter(), 33 );
        }
    }

    public static void incrementBattleTimeCounter() {
        btCounter++;
    }


}

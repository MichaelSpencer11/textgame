package textgame;

public class Random {

    public static int roll(double low, double high){
        return (int)Math.floor(Math.random() * ((high - low) + 1) + low);
    }
}

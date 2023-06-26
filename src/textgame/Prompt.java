package textgame;

public class Prompt implements Runnable {

    Thread p = new Thread(this, "promptThread");

    public void run(){
        try {
            while(true) {
                System.out.print(ConsoleColors.GREEN + ">");
                Thread.sleep(200);
                System.out.print(">");
                Thread.sleep(200);
                System.out.print(">");
                Thread.sleep(200);
                System.out.print("\b\b\b");
                Thread.sleep(200);
            }
        }catch(InterruptedException ie){
            System.out.println(ie.getMessage());
        }
    }
}

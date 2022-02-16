package JavaClasses.Thread;

public class ThreadAmoundWhile extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        ThreadAmoundWhile obj = new ThreadAmoundWhile();
        obj.start();

        while (obj.isAlive()){
            System.out.print("Kuting... ");
        }
        System.out.println("MAin: " + amount);
        amount++;
        System.out.println("MAin: " + amount);
        amount++;
        System.out.println("MAin: " + amount);
    }
    public void run(){
        amount++;
    }

}

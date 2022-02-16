package JavaClasses.Thread;

public class AmauntThread extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        //
        AmauntThread objthread = new AmauntThread();
        objthread.start();

        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    public void run(){
        amount++;
    }
}

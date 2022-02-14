package JavaClasses.Thread;

public class ThreadMain extends Thread {
    public static void main(String[] args) {
        //
        ThreadMain Thread = new ThreadMain();
        Thread.start();
        System.out.println("Bu kod mavzudan tashqarida");
    }
    public void run() {
        System.out.println("Ushbu kod ish zarrachasida ishlamoqda");
    }
}

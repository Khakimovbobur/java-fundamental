package JavaClasses.For;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class ForMasala35 {
    public static void main(String[] args) {
        //
        Scanner obj = new Scanner(System.in);

        System.out.print("a: ");
        int a = obj.nextInt();

        double s = 0;
        for (int i=1; i<=Math.pow(a,a); i++){
            s=s+Math.pow(i,-1);
            if (s>a){
                System.out.println("n="+i); break;
            }
        }
        System.out.println("s="+s);
    }
}

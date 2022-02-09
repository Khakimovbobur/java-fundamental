package JavaClasses.AylanaKvadrat;

import java.util.Scanner;

public class Class22 {
    public static void main(String[] args) {
        //
        Scanner obj1 = new Scanner(System.in);

        System.out.print("r= ");
        int R = obj1.nextInt();

        System.out.print("a= ");
        int A = obj1.nextInt();

        System.out.print("b= ");
        int B = obj1.nextInt();

        System.out.print("p= ");
        int P = obj1.nextInt();

        System.out.print("q= ");
        int Q = obj1.nextInt();

        Methodlar obj2 = new Methodlar();
        obj2.Kvaylana(R,A,B,P,Q);
    }
}

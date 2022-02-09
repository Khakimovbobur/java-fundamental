package JavaClasses.Summ1;

import java.util.Scanner;

public class SumClass {
    public static void main(String[] args) {
        //
        Scanner obj = new Scanner(System.in);

        System.out.println("A= ");
        int A = obj.nextInt();

        System.out.println("B= ");
        int B = obj.nextInt();

        System.out.println(SumAttribut.plus(A,B));
    }

}

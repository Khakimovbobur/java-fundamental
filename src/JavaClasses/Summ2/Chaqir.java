package JavaClasses.Summ2;

import java.util.Scanner;

public class Chaqir {
    public static void main(String[] args) {
        //
        Scanner obj = new Scanner(System.in);

        System.out.println("A= ");
        int A = obj.nextInt();

        System.out.println("B= ");
        int B = obj.nextInt();

        SumFun.Yigindi(A,B);
    }
}

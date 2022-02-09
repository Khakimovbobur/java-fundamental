package JavaDarslik;

import java.util.Scanner;

public class SumMethod {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);

        System.out.print("a= ");
        int A1 = scanner.nextInt();

        System.out.print("b= ");
        int B1 = scanner.nextInt();

        SumMethod sumMethod = new SumMethod();
        SumMethod.Sumyigindi(A1, B1);
    }

    public static void Sumyigindi(int a, int b){

        int sum = a + b;
        System.out.println("yig'ingi "+sum);
    }
}

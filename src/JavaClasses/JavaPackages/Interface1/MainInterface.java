package JavaClasses.JavaPackages.Interface1;

import java.util.Scanner;

public class MainInterface {
    //
    public static void main(String[] args) {
        InterfeceBody obj = new InterfeceBody();

        Scanner obj1 = new Scanner(System.in);

        System.out.println("A =");
        int A = obj1.nextInt();

        System.out.println("B =");
        int B = obj1.nextInt();

        obj.Method1();
        obj.Method2();

        obj.Summ(A,B);
    }
}

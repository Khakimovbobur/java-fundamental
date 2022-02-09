package JavaClasses.Polindron;

import java.util.Scanner;

public class ClasspolindronMenthod {
    public static void main(String[] args) {
       //
        Scanner A = new Scanner(System.in);

        System.out.println("N");
        int son = A.nextInt();

        Classpolindron obj1 = new Classpolindron();
        obj1.Polindron(son);
    }
}

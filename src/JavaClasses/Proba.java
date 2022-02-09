package JavaClasses;

import java.util.Scanner;

public class Proba {
    //
    int x = 4;

    public static void main(String[] args) {

        Scanner b = new Scanner(System.in);

        System.out.print("hh  ");
        int B = b.nextInt();

        System.out.println(B+4);

        Proba obj = new Proba();
        System.out.println(obj.x);
    }
}

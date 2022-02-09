package JavaDarslik;

import java.util.Scanner;

public class Shaxmat2 {
    public static void main(String[] args) {
        //1ruhPoint();

        Scanner scanner = new Scanner(System.in);

        System.out.print("X1= ");
        int x1 = scanner.nextInt();

        System.out.print("y1= ");
        int y1 = scanner.nextInt();

        System.out.print("X2 = ");
        int x2 = scanner.nextInt();

        System.out.print("y2 = ");
        int y2 = scanner.nextInt();

        Shaxmat2 Shaxmat2 = new Shaxmat2();
        Shaxmat2.ruhPoint(x1, x2, y1, y2);
    }

    public static void ruhPoint(int x1,int x2, int y1, int y2) {

        //int x1 = 1, y1 = 1; // 1- nuqta
       // int x2 = 7, y2 = 3; // 2- nuqta

        if (x1 == x2 || y2 == y1) {
            if (x1 == x2) {
                for (int i = y1; i <= y2; i++) {
                    System.out.print(x1 + "  ");
                    System.out.println(i);
                }
            }
            if (y1 > y2) {
                for (int i = y1; y2 <= i; i--) {
                    System.out.print(x2 + " ");
                    System.out.println(i);
                }
            }
            //
            if (x1 > x2) {
                for (int i = x1; x2 <= i; i--) {
                    System.out.print(i + " ");
                    System.out.println(y2);
                }
            }
            if (y1 == y2) {
                for (int i = x1; i <= x2; i++) {
                    System.out.print(i + " ");
                    System.out.println(y1);
                }
            }
        } else {
            for (int i = x1; i <= x2; i++) {
                System.out.print(i + " ");
                System.out.println(y1);
            }
            for (int j = y1 + 1; j <= y2; j++) {
                System.out.print(x2 + " ");
                System.out.println(j);
            }
        }

    }
}

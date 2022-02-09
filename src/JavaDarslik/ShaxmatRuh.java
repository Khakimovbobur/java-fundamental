package JavaDarslik;

import java.util.Scanner;
/* Shaxmat taxtasidagi maydonlar sakkizdan katta bo„lmagan sonlar juftligi bilan aniqlanadi: birinchi son
shaxmat taxtasi maydonining vertikal nomeri (chapdan o„nga), ikkinchsi – gorizontal nomeri (pastdan
yuqoriga). Sakkizdan katta bo„lmagan k, l, m va n sonlari berilgan. Quyidagi masalalar yechilsin:
a) (k,l) maydonidagi ruh bir yurishda (m,n) maydoniga o„tishi mumkinmi? Agar mumkin bo„lmasa, 7
ikkita yurishda o„tish yo„llari ko„rsatilsin;
b) (k,l) maydonidagi farzin bir yurishda (m,n) maydoniga o„tishi mumkinmi? Agar mumkin bo„lmasa,
ikkita yurishda o„tish yo„llari ko„rsatilsin. */

public class ShaxmatRuh {

    public static void main(String[] args) {
        //
        //ruh();
        // fil();

        Scanner scanner = new Scanner(System.in);

        System.out.print("X1= ");
        int x1 = scanner.nextInt();

        System.out.println("X2 = ");
        int x2 = scanner.nextInt();

        System.out.print("y1= ");
        int y1 = scanner.nextInt();

        System.out.println("y2 = ");
        int y2 = scanner.nextInt();

        //ruhPoint();
        ShaxmatRuh shaxmatRuh = new ShaxmatRuh();
        shaxmatRuh.test(x1, x2);
        shaxmatRuh.ruhPoint(x1, x2, y1, y2);

    }

    public void test(int x1, int x2){
        int s = x1 + x2;
        System.out.println("Summa = " + s);
    }
    public static void ruhPoint(int x1, int x2, int y1, int y2) {

//        int x1 = 1, y1 = 1; // 1- nuqta
//        int x2 = 7, y2 = 3; // 2- nuqta

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

    //
//    public static void fil() {
//        int x1 = 2, y1 = 1, Y = y1 - 1; // 1- nuqta
//        int x2 = 5, y2 = 5;         // 2- nuqta
//
//        if (x2 >= y2) {
//            for (int i = x1; i <= x2; i++) {
//                Y++;
//                System.out.println(i + "  " + Y);
//            }
//
//        }
//       /* if (y2>x2){
//            for (int j=Y; j<=y2; j++){
//                System.out.println(Y+"  "+j);
//            }
//        } else {
//            for (int j=Y; j<=x2; j++){
//                System.out.println(j+"  "+Y);
//            }
//        }*/
//    }

}

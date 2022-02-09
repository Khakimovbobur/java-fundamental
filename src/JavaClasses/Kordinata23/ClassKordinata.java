package JavaClasses.Kordinata23;

import java.util.Scanner;

public class ClassKordinata {
    //
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);

        System.out.print("X11=  ");
        int X11 = obj1.nextInt();

        System.out.print("Y11=  ");
        int Y11 = obj1.nextInt();

        System.out.print("X12=  ");
        int X12 = obj1.nextInt();

        System.out.print("Y12=  ");
        int Y12 = obj1.nextInt();
        //
        System.out.print("X21=  ");
        int X21 = obj1.nextInt();

        System.out.print("Y21=  ");
        int Y21 = obj1.nextInt();

        System.out.print("X22=  ");
        int X22 = obj1.nextInt();

        System.out.print("Y22=  ");
        int Y22 = obj1.nextInt();

        MethodKordinata obj2= new MethodKordinata();
        obj2.Kordinata(X11, Y11,X12,Y12, X21, Y21,X22,Y22);

    }
}

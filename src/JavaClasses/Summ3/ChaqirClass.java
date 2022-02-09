package JavaClasses.Summ3;

import java.util.Scanner;

public class ChaqirClass {
    //
    public static void main(String[] args) {
        //
        Scanner obj = new Scanner(System.in);

        System.out.println("A ni kiriting :");
        int A = obj.nextInt();

        System.out.println("B ni kiriting :");
        int B = obj.nextInt();

        ClassTanasi.methodif(A, B);
        ClassTanasi.methodfor(A);

        ClassTanasi obj1 = new ClassTanasi();
        obj1.yess(8);
    }
}

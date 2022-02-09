package JavaDarslik;

import java.util.Scanner;

public class Ifmasala18 {
    public static void main(String[] args) {
        //
        //int a1= 8, a2=2, a3=2, a4=2;

        Scanner obj= new Scanner(System.in);

        System.out.print("a1= ");
        int a1 = obj.nextInt();
        System.out.print("a2= ");
        int a2 = obj.nextInt();
        System.out.print("a3= ");
        int a3 = obj.nextInt();
        System.out.print("a4= ");
        int a4 = obj.nextInt();

        if ((a1==a2 && a1==a3)){
            System.out.println("4");
        }
        if ((a1==a4 && a1==a2)){
            System.out.println("3");
        }
        if ((a1==a2 && a1==a4)){
            System.out.println("2");
        }
        if ((a3==a2 && a4==a3)){
            System.out.println("1");
        }
    }
}

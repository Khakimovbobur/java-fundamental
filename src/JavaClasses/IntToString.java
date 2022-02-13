package JavaClasses;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        //
//        Integer myInt = 123456789; 123
//        String myString = myInt.toString();
//        System.out.println(myString.length());

        Scanner obj = new Scanner(System.in);
        System.out.println("Sonni kititing: ");

        Integer son = obj.nextInt();

        String stson = son.toString();
        int sonuzunligi= stson.length();

        for (int i=0; i<sonuzunligi; i++){
            int p=son;
            int s=0; s=s+p%10;
            int q=p/10;
            p=q;
            System.out.println(s);
        }

    }
}

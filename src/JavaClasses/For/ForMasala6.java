package JavaClasses.For;

import java.util.Scanner;

public class ForMasala6 {
    public static void main(String[] args) {        // TUGAMAGANNNNNNNNNNNNNNNNNNNNNNNN!!!!!!!!!!!
        //
        Scanner obj = new Scanner(System.in);

        System.out.println("n: ");
        int n= obj.nextInt();

        int s=0;
        for (int i=n; i>1; i--){
            s=i%2;
            System.out.print(s);
        }
    }
}

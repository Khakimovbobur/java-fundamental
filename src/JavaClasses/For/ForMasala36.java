package JavaClasses.For;

import java.util.Scanner;

public class ForMasala36 {
    public static void main(String[] args) {
        //
        Scanner obj = new Scanner(System.in);

        System.out.println("a: ");
        int a = obj.nextInt();
        int A = String.valueOf(a).length();
        int s=0;

        for (int i=0; i<A; i++){
            s=s+a%10;
            a=a/10;
        }

        System.out.println(s);
    }
}

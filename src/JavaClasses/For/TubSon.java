package JavaClasses.For;

import java.util.Scanner;

public class TubSon {
    public static void main(String[] args) {
        //
        Scanner obj = new Scanner(System.in);

        System.out.println("n: ");
        int n = obj.nextInt();
        tashqi:
        for (int i=2; i<n; i++){
            for (int j=2; j<i; j++)
                if (i%j==0) continue tashqi;
                System.out.printf("%d,",i);
        }
    }
}

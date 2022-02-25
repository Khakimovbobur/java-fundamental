package JavaClasses.For;

import java.util.Scanner;

public class ForMasala3 {
    public static void main(String[] args) {
        //
        Scanner obj = new Scanner(System.in);

        System.out.println("n: ");
        int N = obj.nextInt();

        System.out.println("m: ");
        int M = obj.nextInt();

        int p=1;
        int s=0;

        for (int i=1; i<=N; i++){
            for (int j=0; j<M; j++){

                p=p*(i+j);
            }
             s=s+p;

        }
        System.out.println(s);
    }
}

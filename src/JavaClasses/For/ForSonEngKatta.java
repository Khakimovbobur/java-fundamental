package JavaClasses.For;
import java.util.Scanner;

public class ForSonEngKatta {
    //
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Kiritiladigan sonlar miqdorini kiriting: ");
        int n= obj.nextInt();

        int[] N = new int[n];

        for (int i=0; i<N.length; i++){
            N[i] = obj.nextInt();
        }
        //
        for (int i=0; i<N.length; i++){
            System.out.println(N[i]);
        }
        int EngKatta = N[0];
        for (int i=0; i<N.length; i++){
            if (EngKatta<N[i]){
                EngKatta=N[i];
            }
        }
        System.out.println("Eng katta qiymat: "+EngKatta);
    }
}

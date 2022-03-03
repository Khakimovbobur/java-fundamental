package JavaClasses.For;
import java.util.Scanner;

public class ForMasala34 {
    public static void main(String[] args) {
        //                                  TUGAMADiiiiiiiii
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int nsoni = scanner.nextInt();

        //String dummy = scanner.nextLine();
        int[] x = new int[nsoni];
        int[] y = new int[nsoni];
        //
        int l=(nsoni*(nsoni-3)/2)+nsoni;
        System.out.print("l: "+l);
        int[] H = new int[l];
        //
        System.out.println(" Kordinatadan " + nsoni + " ta nuqtani kiriting");

        for (int i=0; i<x.length; i++){
            System.out.print("X" + (i+1) + ": ");
            x[i] = scanner.nextInt();
            System.out.print("Y" + (i+1) + ": ");
            y[i] = scanner.nextInt();
        }

//        int l=(nsoni*(nsoni-3)/2)+nsoni;
//        System.out.print("l: "+l);

        //
        for (int i=0;i<x.length;i++){
            for (int j=i+1; j<x.length; j++){
                double s = 0;
                s=Math.sqrt(Math.pow((x[i]-x[j]),2)+Math.pow((y[i]-y[j]),2));
                System.out.println(s);
            }
        }
        //
        System.out.println("Kiritilgan nuqtalar: ");
        for (int i=0; i<x.length; i++){
            System.out.print("\nX"+(i+1)+"="+x[i]);
            System.out.print("\nY"+(i+1)+"="+y[i]+ "  ");
        }
        //
//        int Engkattaqiymat = H[0];
//        for (int i=0;i<l;i++){
//            H[i] = s;
//            if (Engkattaqiymat<H[i]){
//                Engkattaqiymat=H[i];
//            }
//        }
//        System.out.println("Eng katta qiymat: "+EngKatta);
    }
}


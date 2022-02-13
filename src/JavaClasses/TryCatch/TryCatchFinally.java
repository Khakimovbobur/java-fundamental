package JavaClasses.TryCatch;

import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        //
        try {
            int [] A={4,5,8,6,5,8};
            Scanner obj = new Scanner(System.in);

            System.out.println("Son kiriting: ");
            int son = obj.nextInt();

            System.out.println(A[son]);
        } catch (Exception a){
            System.out.println("Xato son kiritldi");
        }finally {
            System.out.println("TUGADI");
        }

    }
}

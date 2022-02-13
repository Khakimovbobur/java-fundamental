package JavaClasses.TryCatch;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int [] number={5,6,8,9};
            Scanner i = new Scanner(System.in);
            System.out.println("Son kiriting: ");
            int a= i.nextInt();
        System.out.println(number[a]);
        } catch (Exception e){
            System.out.println("Nimadir noto'g'ri bajarildi");
        }
    }
}

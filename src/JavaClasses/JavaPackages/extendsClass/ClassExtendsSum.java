package JavaClasses.JavaPackages.extendsClass;

import java.util.Scanner;

public class ClassExtendsSum extends ClassExtendsMethods {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);

        System.out.print("A= ");
        int A = scanner.nextInt();

        System.out.print("B= ");
        int B = scanner.nextInt();

        ClassExtendsMethods.Summ(A,B);

        ClassExtendsSum obj = new ClassExtendsSum();
        obj.Summ1(A,B);

    }
}

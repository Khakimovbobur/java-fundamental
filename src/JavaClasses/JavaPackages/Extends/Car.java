package JavaClasses.JavaPackages.Extends;

import java.util.Scanner;

public class Car extends UzAvto {
    private String modelName = "Nexia3";
    private String modelColor = "while";
    private int kg = 1500;

    public static void main(String[] args) {
        //
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("A= ");
//        int A = scanner.nextInt();
//
//        System.out.println("B= ");
//        int B = scanner.nextInt();
//
//        UzAvto.Summ(A,B);

        Car obj = new Car();
        obj.GMmethod();

        System.out.println(obj.brend +"  "+obj.modelName);
        System.out.println(obj.color+"  "+obj.modelColor);
        System.out.println(obj.weight+"  "+obj.kg+" kg");


    }
}

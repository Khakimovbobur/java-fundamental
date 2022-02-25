package JavaClasses.Array.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListFor {
    public static void main(String[] args) {
        //

        ArrayList obj = new ArrayList<>();

        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add("D");

        for (int i=0; i< obj.size(); i++){
            System.out.println(obj.get(i));
        }

        //
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("A1");
        cars.add("B1");
        cars.add("C1");
        cars.add("D1");

        for (String i: cars ){
            System.out.println(i);
        }
        //
        ArrayList<String> cars1 = new ArrayList<String>();

        cars1.add("SA1");
        cars1.add("QB1");
        cars1.add("C1");
        cars1.add("AD1");
        Collections.sort(cars1); // alfabit bo'yicha ytartiblab beradi
        System.out.println("  ");
        for (String i: cars1 ){
            System.out.println(i);
        }

        //
        System.out.println("");
        ArrayList<Integer> objint = new ArrayList<Integer>();

        objint.add(45);
        objint.add(5);
        objint.add(47);
        objint.add(2);
        objint.add(99);
        Collections.sort(objint);

        for (int i: objint){
            System.out.println(i);
        }
    }
}

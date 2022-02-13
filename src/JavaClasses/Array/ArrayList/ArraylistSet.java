package JavaClasses.Array.ArrayList;

import java.util.ArrayList;

public class ArraylistSet {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList<>();

        obj.add("A");
        obj.add("B");
        obj.set(0,"D");
        obj.add("E");
        obj.set(2,"C");
        obj.add("F");
        System.out.println(obj);
        //
        ArrayList obj1 = new ArrayList();

        obj1.add("C");
        obj1.add("D");
        obj1.add("A");
        obj1.add("B");
        obj1.remove(1);// D ni o'chiradi
        System.out.println(obj1);
        //
        ArrayList obj2 = new ArrayList<>();

        obj2.add("C");
        obj2.add("D");
        obj2.add("A");
        obj2.add("B");
        obj2.clear(); // tozalaydi
        System.out.println(obj2);
        //
        ArrayList obj3 = new ArrayList<>();

        obj3.add("C");
        obj3.add("D");
        obj3.add("A");
        obj3.add("B");
        System.out.println(obj3.size()); // sonini chiqarib beradi
    }
}

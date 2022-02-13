package JavaClasses.Array.ArrayLinked;

import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        //
        LinkedList obj = new LinkedList<>();

        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.addFirst("ABS");
        obj.addLast("BOSS");

        System.out.println(obj);
    }
}
package JavaClasses.Array.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MainIterator {
    public static void main(String[] args) {
        //
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("A");
        obj.add("B");
        obj.add("C");

        Iterator<String> a = obj.iterator();
        System.out.println(a.next());
    }
}

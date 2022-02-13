package JavaClasses.Array.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorWhile {
    public static void main(String[] args) {
        //
        ArrayList<String> obj = new ArrayList<String>();

        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add("D");
        obj.add("F");

        Iterator<String> it = obj.iterator();
       for (int i=0; i<obj.size(); i++){
           System.out.println(it.next());
       }
    }
}

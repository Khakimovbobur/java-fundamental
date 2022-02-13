package JavaClasses.Array.Hash;

public class HashSet {
    public static void main(String[] args) {
        //
        java.util.HashSet<Integer> obj = new java.util.HashSet<Integer>();

        obj.add(5);
        obj.add(4);
        obj.add(6);
        obj.add(7);

        for (int i=0;i<10;i++){
            if (obj.contains(i)){
                System.out.println(i+"tegishli");
            } else {
                System.out.println(i+"tegishli emas");
            }
        }
    }
}

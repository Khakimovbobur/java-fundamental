package JavaClasses.Array.Hash;

public class HashMap {
    public static void main(String[] args) {
        //
        java.util.HashMap<String,String> davlatPoytaxt = new java.util.HashMap<String,String>();
        davlatPoytaxt.put("Toshkent","Uzb");
        davlatPoytaxt.put("Ostona", "KZ");
        davlatPoytaxt.put("Washngton", "USA");
        System.out.println(davlatPoytaxt);

        java.util.HashMap<String,Integer> odam = new java.util.HashMap<String,Integer>();
        odam.put("Bobur",26);
        odam.put("Azizbek",27);
        odam.put("Shams", 27);

        for (String i: odam.keySet()){
            System.out.println("Ismi: "+i+"ning yoshi "+odam.get(i)+" da");
        }
     }
}

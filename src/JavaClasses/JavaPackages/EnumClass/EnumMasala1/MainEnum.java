package JavaClasses.JavaPackages.EnumClass.EnumMasala1;

public class MainEnum {
    public static void main(String[] args) {
        int d1 = 2019,d2 = 2020;
        boolean t;
        Oy m1,m2;

        m1 = Oy.APR;
        m2 = Oy.MAR;
        System.out.println(m1.compareTo(m2));
        if (m1.ordinal() > m2.ordinal()){
            System.out.println("True");
        }
    }
}

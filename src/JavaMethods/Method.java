package JavaMethods;

public class Method {
    static void Metod1(int code) {
        System.out.println("ddwd" +" " + code);
    }

    public void Metod2() {  System.out.println("trtrtr");}

    public static void main(String[] args) {
        Metod1(123456);

        Method method = new Method();
        method.Metod2();
    }
}

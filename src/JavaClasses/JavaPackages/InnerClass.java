package JavaClasses.JavaPackages;

class OutClass {
    int a = 5;
    //
    static class InClass{
        int b = 10;
    }
}
public class InnerClass {
    public static void main(String[] args) {
        OutClass obj1 = new OutClass();

        OutClass.InClass obj2 = new OutClass.InClass();
        System.out.println(obj1.a);
        System.out.println(obj2.b);
    }
}

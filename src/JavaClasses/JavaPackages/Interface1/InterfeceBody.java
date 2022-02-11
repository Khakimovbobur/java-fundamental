package JavaClasses.JavaPackages.Interface1;

public class InterfeceBody implements FirstInterface, SecondInterface{
    //

    @Override
    public void Method1() {
        System.out.println("ABS");
    }

    @Override
    public void Method2() {
        System.out.println("123");
    }
    public void Summ(int a, int b) {
        int s=a+b;
        System.out.println(s);
    }
}

package JavaMethods;

public class Method3 {
    static int yigindimetodA(int a, int b) {
       int c = a+a+b;
        return c;
    }
    static double yigindimetodB (double a, double b) {
        return a+b;
    }
    public static void main(String[] args) {
    int A = yigindimetodA(54,56);
    double B = yigindimetodB(78,95);
        System.out.println("A="+A);
        System.out.println("B="+B);
    }
}

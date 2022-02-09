public class MisolIF {
    public static void main(String[] args) {
        int a=5234;
        int b=a/1000+(a/100)%10;
        int c=a%10+(a%100)/10;

        if (b==c){
            System.out.println("Teng");
        } else {
            System.out.println("Teng emas");
        }
    }
}

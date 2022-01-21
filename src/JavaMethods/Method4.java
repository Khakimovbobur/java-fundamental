package JavaMethods;

public class Method4 {
    public static int vsum( int k)
    {
    if ( k > 0 ) { int c = k+vsum(k-1); return c;} else
    {return 0;}
    }


    public static void main(String[] args) {
      int  yigindi=vsum(10);
        System.out.println(yigindi);
    }
}

package JavaDarslik;

public class Chiziqlienglama {

/* a1x +b1y=c va a2x+b2y=c    tenglamalar bilan berilgan chiziqlarning kesishish nuqtasi
    koordinatalarini chop etadigan yoki bu chiziqlarning ustma-ust
    tushishligi, yoki paralleligi haqida ma„lumot beradigan programma tuzilsin. Bu yerda
a1 ,b1 ,c1 ,a2 ,b2 va c2 – berilgan sonlar */

    public static void main(String[] args) {
        double a1=1, b1=2, c1=3, a2=2, b2=4, c2=6;

        if (a1/b1==a2/b2 && !(c1/b1==c2/b2)){
            System.out.println("paralel");
        }
        if (!(a1/b1==a2/b2)){
            System.out.println("kesishadi");
        }
        if (a1/a2==b1/b2 && b1/b2==c1/c2)
        {
            System.out.println("ustima-ust");
        }
    }
}

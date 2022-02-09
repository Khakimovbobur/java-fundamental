package JavaClasses.AylanaKvadrat;

public class Methodlar {
    //
    /*    Radiusi r bo'lgan doira ko'rinishidagi
    alyumin plastinkadan o'lchamlari
    a,b va p,q bo'lgan ikkita to'g'ri to'ritburchak
    shaklidagi plastinkalarni qirqib olish mumkin yoki yo'qligi aniqlansin     */

    public void Kvaylana(int r, int a, int b, int p, int q){
        //
        int h=a+p;
        int c=(a+b)/2;
        int RR=4*r*r;
        int K=c*c+h*h;

        if (RR>=K){
            System.out.println("Ichida yitadi");
        }else {
            System.out.println("yo'q");
        }
    }
}

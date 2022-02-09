package JavaClasses.Polindron;

public class Classpolindron {
    public void Polindron(int a){
        int x,y,z,h;

        x=a/1000;
        h=(a/100)%10;
        y=(a%100)/10;
        z=a%10;
        if (x==z && h==y){
            System.out.println("Polindron");
        } else {
            System.out.println("Emas");
        }
    }
}

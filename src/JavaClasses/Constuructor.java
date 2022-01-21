package JavaClasses;

public class Constuructor {
    int year;
    String name;

    public Constuructor(int vyear,String vname){
        year = vyear;
        name = vname;
    }

    public static void main(String[] args) {
        Constuructor objectcar = new Constuructor(500,"nexa3");
        System.out.println(objectcar.year+"  "+objectcar.name);
    }
}

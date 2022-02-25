public class ConsClass {
    //

    private String name;
    private String level;
    private int age;

    public ConsClass(String name) {
        this.name = name;


        System.out.println("name " + name);
    }

    public ConsClass(String level, int age) {
        this.level = level;
        this.age = age;
        System.out.println(" level : " + level + "   " + " age " + age);
    }

    public ConsClass(String name, String level, int age) {
        this.name = name;
        this.level = level;
        this.age = age;
    }

    public void tr(){
        System.out.println("He");
    }


    public ConsClass(){

    }



    public static void main(String[] args) {

        ConsClass a = new ConsClass();
        a.age = 4;
        a.name = "Boburjon";
        a.level = "3";

        System.out.println("===>   " + a.name +"  " +a.level);

//        ConsClass b = new ConsClass("Urunov");
//        b.age = 55;


        ConsClass c = new ConsClass("Kuku", 45);
        c.name = "Li Man";
        System.out.println("  " + c.name);

//        System.out.println("----> " + b.age);
//
//        System.out.println("==> " + a.level);


        c.tr();
    }
}

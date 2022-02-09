package JavaClasses.GetSet;

public class ClassMain {
    public static void main(String[] args) {
        //
        Person obj = new Person();

        obj.setName("Bobur");
        System.out.println(obj.getName());

        obj.setName("Azizbek");
        System.out.println(obj.getName());

        obj.setFirstname("Xakimov");
        System.out.println(obj.getFirstname());

        obj.setAge(26);
        System.out.println(obj.getAge());

        obj.setTel(994042615);
        System.out.println(obj.getTel());
    }
}

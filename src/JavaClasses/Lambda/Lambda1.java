package JavaClasses.Lambda;

interface StringFunctin{
    String run(String satr);
}
public class Lambda1 {
    public static void main(String[] args) {
        StringFunctin undov = (s) ->s + "!";
        StringFunctin suroq = (s) ->s + "?";
        printFormat("Salom", undov);
        printFormat("Salom",suroq);
    }
public static void printFormat(String str,StringFunctin format){
        String qiymat = format.run(str);
        System.out.println(qiymat);
    }
}
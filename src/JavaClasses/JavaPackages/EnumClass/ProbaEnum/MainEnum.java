package JavaClasses.JavaPackages.EnumClass.ProbaEnum;

import JavaClasses.JavaPackages.EnumClass.ProbaEnum.FirstEnum;

public class MainEnum {
    //
    public static void main(String[] args) {
        //
        FirstEnum mywar = FirstEnum.SESHANBA;

        switch (mywar){
            case DUSHANBA : System.out.println("1");
            break;
            case SESHANBA : System.out.println("2");
            break;
            case CHORSHANBA : System.out.println("3");
            break;
            case PAYSHANBA: System.out.println("4");
            break;
            case JUMA : System.out.println("5");
            break;
            case SHANBA : System.out.println("6");
            break;
            case YAKSHANBA : System.out.println("7");
            break;
        }
    }
}

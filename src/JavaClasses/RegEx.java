package JavaClasses;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        //
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Qidirmoqchi bo'lgan so'zingizni kiriting: ");
        String ism = obj1.next();

        Pattern pattern= Pattern.compile( ism,Pattern.CASE_INSENSITIVE);
        Matcher obj=pattern.matcher("Xakimov Bobur");
        boolean tur= obj.find();

        if (tur){
            System.out.println("Maslik mavjud!");
        } else {
            System.out.println("Maslik mavjud emas!");
        }
    }
}

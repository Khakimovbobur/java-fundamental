package JavaFileCreate;

import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File obj = new File("D:\\work\\javaFundamental\\file2.txt");
            Scanner myoqish = new Scanner(obj);
            String txt = myoqish.nextLine();
            System.out.println(txt);
        } catch (Exception e) {
            System.out.println("Xatolik yuz berdi");
            e.printStackTrace();
        }
    }
}

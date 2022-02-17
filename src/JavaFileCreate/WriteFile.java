package JavaFileCreate;

import java.io.File;
import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        //
        try {
            FileWriter objwrite = new FileWriter("D:\\work\\javaFundamental\\file2.txt");

//            File obj = new File("D:\\work\\javaFundamental\\file2.txt");
//            objwrite.write(obj.getAbsolutePath());   // faylga file2 adresini yozadi

            objwrite.write("Salom");
            objwrite.close();
            System.out.println("Faylga muvaffaqiyatli yozildi!");
        } catch (Exception e) {
            System.out.println("Xatolik yuz berdi!");
            e.printStackTrace();
        }
    }
}

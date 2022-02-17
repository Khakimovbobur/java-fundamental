package JavaFileCreate;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File obj = new File("D:\\work\\javaFundamental\\FileForDelete.txt");
            if (obj.createNewFile()){
                System.out.println("fayl yaratildi: " + obj.getName());
            } else {
                System.out.println("Fayl allaqachon mavjud.");
            }
        } catch (Exception a){
            System.out.println("eror");
            a.printStackTrace();
        }
    }
}

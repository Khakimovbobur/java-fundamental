package JavaFileCreate;

import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        File obj = new File("D:\\work\\javaFundamental\\FileForDelete.txt");
        if (obj.delete()) {
            System.out.println("Bu fayl o'chirildi: " + obj.getName());
        } else {
            System.out.println("Faylni oʻchirib boʻlmadi!");
        }
    }
}

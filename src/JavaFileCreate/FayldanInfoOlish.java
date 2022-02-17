package JavaFileCreate;

import java.io.File;

public class FayldanInfoOlish {
    public static void main(String[] args) {
        try {
            File obj = new File("D:\\work\\javaFundamental\\file2.txt");
            if (obj.exists()){
                System.out.println("File name: " + obj.getName());
                System.out.println("Adresi: " + obj.getAbsolutePath());
                System.out.println("Yozilishi mumkin: " + obj.canWrite());
                System.out.println("O'qilishi mumkin: " + obj.canRead());
                System.out.println("Fayl hajmi baytlarda: " + obj.length());
            } else {
                System.out.println("Fayl mavjud emas!");
            }
        } catch (Exception e) {
            System.out.println("eror!");
            e.printStackTrace();
        }
    }
}

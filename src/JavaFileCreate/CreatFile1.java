package JavaFileCreate;

import java.io.File;

public class CreatFile1 {
    public static void main(String[] args) {
        //
       try {
           File obj1 = new File("D:\\work\\javaFundamental\\file2.docx");
           if (obj1.createNewFile()){
               System.out.println("Fayl yaratildi: " + obj1.getName());
           } else {
               System.out.println("Fayl avvaldan mavjud");
           }
       } catch (Exception s){
           System.out.println("Xatolik");
           s.printStackTrace();
       }
    }
}

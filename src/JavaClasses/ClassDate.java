package JavaClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClassDate {
    public static void main(String[] args) {
        //
        LocalDate obj = LocalDate.now();
        System.out.println(obj);
        //
        LocalDateTime obj1 = LocalDateTime.now();
        System.out.println(obj1);
        //
        DateTimeFormatter ObjFormat = DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");

        String vaqt = obj1.format(ObjFormat);
        System.out.println(vaqt);



    }
}

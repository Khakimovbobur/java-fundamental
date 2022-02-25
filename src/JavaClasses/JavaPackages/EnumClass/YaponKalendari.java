package JavaClasses.JavaPackages.EnumClass;

import java.util.Scanner;

public class YaponKalendari {
    public static void main(String[] args) {
        Scanner obj= new  Scanner(System.in);

        System.out.println("Yilni kiriting: ");
        int kiritilganyil= obj.nextInt();
        int yil = kiritilganyil%12;
        int yilrangi = kiritilganyil%60;

        if (yilrangi<=12){
        switch (yil)
        {
            case 1:
                System.out.println(kiritilganyil+"-yil "+"yashil"+" Sichqon"+" yili");
                break;
            case 2:
                System.out.println(kiritilganyil+"-yil "+"yashil"+" Sigir"+" yili");
                break;
            case 3:
                System.out.println(kiritilganyil+"-yil "+"yashil"+" Yo'lbars"+" yili");
                break;
            case 4:
                System.out.println(kiritilganyil+"-yil "+"yashil"+" Quyon"+" yili");
                break;
            case 5:
                System.out.println(kiritilganyil+"-yil "+"yashil"+" Ajdaho"+" yili");
                break;
            case 6:
                System.out.println(kiritilganyil+"-yil "+"yashil"+" Ilon"+" yili");
                break;
            case 7:
                System.out.println(kiritilganyil+"-yil "+"yashil"+" Sunday"+" yili");
            case 8:
                System.out.println(kiritilganyil+"-yil "+"yashil"+" Sunday"+" yili");
            case 9:
                System.out.println(kiritilganyil+"-yil "+"yashil"+" Sunday"+" yili");
            case 10:
                System.out.println(kiritilganyil+"-yil "+"yashil"+" Sunday"+" yili");
            case 11:
                System.out.println(kiritilganyil+"-yil "+"yashil"+" Sunday"+" yili");
            case 0:
                System.out.println(kiritilganyil+"-yil "+"yashil"+" Sunday"+" yili");
                break;
        }
        }
        if (12<yilrangi && yilrangi<=24){
            switch (yil)
            {
                case 1:
                    System.out.println(kiritilganyil+"-yil "+"qizil"+" Sichqon"+" yili");
                    break;
                case 2:
                    System.out.println(kiritilganyil+"-yil "+"qizil"+" Sigir"+" yili");
                    break;
                case 3:
                    System.out.println(kiritilganyil+"-yil "+"qizil"+" Yo'lbars"+" yili");
                    break;
                case 4:
                    System.out.println(kiritilganyil+"-yil "+"qizil"+" Quyon"+" yili");
                    break;
                case 5:
                    System.out.println(kiritilganyil+"-yil "+"qizil"+" Ajdaho"+" yili");
                    break;
                case 6:
                    System.out.println(kiritilganyil+"-yil "+"qizil"+" Ilon"+" yili");
                    break;
                case 7:
                    System.out.println(kiritilganyil+"-yil "+"qizil"+" Sunday"+" yili");
                case 8:
                    System.out.println(kiritilganyil+"-yil "+"qizil"+" Sunday"+" yili");
                case 9:
                    System.out.println(kiritilganyil+"-yil "+"qizil"+" Sunday"+" yili");
                case 10:
                    System.out.println(kiritilganyil+"-yil "+"qizil"+" Sunday"+" yili");
                case 11:
                    System.out.println(kiritilganyil+"-yil "+"qizil"+" Sunday"+" yili");
                case 0:
                    System.out.println(kiritilganyil+"-yil "+"qizil"+" Sunday"+" yili");
                    break;
            }
        }
        if (24<yilrangi && yilrangi<=36){
            switch (yil)
            {
                case 1:
                    System.out.println(kiritilganyil+"-yil "+"sariq"+" Sichqon"+" yili");
                    break;
                case 2:
                    System.out.println(kiritilganyil+"-yil "+"sariq"+" Sigir"+" yili");
                    break;
                case 3:
                    System.out.println(kiritilganyil+"-yil "+"sariq"+" Yo'lbars"+" yili");
                    break;
                case 4:
                    System.out.println(kiritilganyil+"-yil "+"sariq"+" Quyon"+" yili");
                    break;
                case 5:
                    System.out.println(kiritilganyil+"-yil "+"sariq"+" Ajdaho"+" yili");
                    break;
                case 6:
                    System.out.println(kiritilganyil+"-yil "+"sariq"+" Ilon"+" yili");
                    break;
                case 7:
                    System.out.println(kiritilganyil+"-yil "+"sariq"+" Sunday"+" yili");
                case 8:
                    System.out.println(kiritilganyil+"-yil "+"sariq"+" Sunday"+" yili");
                case 9:
                    System.out.println(kiritilganyil+"-yil "+"sariq"+" Sunday"+" yili");
                case 10:
                    System.out.println(kiritilganyil+"-yil "+"sariq"+" Sunday"+" yili");
                case 11:
                    System.out.println(kiritilganyil+"-yil "+"sariq"+" Sunday"+" yili");
                case 0:
                    System.out.println(kiritilganyil+"-yil "+"sariq"+" Sunday"+" yili");
                    break;
            }
        }
        if (36<yilrangi && yilrangi<=48){
            switch (yil)
            {
                case 1:
                    System.out.println(kiritilganyil+"-yil "+"oq"+" Sichqon"+" yili");
                    break;
                case 2:
                    System.out.println(kiritilganyil+"-yil "+"oq"+" Sigir"+" yili");
                    break;
                case 3:
                    System.out.println(kiritilganyil+"-yil "+"oq"+" Yo'lbars"+" yili");
                    break;
                case 4:
                    System.out.println(kiritilganyil+"-yil "+"oq"+" Quyon"+" yili");
                    break;
                case 5:
                    System.out.println(kiritilganyil+"-yil "+"oq"+" Ajdaho"+" yili");
                    break;
                case 6:
                    System.out.println(kiritilganyil+"-yil "+"oq"+" Ilon"+" yili");
                    break;
                case 7:
                    System.out.println(kiritilganyil+"-yil "+"oq"+" Sunday"+" yili");
                case 8:
                    System.out.println(kiritilganyil+"-yil "+"oq"+" Sunday"+" yili");
                case 9:
                    System.out.println(kiritilganyil+"-yil "+"oq"+" Sunday"+" yili");
                case 10:
                    System.out.println(kiritilganyil+"-yil "+"oq"+" Sunday"+" yili");
                case 11:
                    System.out.println(kiritilganyil+"-yil "+"oq"+" Sunday"+" yili");
                case 0:
                    System.out.println(kiritilganyil+"-yil "+"oq"+" Sunday"+" yili");
                    break;
            }
        }
        if (48<yilrangi && yilrangi<=60){
            switch (yil)
            {
                case 1:
                    System.out.println(kiritilganyil+"-yil "+"qora"+" Sichqon"+" yili");
                    break;
                case 2:
                    System.out.println(kiritilganyil+"-yil "+"qora"+" Sigir"+" yili");
                    break;
                case 3:
                    System.out.println(kiritilganyil+"-yil "+"qora"+" Yo'lbars"+" yili");
                    break;
                case 4:
                    System.out.println(kiritilganyil+"-yil "+"qora"+" Quyon"+" yili");
                    break;
                case 5:
                    System.out.println(kiritilganyil+"-yil "+"qora"+" Ajdaho"+" yili");
                    break;
                case 6:
                    System.out.println(kiritilganyil+"-yil "+"qora"+" Ilon"+" yili");
                    break;
                case 7:
                    System.out.println(kiritilganyil+"-yil "+"qora"+" Sunday"+" yili");
                case 8:
                    System.out.println(kiritilganyil+"-yil "+"qora"+" Sunday"+" yili");
                case 9:
                    System.out.println(kiritilganyil+"-yil "+"qora"+" Sunday"+" yili");
                case 10:
                    System.out.println(kiritilganyil+"-yil "+"qora"+" Sunday"+" yili");
                case 11:
                    System.out.println(kiritilganyil+"-yil "+"qora"+" Sunday"+" yili");
                case 0:
                    System.out.println(kiritilganyil+"-yil "+"qora"+" Sunday"+" yili");
                    break;
            }
        }

    }
}

package JavaClasses.Kordinata23;

public class MethodKordinata {
    public void Kordinata(int x11, int y11, int x12, int y12, int x21 , int y21, int x22, int y22 ){
        //
        if ((x12-x11)==(y12-y11)&&(x22-x21)==(y22-y21)){
            System.out.println("mumkin");
            if ((x21>x12)&&(y21-y12)){
                System.out.println("0");
            }
            //
            if (x12==x21 || y12==y21 || x11==x22 || y11==y22){
                System.out.println("1");
            }
            // 1ta hol uchun
            if ((x12>x21)&&(y12>y21) ){
                System.out.println("2");
            }
        }else {
            System.out.println("Kiritilgan nuqtalardan kvadrat yasab bo'lmaydi");
        }
    }
}

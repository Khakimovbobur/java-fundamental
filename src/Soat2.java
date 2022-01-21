import java.text.DecimalFormat;

public class Soat2 {
    public static void main(String[] args) {
        double a = 30;
        double b=0;
        int j=0;
        double s=0;
        double c=0;
        DecimalFormat form1 = new DecimalFormat("##.00");
        DecimalFormat form2 = new DecimalFormat("##");
        for (int i=0; i<330; i=i+30) {
            b=a+a/11;
            a=a+30;
            j=(i+30)/30;
            s=b*1/6;
            c=(a-30)/11*10;
           // if (c>60){ c=c-(j-2)*60;}

            //System.out.println(j+":"+s+"   "+b );
            System.out.println(j+":"+form2.format(s)+":"+form2.format(c)+"    "+form1.format(b)+" grdus");
        }
    }
}

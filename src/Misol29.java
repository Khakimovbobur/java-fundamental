public class Misol29 {
    public static void main(String[] args) {
        /*Qiymati
        1< x< 9999
        bo„lgan x butun soni berilgan. Bu sonning qiymatiga mos ravishda quydagi satrlar
        chop etilsin: ”to‘rt xonali juft son”, “ikki xonali toq son” va hokazo.*/

      int a = 455;
      int c = a%2;
      int b = String.valueOf(a).length();

      if (b==1)
      { if (c==0){ System.out.println(b+" xonali juft son"); } else {
          System.out.println(b+"xonali toq son");
      }}
        if (b==2)
        { if (c==0){ System.out.println(b+" xonali juft son"); } else {
            System.out.println(b+"xonali toq son");
        }}
        if (b==3)
        { if (c==0){ System.out.println(b+" xonali juft son"); } else {
            System.out.println(b+"xonali toq son");
        }}
        if (b==4)
        { if (c==0){ System.out.println(b+" xonali juft son"); } else {
            System.out.println(b+"xonali toq son");
        }}
    }
}

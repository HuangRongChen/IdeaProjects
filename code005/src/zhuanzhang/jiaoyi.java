package zhuanzhang;

public class jiaoyi {
    public static void main(String[] args) {
        pople P1 = new pople();
        P1.setname("张三");
        P1.setcode(100);
        P1.getcode(100);

        pople P2 = new pople();
        P2.setname("李四");
        P2.setcode(200);

     //   double code = 50;
 //       if (P2.code > code) {
 //           P1.code = P1.code + code;
 //           P2.code = P2.code - code;


            System.out.println(P1.getcode(50));
            System.out.println(P2.getcode(60));
        }
    }

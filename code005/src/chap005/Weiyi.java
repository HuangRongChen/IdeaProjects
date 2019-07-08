package chap005;

public class Weiyi {

    public static void main(String[] args) {//   正数0  负数1
        int a = 0x400;//             二进制   0100 0000 0000
        System.out.println(a);
        System.out.println(a >> 1);//二进制   0010 0000 0000
        System.out.println(a >> 2);//二进制   0001 0000 0000

        System.out.println(a << 1);//二进制   1000 0000 0000
        System.out.println(a << 2);//二进制 1 0000 0000 0000

        System.out.println(a >>> 1);//二进制

        int b = -0x400;
        System.out.println(b);
        System.out.println(b >> 1);
        System.out.println(b >> 2);

        System.out.println(b << 1);
        System.out.println(b << 2);

    }
}

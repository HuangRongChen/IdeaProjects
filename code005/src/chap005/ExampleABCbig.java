package chap005;

public class ExampleABCbig {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int c = 3;
        if (a == b && b == c)
            System.out.println("abc一样大" + a);
        else if (a > b && a > c)
            System.out.println("a最大" + a);
        else if (b > a && b > c)
            System.out.println("b最大" + b);
        else if (c > a && c > b)
            System.out.println("c最大" + c);
        else if (a == b && a > c)
            System.out.println("ab一样大且最大" + a);
        else if (a == c && a > b)
            System.out.println("ac一样大且最大" + c);
        else if (b == c && b > a)
            System.out.println("bc一样大且最大" + b);
    }
}
package chap005;

public class Stringandint {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("a + b =" +c);// 加号相当于等号，只是将两个字符串拼接

        boolean abiggerTHanB=a>b;
        System.out.println("a>b 是"+abiggerTHanB + "的");
        System.out.println("a+b="+a+b);//输出三个字符串
        System.out.println("a+b="+(a+b));//输出两个字符串
        System.out.println("a*b="+a*b);//乘除的优先级高于加减，所以不用加括号
    }

}

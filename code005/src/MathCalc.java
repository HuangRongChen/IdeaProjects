public class MathCalc{
    public static void main(String[] args) {
        int a=16;//0001 0000

        a>>=2;//a=a>>2的缩写。
        System.out.println(a);//此时a=4,后面使用a，a也等于4。

        a*=9;//a=a*9
        System.out.println(a);

    }
}

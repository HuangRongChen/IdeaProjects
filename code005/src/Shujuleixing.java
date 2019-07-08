public class Shujuleixing {
    public static void main(String[] args) {
        int intval = 12;
        long longval = 1234567;
        //高精度向低精度转换超过低精度范围会造成数据丢失
        intval = (int) longval;//将longval赋值给intval，赋值时要（）说明低精度的类型
        System.out.println(intval);

        float floatval = 1.1234F;
        double doubleval = 1.7654321;
        floatval = (float) doubleval;
        System.out.println(floatval);

        int a = 65;
        //char转换为int不需要说明
        char b = (char) a;//int转换为char要说明
        System.out.println(b);

        int x = 20;
        System.out.println(x + x);//超出int范围 但是不会自动转换为double
        double p, y = 25.2;
        p = x + y;//int（低精度）+long（高精度）=long（高精度）,即使没有超出int的范围，数据类型也会转换成long
        System.out.println(p);//低精度向高精度自动转换，不需要说明
    }
}

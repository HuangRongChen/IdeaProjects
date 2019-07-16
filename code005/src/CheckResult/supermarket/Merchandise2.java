package CheckResult.supermarket;

public class Merchandise2 {
    public static void main(String[] args) {

        //创建一个类的对象
        Merchandise m = new Merchandise();
//        m.name = "书桌";
//        m.id = "9867";
//        m.soldPrice = 500;
//        m.purchasePrice = 100;
//        m.count = 200;





        //调用方法
        m.init("书桌", "9867", 500, 100, 200);   //用调用方法赋值  结果跟上面直接赋值一样

        m.describe();
    }
}

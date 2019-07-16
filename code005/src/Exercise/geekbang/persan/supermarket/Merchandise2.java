package Exercise.geekbang.persan.supermarket;

public class Merchandise2 {
    public static void main(String[] args) {

        //创建一个类的对象
        Merchandise m = new Merchandise();
        m.name = "书桌";
        m.soldPrice = 500;
        m.purchasePrice = 100;
        m.count = 200;
        m.id = "9867";

        //调用方法
        m.describe();
    }
}

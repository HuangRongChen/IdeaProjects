package CheckResult.supermarket;

//创建一个类
public class Merchandise {
    public String name;
    public String id;
    public double soldPrice;
    public double purchasePrice;      //类里面定义的变量叫成员变量
    public int count;

    public void init(String name, String id, double soldPrice, double purchasePrice, int count) {
        this.name = name;
        this.id = id;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
        this.count = count;
    }

    //创建一个方法  方法名字后面一定要有括号
    public void describe() {
        double netIncome = soldPrice - purchasePrice;  // 方体内部定义的变量叫做 局部变量
        System.out.println("商品名字: " + name + "\n"
                + "id是：" + id + "\n"
                + "商品进价是：" + purchasePrice + "\n"
                + "商品售价是：" + soldPrice + "\n"
                + "销售一个的毛利润是： " + netIncome + "\n"
                + "商品库存是：" + count);
    }

    public double buy(int countToBuy) {    //括号内为参数 ，调用 buy 这个方法时括号内有int型参数
        if (count < countToBuy) {
            System.out.println("商品库存不足");
            return -0;
        }
        System.out.println("商品单价为：" + soldPrice);

        int fullCount = countToBuy / 2 + countToBuy % 2;
        int halfCount = countToBuy - fullCount;
        double totalCost = (fullCount * soldPrice) + (halfCount * soldPrice / 2);

        count -= countToBuy;
        return totalCost;
    }

    public double buy(int countToBuy, boolean isVip) {
        return 0d;
    }
}

package CheckResult.persan;

import CheckResult.supermarket.LittleSuperMarket;
import CheckResult.supermarket.Merchandise;

import java.util.Scanner;

public class RunLittleSupperMarketAppMainHalfPrice2 {
    public static void main(String[] args) {

        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        littleSuperMarket.address = "世纪大道666号";
        littleSuperMarket.superMarketName = "有家超市";
        littleSuperMarket.parkingCount = 200;
        littleSuperMarket.merchandises = new Merchandise[200];
        //统计用的数组
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];
        //创建一个熟数组引用，和 littleSuperMarket.merchandises 指向同一个数组对象
        Merchandise[] all = littleSuperMarket.merchandises;

        //遍历并给所有商品赋值
        for (int i = 0; i < all.length; i++) {
            Merchandise m = new Merchandise();
            //创建商品属性
            m.count = 200;
            m.id = "Id" + i;
            m.name = "商品" + i;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200;
            //用创建的商品，给商品数组的第i个引用赋值， all 和小超市的商品数组引用指向的是同一个对象
            all[i] = m;
        }
        Scanner Scanner = new Scanner(System.in);
        while (true) {
            System.out.println("今日超市特惠，所有商品第二件半价，请输入要购买商品的索引:");
            int index = Scanner.nextInt();
            if (index < 0) {
                System.out.println("欢迎下次光临！");
                break;
            }

            if (index >= all.length) {
                System.out.println("商品索引超出范围");
                continue;
            }

            System.out.println("请输入购买数量：");
            int count = Scanner.nextInt();
            Merchandise m = littleSuperMarket.merchandises[index];
            double totalCost = m.buy(count);
            System.out.println("商品总价为:" + totalCost);
        }
    }
}

package Exercise.geekbang.persan;

import Exercise.geekbang.persan.person.Customer;
import Exercise.geekbang.persan.supermarket.LittleSuperMarket;
import Exercise.geekbang.persan.supermarket.Merchandise;

import java.util.Scanner;

public class RunLittleSupperMarketAppMain {
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

        System.out.println("超市开门啦！");

        boolean open = true;
        Scanner Scanner = new Scanner(System.in);

        while (open) {
            System.out.println("本店叫做:" + littleSuperMarket.superMarketName);
            System.out.println("本店地址：" + littleSuperMarket.address);
            System.out.println("共有停车位：" + littleSuperMarket.parkingCount + "个");
            System.out.println("今天的营业额为：" + littleSuperMarket.incomingSum);
            System.out.println("共有商品：" + littleSuperMarket.merchandises.length + "种");

            Customer customer = new Customer();
            customer.name = "顾客编号" + ((int) Math.random() * 1000);
            customer.money = (1 + Math.random()) * 1000;
            customer.isDrivingCar = (Math.random() > 0.5);

            if (customer.isDrivingCar) {
                if (littleSuperMarket.parkingCount > 0) {
                    littleSuperMarket.parkingCount--;
                    System.out.println("欢迎" + customer.name + "驾车而来。本店已为您安排了免费停车位，车位编号为：" + littleSuperMarket.parkingCount);
                } else {
                    System.out.println("停车位已满,欢迎下次光临");
                    continue;
                }
            } else {
                System.out.println("欢迎" + customer.name + "光临本店！");
            }

            double totalCost = 0;
            while (true) {
                System.out.println("本店提供" + all.length + "种商品，欢迎选购。请输入商品编号：");
                int index = Scanner.nextInt();

                if (index < 0) {
                    break;
                }

                if (index >= all.length) {
                    System.out.println("本店没有这种商品，请输入编号在0到" + (all.length - 1) + "之内的商品编号。");
                    continue;
                }

                Merchandise m = all[index];

                System.out.println("您选购的商品是:" + m.name + "  单价是: " + m.soldPrice + "请问你要购买多少个？");
                int numToBuy = Scanner.nextInt();

                if (numToBuy <= 0) {
                    System.out.println("不买看看也好，欢迎继续挑选。");
                    continue;
                }

                if (numToBuy > m.count) {
                    System.out.println("本店此商品库存没有那么多，欢迎继续挑选！");
                    continue;
                }

                if (numToBuy * m.purchasePrice + totalCost > customer.money) {
                    System.out.println("您带的钱不够，欢迎继续挑选！");
                    continue;
                }

                totalCost += numToBuy * m.soldPrice;

                m.count -= numToBuy;
                littleSuperMarket.merchandiseSold[index] += numToBuy;
            }
            customer.money -= totalCost;

            if (customer.isDrivingCar) {
                littleSuperMarket.parkingCount++;
            }

            System.out.println("顾客" + customer.name + "共消费了" + totalCost);

            littleSuperMarket.incomingSum += totalCost;

            System.out.println("还继续营业吗?");
            open = Scanner.nextBoolean();

        }

        System.out.println("超市关门了！");
        System.out.println("今天的总营业额为：" + littleSuperMarket.incomingSum + "营业情况如下:");

        for (int i = 0; i < littleSuperMarket.merchandiseSold.length; i++) {
            Merchandise m = all[i];
            int numSold = littleSuperMarket.merchandiseSold[i];
            if (numSold > 0) {
                double incomming = m.soldPrice * numSold;
                double netIncomming = (m.soldPrice - m.purchasePrice) * numSold;
                System.out.println(m.name + "售出了" + numSold + "个，销售额为: "
                        + incomming + " ,净利润为： " + netIncomming);
            }
        }

    }
}


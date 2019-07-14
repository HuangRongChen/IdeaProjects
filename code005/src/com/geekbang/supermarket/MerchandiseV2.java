package com.geekbang.supermarket;

public class MerchandiseV2 {

    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;
    public String madeIn;

    public void describe() {
        double netIncome = soldPrice - purchasePrice;
        System.out.println("商品名:" + name + "  id是：" + id + "  商品售价：" + soldPrice + "  商品进价：" + purchasePrice
                + "  商品库存：" + count + "  销售一个" + name + "的毛利是" + netIncome + "  制造地为：" + madeIn);
    }
}

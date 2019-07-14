package Supermarket;

public class SuperMarket {
    public static void main(String[] args) {

        //对象变量  类的名  =  new  对象多为实（）；
        Merchandise m1 = new Merchandise();   // （ m1 只能指向 Merchandise这个类型 ）
        m1.name = "茉莉花茶";  //类的属性  也叫 成员变量
        m1.id = "00099518";
        m1.count1.monney = 1000;
        m1.price = 99.9;

        Merchandise m2 = new Merchandise();
        m2.name = "可口可乐";
        m2.id = "000099519";
        m2.count = 1000;
        m2.price = 3.0;

    }
}

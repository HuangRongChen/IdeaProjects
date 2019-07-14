package Supermarket;

public class shishi {
    public static void main(String[] args) {
        Merchandise[] merchandises = new Merchandise[9]; //创建的数组名字是类的名  不是对象的名

        //给索引为偶数的引用赋值
        for (int i = 0; i < merchandises.length; i++) {
            if (i % 2 == 0) {
                merchandises[i] = new Merchandise();
            }
        }
        //输出属性不是 null的对象的值
        for (int i = 0; i < merchandises.length; i++) {
            if (merchandises[i] != null) {
                System.out.println(merchandises[i].name);
            }
        }

        for (int i = 0; i < merchandises.length; i++) {
            if (i % 2 == 0) {
                Merchandise m = merchandises[i];
                System.out.println(m.name);
                System.out.println(m.id);
                System.out.println(m.count);
                System.out.println(m.price);
            }
        }

    }
}

package chap005;

public class RandomNumber {
    public static void main(String[] args) {
        double randnum = 0;

        //随机生成一个 0.5~1之间的数
        while (randnum < 0.5) {
            randnum = Math.random();
        }
        System.out.println(randnum);

        //随机生成一个大于10的正整数
        for (int i = 1; i < 5; i++) {
            int randStart = 10;
            int randEnd = 10;
            int mod = randEnd - randStart;
            if (randStart <= 0 || randEnd <= 0) {
                System.out.println("数字范围不合理");
            }
            if (mod <= 1) {
                System.out.println("数字范围不合理：" + randStart + "~" + randEnd);
            }
            int randNum = (int) ((Math.random() * mod * 100));
            int Number = (randNum % mod) + randStart;
            System.out.println(Number);
        }
    }
}

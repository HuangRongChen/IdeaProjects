package chap005;

public class ExampleFor2 {
    public static void main(String[] args) {

        int chushu = 1;
        int beichushu = 5;

        int found = 0;
        int tofoude = 10;

        for (int i = 0; i < 100; i++) {
            if (chushu < beichushu) {
                System.out.println(chushu + "小于" + beichushu + ",循环跳出");
                chushu++;
                continue;
            }
            if (chushu % beichushu == 0) {
                System.out.println(beichushu + "可以被" + chushu + "整除");
                found++;
            }
            chushu++;
            if (found >= tofoude) {
                System.out.println("已找到" + found + "个数，退出循环");
                break;
            }

        }
    }
}

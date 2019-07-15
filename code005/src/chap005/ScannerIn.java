package chap005;

import java.util.Scanner;

public class ScannerIn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("请输入：");
        a = in.nextInt();
        System.out.println("a的值为:" + a);

    }
}

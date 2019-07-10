package chap005;

public class Example99 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            String str = "";
            for (int j = 1; j <= 9; j++) {
                if (j > i) {
                    break;
                }
                str += j + "*" + i + "=" + (i * j) + "\t";
            }
            System.out.println(str);
        }
    }
}

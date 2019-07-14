package chap005;

public class Example99 {
    public static void main(String[] args) {
        all();
        M1();

    }

    public static void all() {
        for (int i = 1; i <= 9; i++) {
            String str = "";
            for (int j = 1; j <= 9; j++) {
                str += j + "*" + i + "=" + (i * j) + "\t";
            }
            System.out.println(str);
        }
        System.out.println("\n");
    }

    public static void M1() {
        for (int i = 1; i <= 9; i++) {
            String str1 = "";
            for (int j = 1; j <= 9; j++) {
                if (i < j) {
                    break;
                }
                str1 += (j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println(str1);
        }
        System.out.println("\n");
    }

}
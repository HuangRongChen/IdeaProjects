package chap005;

public class Exampleswitch {
    public static void main(String[] args) {
        int a = 6;
        String str = "输入 ";
        switch (a) {
            case 1:
                str += "1";
                break;
            case 2:
                str += "2";
                break;
            case 3:
                str += "3";
                break;
            case 4:
                str += "4";
                break;
            case 5:
                str += "5";
                break;
            default:
                System.out.println(a+"不在范围内");
        }
        System.out.println(str);
    }
}

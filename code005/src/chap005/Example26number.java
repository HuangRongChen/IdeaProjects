package chap005;

public class Example26number {
    public static void main(String[] args) {
        char ch='a';
        int num=ch;

        for (int i=0; i< 26; i++) {
            System.out.println(num+"\t"+(char)(num+i));
        }
    }
}

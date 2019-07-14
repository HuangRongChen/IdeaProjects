package String;

public class LearnString2 {
    public static void main(String[] args) {
        String countent = "Orange_Apple_Banana";  // 下划线为英文半角状态
        char[] chars = countent.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        String sp = "_";
        String[] s = countent.split(sp);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

/*        int index0f = countent.index0f('_');
        System.out.println(index0f);
        System.out.println(countent.substring(index0f + 1, countent.length()));

        int lastindex0f = countent.lastindex0f(str:"_");
        System.out.println(lastindex0f);

        System.out.println(countent.substring(0,lastIndex0f));
*/
    }
}

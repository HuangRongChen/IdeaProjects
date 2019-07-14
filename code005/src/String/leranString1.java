package String;

public class leranString1 {
    public static void main(String[] args) {
        String context = "01234567ABCDefgh";

        System.out.println("1. " + context.length());  // 输出字符串的长度

        System.out.println("2. " + context.toUpperCase());  // 将字符串中的 小写字母 全部变成 大写

        System.out.println("3. " + context.toLowerCase());  // 将字符串中的 大写字母 全部变成 小写

        System.out.println("4. " + context);  //  证明 转换大小写字母并没有改变原字符串，而是生成了一个新的字符串

        System.out.println("5. " + context.charAt(1));  // 查看字符串 第 2 个 字符

        System.out.println("6. " + context.substring(5));  //  从第 6 个字符开始截取至最后一个字符

        System.out.println("7. " + context.substring(1, 5));  // 从第 2 个字符开始截取至第 6 个字符，但不包含第 6 个字符

    }
}

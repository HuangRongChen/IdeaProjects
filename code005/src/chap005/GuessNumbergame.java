package chap005;
/*
import java.util.Scanner;

public class GuessNumbergame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //游戏设置
        int rangeStart = 1;
        int rangeEnd = 8;
        int guessTotal = 3;


        int totalGamecount= 0;
        int totalCorrecount= 0;

        //是否结束游戏
        boolean stopGame = false;

        while (!stopGame) {
            totalCorrecount++;
            //初始化本次游戏的变量
            int guessLeft = guessTotal;
            int mod = rangeEnd - rangeStart;
            double randNum = Math.random();
            int num = ((int) (randNum * rangeEnd * 100)) % mod;
            num += rangeStart;
            if (num <= rangeStart) {
                num = rangeStart + 1;
            }
            if (num >= rangeEnd) {
                num = rangeEnd - 1;
            }

            System.out.println("==========猜数字==========");
            System.out.println("目标数已生成，数字在 " + rangeStart + "~" + rangeEnd + "之间," + "不包括这两个数，共有" + guessTotal + "次猜测机会，输入 -1 时结束游戏。");

            //本次游戏是否开始了
            boolean gameStart = true;
            //本次是否猜中数字
            boolean guessCorrect = false;
            while (guessLeft > 0) {
                System.out.println("剩余猜测次数: " + guessLeft + "请继续输入:");
                int guessNum = in.nextInt();
                //输入 -1 ，结束游戏
                if (guessNum == -1) {
                    stopGame = true;
                    break;
                }

                if (guessNum <= rangeStart || guessNum >= rangeEnd) {
                    System.out.println("请输入在" + rangeStart + "到" + rangeEnd + "之间的数字，不包括这两个数。");
                    continue;
                }
                //至少玩过一次就算猜过了
                if (gameStart) {
                    totalGamecount ++;
                    gameStart = false;
                }
                if (guess > numberToGuess) {
                    System.out.println("输入的数字比目标数字大");
                } else if (guess < numberToGuess) {
                    System.out.println("输入的数字比目标数字小");
                } else {
                    correctGuessCount++;
                    correctGuess = true;
                    System.out.println("输入正确！");
                    break;
                }
            }
            if (!correctGuess) {
                System.out.println("本次的目标数字是:" + numberToGuess );
            }
            System.out.println("共进行了" + Gamecount + "次游戏，" + "正确 " + truecount + " 次");
        }
    }
}

*/
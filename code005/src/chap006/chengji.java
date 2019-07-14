package chap006;

import java.util.Scanner;

// TODO: 2019/7/10 该功能尚未完全理解，需要重写
public class chengji {
    public static void main(String[] args) {

        int yuwenInt = 0;
        int shuxueInt = 1;
        int waiyuInt = 2;
        int shengwuInt = 3;
        int wuliInt = 4;
        int huaxueInt = 5;//每门课对应的索引

        int totalScoreCount = 6;

        String[] names = new String[totalScoreCount];//创建String型的数组
        names[yuwenInt] = "语文";
        names[shuxueInt] = "数学";
        names[waiyuInt] = "外语";
        names[shengwuInt] = "生物";
        names[wuliInt] = "物理";
        names[huaxueInt] = "化学";//通过索引去访问double型数组

        Scanner scanner = new Scanner(System.in);

        System.out.println("请问你要保存几年的成绩？");
        int yearCount = scanner.nextInt();

        double[][] scores = new double[yearCount][names.length];

        for (int i = 0; i < yearCount; i++) {
            for (int j = 0; j < totalScoreCount; j++) {
                scores[i][j] = 80 + Math.random() * 20;
            }
        }
        System.out.println("请问你要查看第几年的成绩？");
        int year = scanner.nextInt() - 1;

        System.out.println("请问你要查看那一门科目的成绩？");
        int kemu = scanner.nextInt() - 1;

        System.out.println("第" + (year + 1) + "年的" + names[kemu + 1] + "成绩是： " + scores[yearCount][names.length]);

        boolean cont = true;
        while (cont) {
            System.out.println("请选择要进行的操作:");
            System.out.println("1:求某年最好成绩\n" + "2：求某年的平均成绩\n" + "3求所有年份最好成绩\n" + "4求某门课历年最好成绩");

            int oprtId = scanner.nextInt();

            int yearTemp = 0;
            switch (oprtId) {
                case 1:
                    System.out.println("请输入要计算第几年的最好成绩");
                    yearTemp = scanner.nextInt();
                    if (yearTemp <= 0 || yearCount < yearTemp) {
                        System.out.println("非法年份" + yearTemp);
                        cont = false;
                        break;
                    }

                    yearTemp = yearTemp - 1;
                    int best0fYearScoreId = 0;
                    for (int i = 1; i < totalScoreCount; i++) {
                        if (scores[yearTemp][best0fYearScoreId] < scores[yearTemp][i]) {
                            best0fYearScoreId = i;
                        }
                    }
                    System.out.println("第" + (yearTemp + 1) + "年成绩最好的科目为" + names[best0fYearScoreId]);
                    break;

                case 2:
                    System.out.println("请输入要计算第几年的平均成绩");
                    yearTemp = scanner.nextInt();
                    if (yearTemp <= 0 || yearCount < yearTemp) {
                        System.out.println("非法年份" + yearTemp);
                        cont = false;
                        break;
                    }

                    yearTemp = yearTemp - 1;
                    double totalCountForAvg = 0;
                    for (int i = 0; i < totalScoreCount; i++) {
                        totalScoreCount += scores[yearTemp][i];
                    }
                    double avg0fYear = totalCountForAvg / totalScoreCount;
                    System.out.println("第" + (yearTemp + 1) + "年的平均成绩为" + avg0fYear + ".");
                    break;

                case 3:
                    int bestYear = 0;
                    int bestScore = 0;

                    for (int i = 0; i < yearCount; i++) {
                        for (int j = 0; j < totalScoreCount; j++) {
                            if (scores[bestYear][bestScore] < scores[i][j]) {
                                bestYear = i;
                                bestScore = j;
                            }
                        }
                    }
                    System.out.println("所有你年度最好成绩为第" + (yearTemp + 1) + "年的" + names[bestScore]);
                    break;

                case 4:

            }

        }
    }
}


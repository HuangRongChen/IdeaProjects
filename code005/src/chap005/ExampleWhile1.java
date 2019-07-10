package chap005;

public class ExampleWhile1 {
    public static void main(String[] args) {
        int found=0;

        int chushu=1;
        int beichushu=2000000000;

        while(found<10){
            if (chushu<0){
                System.out.println("被除数溢出，计算结束");
                break;
            }
            if(chushu%beichushu==0){
                found+=1;
                System.out.println(chushu+"可以整除"+beichushu+",商为"+chushu/beichushu);
            }
            chushu+=1;
        }
    }
}

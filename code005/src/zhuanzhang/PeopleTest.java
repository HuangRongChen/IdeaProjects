package zhuanzhang;

public class PeopleTest {

    public static void main(String[] args) {
        People P1 = new People("张三", 100);
        People P2 = new People("李四", 200);
        System.out.println(P1.getName() + "收款前 " + P1.getBalance());
        System.out.println(P2.getName() + "转账前 " + P2.getBalance());

        MoneyTool.send(P2, P1, 10);
        MoneyTool.send(P2, P1, 10);

        System.out.println(P1.getName() + "收款后 " + P1.getBalance());
        System.out.println(P2.getName() + "转账后 " + P2.getBalance());
    }

}

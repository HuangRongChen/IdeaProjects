package zhuanzhang;

public class PeopleTest {

    public static void main(String[] args) {
        People P1 = new People("张三", 100);
        People P2 = new People("李四", 200);
        System.out.println(P1.getName() + "收款前 " + P1.getBalance());
        System.out.println(P2.getName() + "转账前 " + P2.getBalance());

        send(P2, P1, 10);
        send(P2, P1, 10);

        System.out.println(P1.getName() + "收款后 " + P1.getBalance());
        System.out.println(P2.getName() + "转账后 " + P2.getBalance());
    }

    /**
     * 发起转账
     *
     * @param from   转账发起人
     * @param to     收款人
     * @param amount 转账金额
     */
    public static void send(People from, People to, double amount) {
        if (from.getBalance() < amount) {
            System.out.println(from.getName() + "余额不足");
            return;
        }

        // 1、扣减转账发起人余额
        double value = from.getBalance() - amount;
        from.setBalance(value);

        // 2、收款人余额增加
        to.setBalance(to.getBalance() + amount);
    }

}

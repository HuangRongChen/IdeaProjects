package CheckResult.Transfer;

public class People {

    // 姓名
    private String name;
    // 金额
    private double balance;

    public People(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
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

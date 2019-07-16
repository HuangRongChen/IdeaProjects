package Exercise.Transfer;

public class MoneyTool {
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

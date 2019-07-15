package Exercise.Transfer;

public class MoneyTool {
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

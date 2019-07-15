package Exercise.Transfer;

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
}

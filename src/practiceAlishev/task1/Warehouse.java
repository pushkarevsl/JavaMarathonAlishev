package practiceAlishev.task1;

public class Warehouse {

    private int countOrder;
    private int balance;

    @Override
    public String toString() {
        return "{countOrder=" + countOrder +
                ", balance=" + balance +
                '}';
    }

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

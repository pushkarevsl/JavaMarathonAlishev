package day11.task1;

public class Warehouse {

    private  int countOrder;
    private int balance;

    @Override
    public String toString() {
        return "countOrder=" + countOrder +
                ", balance=" + balance;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public int getBalance() {
        return balance;
    }
}

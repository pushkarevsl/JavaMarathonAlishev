package practiceAlishev.task1;

public class Courier implements Worker {

    private int salary;
    Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance() + 1000);
    }

    @Override
    public void bonus() {
        if (warehouse.getBalance() > 1_000_000) {
            salary *= 2;
        }
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "{salary=" + salary +
                '}';
    }
}

package day11.task1;

public class Picker implements Worker {

    Warehouse warehouse = new Warehouse();

    private int salary;

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrder() > 1500) {
            salary *= 3;
        }
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "{salary=" + salary +"}";
    }
}

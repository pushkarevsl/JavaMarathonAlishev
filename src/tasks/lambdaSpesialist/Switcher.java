package tasks.lambdaSpesialist;

public class Switcher {

    public ElectricityConsumer consumer;

    public void switchOn() {
        System.out.println("Выключатель включён");
        if (consumer != null) {
            consumer.electricityOn();
        }
    }

}

package tasks.lambdaSpesialist;

public class App {

    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        //event subscribe - подписка на событие
        sw.addElectricityListener(radio);
        sw.addElectricityListener(lamp);

        sw.addElectricityListener(
                new ElectricityConsumer() {
                    @Override
                    public void electricityOn() {
                        System.out.println("Пожар");
                    }
                }
        );

        sw.switchOn();
    }
}
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

        //1. Нет необходимости явно указывать new ElectricityConsumer(), компилятор сам понимает какой параметр должен быть добавлен
        //2. Т.к. интерфейс является функциональным то имя метода можно опустить. Он всего один!!
        sw.addElectricityListener(
                () -> System.out.println("Пожар")
        );

        sw.switchOn();
    }
}

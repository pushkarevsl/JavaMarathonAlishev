package tasks.lambdaSpesialist;

public class App {

    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();

        //event subscribe - подписка на событие
        sw.consumer=lamp;
        sw.switchOn();
    }
}

package day5.task1;

/**
 Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
 Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
 задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
 Созданный вами класс должен отвечать принципам инкапсуляции.

 */
public class Task1 {

    public static void main(String[] args) {
        Auto auto = new Auto();

        auto.setColor("Green");
        auto.setModel("BMW");
        auto.setYear(2020);

        System.out.println(auto.getColor());
        System.out.println(auto.getModel());
        System.out.println(auto.getYear());
    }
}

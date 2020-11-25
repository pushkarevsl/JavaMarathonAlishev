package practiceAlishev.day5.task2;

/**
 Создать класс Мотоцикл (англ. Motorbike), с полями “Год выпуска”, “Цвет”, “Модель”.
 Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не использовать).
 Придерживаться принципов инкапсуляции и использовать ключевое слово this.
 Геттером получить год выпуска, цвет, модель, вывести значения в консоль.

 */
public class Task2 {

    public static void main(String[] args) {

        Motobike bike = new Motobike(2019, "Red", "Hayabusa");

        System.out.println(bike.getYear());
        System.out.println(bike.getColor());
        System.out.println(bike.getModel());
    }

}

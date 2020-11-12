package day12.task1;

import java.util.ArrayList;
import java.util.List;

/**
 1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
 Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка.
 Распечатать список.
 */
public class Task1 {

    public static void main(String[] args) {

        List<Auto> autos = new ArrayList<Auto>(){{
            add(new Auto("BMW"));
            add(new Auto("audi"));
            add(new Auto("Mercedes"));
            add(new Auto("Lada"));
        }};

        autos.add(2, new Auto("Niva"));

        System.out.println(autos);

        autos.remove(3);

        System.out.println(autos);
    }
}

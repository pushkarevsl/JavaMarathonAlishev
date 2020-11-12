package day12.task4;

import java.util.ArrayList;
import java.util.List;

/**
 * Выполнять в подпапке task4 в day12*
 * Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в группу можно было добавлять и
 * удалять участников. Под участником понимается строка (String) с именем и фамилией.
 * <p>
 * Реализовать статический метод слияния групп (в классе MusicBand), т.е. все участники группы А переходят в группу B.
 * Название метода: transferMembers. Этот метод принимает в качестве аргументов два экземпляра класса MusicBand.
 * Реализовать метод printMembers (в классе MusicBand), выводящий список участников в консоль.
 * Проверить состав групп после слияния.
 */
public class Task4 {

    public static void main(String[] args) {

        List<String> persons1 = new ArrayList<String>(){{
            add("Васильев Василий");
            add("Семенов Семен");
            add("Денисов Денис");
        }};

        List<String> persons2 = new ArrayList<String>(){{
            add("Котов Василий");
            add("Конев Семен");
            add("Собакин Шарик");
        }};

        MusicBand musicBand1 = new MusicBand("Люди", 20, persons1);
        MusicBand musicBand2 = new MusicBand("неЛюди", 10, persons2);

        MusicBand.movingPersons(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}

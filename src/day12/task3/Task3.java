package day12.task3;

import java.util.ArrayList;
import java.util.List;

/**
 * Выполнять в подпапке task3в day12*
 * Создать класс Музыкальная Группа (англ. MusicBand)с полями name и year (название музыкальной группы и год основания).
 * Создать 10 или более экземпляров класса MusicBand, добавить их в список (выбирайте такие музыкальные группы,
 * которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать список. Создать статический метод
 * в классе Task3:
 * public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
 * Этот метод принимает список групп в качестве аргумента и возвращает новый список, состоящий из групп,
 * основанных после 2000 года. Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке
 * из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года).
 */
public class Task3 {

    public static void main(String[] args) {

        List<MusicBand> musicBands = new ArrayList<MusicBand>() {{
            add(new MusicBand("Иванушки", 1998));
            add(new MusicBand("Иванушки1", 1998));
            add(new MusicBand("Иванушки2", 2001));
            add(new MusicBand("Иванушки3", 2002));
            add(new MusicBand("Иванушки4", 2003));
            add(new MusicBand("Иванушки5", 2004));
            add(new MusicBand("Иванушки6", 1232));
            add(new MusicBand("Иванушки7", 1998));
            add(new MusicBand("Иванушки8", 1998));
            add(new MusicBand("Иванушки8", 2010));
        }};

        System.out.println(groupsAfter2000(musicBands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {

        List<MusicBand> groupsAfter2000 = new ArrayList<>();

        for (MusicBand musicBand : bands) {
            if (musicBand.getYear() > 2000) {
                groupsAfter2000.add(musicBand);
            }
        }
        return groupsAfter2000;
    }
}

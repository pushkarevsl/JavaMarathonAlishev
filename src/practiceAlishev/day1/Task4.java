package practiceAlishev.day1;

/**
 * Объявите переменную типа int, имя переменной - year. присвойте этой переменной значение 1980. используя цикл
 * while, выведите столбик строки вида "Олимипиада Х года", где Х - это число, которое принимает значения, начиная
 * от 1980 до 2020 с шагом увеличения равным 4.
 */
public class Task4 {

    public static void main(String[] args) {

        int year = 1980;
        while (year <= 2020) {
            System.out.println("Олимипиада " + year + " года");
            year += 4;
        }
    }
}

package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Реализовать программу, которая на вход принимает txt файл с целыми числами (можно использовать файл из
 * задания 1 дня 14) и в качестве ответа выводит в консоль среднее арифметическое этих чисел.
 * Ответ будет являться вещественным числом. В консоль необходимо вывести полную запись вещественного числа
 * (со всеми знаками после запятой) и сокращенную запись (с 3 знаками после запятой).
 * <p>
 * Детали реализации: В классе Task1 создать публичный статический метод printResult(File file), в котором
 * реализовать вышеописанную логику. В методе main() класса Task1 вызвать метод printResult(File file), передав
 * ему в качестве аргумента объект класса File (txt файл с целыми числами).
 * <p>
 * Пример:
 * Числа в txt файле: 5 2 8 34 1 36 77
 * Ответ: 23.285714285714285 --> 23,286
 */
public class Task1 {

    public static void main(String[] args) {

        File file = new File("test");
        printResult(file);

    }

    public static void printResult(File file) {
        Scanner scanner;

        try {
            scanner = new Scanner(file);
            String line = scanner.nextLine();
            scanner.close();

            String[] num = line.split(" ");

            int[] ints = new int[num.length];

            int sum = 0;

            for (String i : num) {
                sum += Integer.parseInt(i);
            }

            double fullAvg = (double) sum / ints.length;

            System.out.printf(fullAvg + "--> %.3f", fullAvg);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

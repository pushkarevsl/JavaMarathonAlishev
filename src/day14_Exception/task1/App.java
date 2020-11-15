package day14_Exception.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Создать .txt файл в папке проекта, как показано в видео (урок 36, время 15:30).
 * Заполнить его вручную десятью произвольными числами. Реализовать статический метод printSumDigits(File file),
 * который считает сумму всех чисел в этом файле и выводит ее на экран. Вызвать данный метод в методе main().
 * Если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить
 * в консоль сообщение “Файл не найден”. Помимо этого, если чисел в файле меньше или больше 10,
 * необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
 */

public class App {

    public static void main(String[] args) {

        File file = new File("test");
        printSumDigits(file);

    }

    private static void printSumDigits(File file) {
        Scanner scanner;

        try {
            scanner = new Scanner(file);
            String line = scanner.nextLine();
            scanner.close();

            String[] num = line.split(" ");

            if (num.length != 10) {
                throw new IllegalArgumentException();
            }

            int[] ints = new int[10];
            int count = 0;

            for (String i : num) {
                ints[count++] = Integer.parseInt(i);
            }

            int sum = 0;
            for (int i : ints) {
                sum += i;
            }
            System.out.println(Arrays.toString(ints));
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

    }
}

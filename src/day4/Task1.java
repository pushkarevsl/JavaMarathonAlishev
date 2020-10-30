package day4;

import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/**
 * С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить
 * его случайными числами от 0 до 10. Затем вывести содержимое массива в консоль, а также вывести в консоль
 * информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 * <p>
 * Пример:
 * Введено число 10. Сгенерирован следующий массив:
 * [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
 * <p>
 * Информация о массиве:
 * Длина массива: 10
 */
public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int n = scanner.nextInt();
        scanner.close();

        Random rnd = new Random();
        int[] ints = new int[n];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = rnd.nextInt(10);
        }

        int countMoreEight = 0;
        int countChet = 0;
        int countNeChet = 0;
        int cOne = 0;
        int sum = 0;

        for (int i : ints) {
            sum += i;

            if (i > 8) {
                countMoreEight++;
            } else if (i == 1) {
                cOne++;
            } else if (i % 2 == 0) {
                countChet++;
            }
            if (i % 2 != 0) {
                countNeChet++;
            }
            System.out.print(i + " ");
        }

        System.out.println(" ");
        System.out.println("Длина массива: " + n);
        System.out.println("Количестве чисел больше 8 " + countMoreEight);
        System.out.println("Количестве чисел равных 1 " + cOne);
        System.out.println("Количестве четных чисел " + countChet);
        System.out.println("Количестве нечетных чисел " + countNeChet);
        System.out.println("Сумме всех элементов массив " + sum);
    }

}

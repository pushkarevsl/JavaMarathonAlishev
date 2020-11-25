package practiceAlishev.day2;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 Есть два числа, которые задаются пользователем через консоль (назовем эти два числа a и b).
 Используя цикл for, вывести все числа из диапазона между a и b, которые делятся на 5 без остатка,
 но при этом не делятся на 10 без остатка.
 Например, число 15 подходит под наше условие (делится на 5 без остатка и не делится на 10 без остатка),
 но число 20 не подходит под наше условие (делится на 5 без остатка и делится на 10 без остатка).
 Сами числа a и b в диапазоне не учитывать. Если a >= b вывести сообщение "Некорректный ввод".

 Пример:
 Вводим в консоли: 7 78
 Вывод: 15 25 35 45 55 65 75

 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int firstValue = scanner.nextInt();
        int secondValue = scanner.nextInt();

        for(int i = firstValue; i<secondValue; i++) {
            if (i % 10 != 0) {
                if (i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}

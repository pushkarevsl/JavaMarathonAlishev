package practiceAlishev.day4;

import java.util.Random;

/**
 * Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
 * Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой
 * выведите значение суммы и индекс первого элемента тройки.
 * Пример:
 * Для простоты пример показан на массиве размера 10
 * [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]
 * Тройка с максимальной суммой: [2789, 4, 8742]
 * Вывод в консоль:
 * 11535
 * 5
 */
public class Task4_x {

    public static void main(String[] args) {

        int[] ints = new int[100];
        Random rnd = new Random();

        for (int i = 0; i < ints.length; i++) {
            ints[i] = rnd.nextInt(1000);
        }

        int index = 0;
        int maxSum = 0;

        for (int i = 0; i < ints.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += ints[j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                index = i;
            }
        }

        System.out.println("index = " + index);
        System.out.println("sum = " + maxSum);
    }
}

package day4;

import java.util.*;

/**
 * Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
 * Затем, используя циклы for each вывести:
 * наибольший элемент массива
 * наименьший элемент массива
 * количество элементов массива, оканчивающихся на 0
 * сумму элементов массива, оканчивающихся на 0 Использовать сортировку запрещено.
 */
public class Task2 {
    public static void main(String[] args) {

        int[] ints = new int[100];

        Random rnd = new Random();

        for (int i = 0; i < ints.length; i++) {
            ints[i] = rnd.nextInt(1000);
        }

        int max = 0;
        int min = 0;

        for (int i = 1; i < ints.length; i++) {
            max = min = ints[0];
            if (ints[i] > max) {
                max = ints[i];
            }
            if (ints[i] < min) {
                min = ints[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}

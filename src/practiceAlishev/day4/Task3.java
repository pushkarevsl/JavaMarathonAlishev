package practiceAlishev.day4;

import java.util.Random;

/**
 * Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер матрицы задать m=12, n=8
 * (m - размерность по строкам, n - размерность по колонкам). В консоль вывести индекс строки, сумма чисел
 * в которой максимальна. Если таких строк несколько, вывести индекс последней из них.
 * Пример сгенерированной матрицы (для простоты m=3, n=5):
 * <p>
 * 3 2 1 5 7	// сумма - 18
 * 1 2 5 6 2	// сумма - 16
 * 3 4 9 6 4	// сумма - 26
 * <p>
 * Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
 */
public class Task3 {

    public static void main(String[] args) {

        int[][] matrix = new int[12][8];

        Random rnd = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[j].length; j++) {
                matrix[i][j] = rnd.nextInt(50);
            }
        }

        int maxSum = 0;
        int countRow = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            System.out.println();
            for (int j = 0; j < matrix[j].length; j++) {
                System.out.print(matrix[i][j] + " ");
                sum += matrix[i][j];

                if (sum >=maxSum) {
                    maxSum = sum;
                    countRow = i;
                }
            }
        }
        System.out.println(" ");
        System.out.println("Сумма строки = " + maxSum);
        System.out.println("Индекс строки с максимальной суммой = " + countRow);

    }
}

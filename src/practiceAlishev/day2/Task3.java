package practiceAlishev.day2;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Реализовать программу №2, используя цикл while.
 */

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        int firstValue = scanner.nextInt();
        int secondValue = scanner.nextInt();

        while (firstValue <= secondValue) {
            if (firstValue % 10 != 0) {
                if (firstValue % 5 == 0) {
                    System.out.print(firstValue + " ");
                }
            }
            firstValue++;
        }
    }
}

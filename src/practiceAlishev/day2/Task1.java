package practiceAlishev.day2;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner, число, соответствующее
 количеству этажей в здании. Используя условный оператор if, необходимо вывести в консоль сообщение о типе
 такого дома.
 Условия: если этажей 1-4 -"Малоэтажный дом", 5-8 -"Среднетажный дом", 9 и более -"Многоэтажный дом".
 Так же, необходимо учест, что может быть введено отрицательное значение, в таком случае сообщить
 "Ошибка ввода"
 */

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int i = scanner.nextInt();

        if(i<1){
            System.out.println("Ошибка ввода");
        }else if(i>=1 && i<=4){
            System.out.println("Малоэтажный дом");
        }else if(i>=5 && i<=8){
            System.out.println("Малоэтажный дом");
        }else{
            System.out.println("Многоэтажный дом");
        }
    }
}

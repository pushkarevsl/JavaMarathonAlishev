package day6.task1;

import day5.task2.Motobike;

/**
 В классах Автомобиль и Мотоцикл реализовать два метода:
 info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
 yearDifference() - принимает на вход число (год), и возвращает разницу между переданным
 годом и годом выпуска транспортного средства
 */
public class Task1 {

    public static void main(String[] args) {

        Auto auto = new Auto(2019, "BMW", "Red");

        System.out.println(auto.info());
        System.out.println(auto.yearDifference(2000));

        Motobike bike = new Motobike(2019, "Red", "Hayabusa");

        System.out.println(bike.info());
        System.out.println(bike.yearDifference(2010));

    }
}

package day7_Players_x.task1;

import static day7_Players_x.task1.Airplane.compareAirplanes;

/**
 Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
 В классе Самолет создать статический метод  compareAirplanes, который в качестве аргументов принимает
 два объекта класса Airplane (два самолета) и выводит сообщение в консоль о том, какой из самолетов длиннее.
 */
public class Task7 {

    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("Boeing", 2020, 37, 10000);
        Airplane airplane2 = new Airplane("Airbus", 2019, 32, 9800);

        compareAirplanes(airplane1, airplane2);
    }
}

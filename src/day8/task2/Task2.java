package day8.task2;

/**
 Скопируйте класс Самолет из задания дня 6.
 Внесите изменения в класс таким образом, чтобы следующий код выводил информацию о самолете,
 аналогично вызову метода info().
 Airplane airplane = newAirplane ("Boeing",2000,150,10000); System.out.println(airplane);
 */
public class Task2 {

    public static void main(String[] args) {
      Airplane airplane = new Airplane("Boeng", 2010, 42, 3200);

        airplane.setYear(2000);
        airplane.setLength(37);
        airplane.fillUp(10);
        airplane.fillUp(100);

        airplane.info();
    }
}

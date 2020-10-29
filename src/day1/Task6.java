package day1;

/**
 Объявите переменную типа int, имя переменной k. Присвойте этой переменной какую-нибудь цифру от 1 до 9.
 Используя цикл на ваше усмотрение (for или while), выведите в кконсоль таблицу умножения для этой цифры.
 */

public class Task6 {

    public static void main(String[] args) {
        int k =3;

        for(int i=1; i<10; i++){
            System.out.println(i + " * " + k + " = " + i * k);
        }
    }


}

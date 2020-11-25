package practiceAlishev.day14_Exception.task3;

public class Person {

    private String name;
    private int age;

    @Override
    public String toString() {
        return "{name= '" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

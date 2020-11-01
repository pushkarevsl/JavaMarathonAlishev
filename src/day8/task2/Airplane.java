package day8.task2;

public class Airplane {

    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println(airplane1.producer + " он длиннее, чем " + airplane2.producer);
        } else if (airplane1.getLength() < airplane2.getLength()) {
            System.out.println(airplane2.producer + " он длиннее, чем " + airplane1.producer);
        }else{
            System.out.println("Длины самолетов равны");
        }
    }

    public void fillUp(int input) {
        fuel += input;
    }

    public void info() {
        StringBuilder sb = new StringBuilder();
        sb.append("Изготовитель: ")
                .append(producer)
                .append(", год выпуска: ")
                .append(year)
                .append(", длина: ")
                .append(length)
                .append( ", вес: ")
                .append(weight)
                .append(", количество топлива в баке:")
                .append(fuel);
        System.out.println(sb.toString());
    }

    public int getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}

package practiceAlishev.day12.task1;

public class Auto {

    private String model;

    public Auto(String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return "{model='" + model + '\'' +
                '}';
    }
}

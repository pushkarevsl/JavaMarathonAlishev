package day6.task1;

public class Auto {

    private int year;
    private String color;
    private String model;

    public String info() {
        return "Это автомобиль";
    }

    public int yearDifference(int year){
        return Math.abs(year - this.year);
    }

    public Auto() {
    }

    public Auto(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

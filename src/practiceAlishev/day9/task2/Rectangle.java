package practiceAlishev.day9.task2;

public class Rectangle extends Figure {

    private double a;
    private double b;

    public Rectangle(String color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return 2*(a+b);
    }
}

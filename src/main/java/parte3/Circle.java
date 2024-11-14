package parte3;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this(1);
    }

    public Circle(double r) {
        radius = r;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}

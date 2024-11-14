package parte3;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(float length, float width) {
        if(length < 0) throw new IllegalArgumentException("Lenght cannot be < 0.");
        if(width < 0) throw new IllegalArgumentException("Width cannot be < 0.");

        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this(1, 1);
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if(length < 0) throw new IllegalArgumentException("Value < 0 not permitted.");

        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if(width < 0) throw new IllegalArgumentException("Value < 0 not permitted.");

        this.width = width;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    public String toString() {
        return String.format("Rectangle[length=%f, width=%f]", length, width);
    }
}

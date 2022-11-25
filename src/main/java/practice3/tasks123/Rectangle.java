package practice3.tasks123;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this.filled = false;
        this.color = "blue";
        this.width = 1;
        this.length = 2;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.filled = false;
        this.color = "blue";
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;

    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return width * 2 + length * 2;
    }

    @Override
    public String toString() {
        return "Shape: rectangle, width: " + this.width + ", length: " + this.length + ", color: " + this.color;
    }
}

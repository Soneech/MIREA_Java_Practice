package practice3.tasks123;

public class Square extends Rectangle {
    public Square() {
        this.filled = false;
        this.color = "blue";
    }

    public Square(double side) {
        super(side, side);
        this.filled = false;
        this.color = "blue";
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Shape: square, side: " + this.length + ", color: " + this.color;
    }
}

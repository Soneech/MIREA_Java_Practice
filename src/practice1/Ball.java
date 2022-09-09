package practice1;

public class Ball {
    private double weight, circLength;

    public Ball(double weight, double circLength) {
        this.weight = weight;
        this.circLength = circLength;
    }

    public Ball() {
        this.circLength = 560;
        this.weight = 0.3;
    }

    public String toString() {
        return "ball weight: " + weight + "ball circLength: " + circLength;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCircLength() {
        return circLength;
    }

    public void setCircLength(double circLength) {
        this.circLength = circLength;
    }
}

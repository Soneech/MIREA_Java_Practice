package practice11.task3;

public class Const implements Expression {
    private double value;

    public Const(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public double evaluate(double arg) {
        return value;
    }
}

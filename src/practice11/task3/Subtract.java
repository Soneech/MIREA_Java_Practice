package practice11.task3;

public class Subtract implements Expression{
    private Expression value1, value2;

    public Subtract(Expression first, Expression second) {
        this.value1 = first;
        this.value2 = second;
    }
    @Override
    public double evaluate(double arg) {
        return value1.evaluate(arg) - value2.evaluate(arg);
    }
}

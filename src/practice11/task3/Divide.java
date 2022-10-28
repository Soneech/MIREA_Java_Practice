package practice11.task3;

public class Divide implements Expression {
    private Expression value1, value2;

    public Divide(Expression first, Expression second) {
        this.value1 = first;
        this.value2 = second;
    }

    @Override
    public double evaluate(double arg) {
        return value1.evaluate(arg) + value2.evaluate(arg);
    }
}

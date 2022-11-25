package practice11.task3;

public class Variable implements Expression{
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double evaluate(double arg) {
        return arg;
    }
}

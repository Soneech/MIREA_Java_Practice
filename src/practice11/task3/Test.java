package practice11.task3;

public class Test {
    public static void main(String[] args) {
        double result = new Subtract(
                new Multiply(
                        new Const(2),
                        new Variable("x")),
                        new Const(3)).evaluate(5);
        System.out.println(result);

        result = new
                Add(
                    new Subtract(
                            new Multiply(
                                    new Variable("x"),
                                    new Variable("x")),
                            new Multiply(
                                    new Const(2),
                                    new Variable("x"))),
                    new Const(1)).evaluate(1);
    }
}

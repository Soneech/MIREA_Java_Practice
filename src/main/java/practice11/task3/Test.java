package practice11.task3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double result = new Subtract(
                new Multiply(
                        new Const(2),
                        new Variable("x")),
                        new Const(3)).evaluate(5);
        System.out.println(result);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double value = scanner.nextDouble();

        result = new
                Add(
                    new Subtract(
                            new Multiply(
                                    new Variable("x"),
                                    new Variable("x")),
                            new Multiply(
                                    new Const(2),
                                    new Variable("x"))),
                    new Const(1)).evaluate(value);
        System.out.printf("Результат: %f", result);
    }
}

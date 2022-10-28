package practice10.task1;

public class Main {
    public static void main(String[] args) {
        ComplexAbstractFactory complexAbstractFactory;

        complexAbstractFactory = new ConcreteFactory();
        complexAbstractFactory.createComplex().description();
    }
}

package practice10.task1;

public interface ComplexAbstractFactory {
    int a = 0;
    public Complex createComplex();
    public Complex createComplex(int real, int image);
}

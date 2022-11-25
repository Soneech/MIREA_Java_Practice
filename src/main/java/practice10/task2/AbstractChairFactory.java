package practice10.task2;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair(int age);
    public MagicChair createMagicChair();
    public FunctionalChair createFunctionalChair();
}

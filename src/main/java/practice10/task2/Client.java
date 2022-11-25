package practice10.task2;

public class Client {
    public Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public void sit() {
        System.out.println("sit on a " + chair.getClass().getName());
    }
}

package practice2.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(150, 150);
        System.out.println(ball);
        System.out.println(ball.getX());

        Ball ball2 = new Ball(200, 200);
        System.out.println(ball2);
        ball2.move(10, 10);
        System.out.println(ball2);
    }
}

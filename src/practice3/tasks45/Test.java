package practice3.tasks45;

public class Test {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(5, 2, 10, 15);
        System.out.println(movablePoint);
        movablePoint.moveUp();
        System.out.println("Move up: " + movablePoint);
        movablePoint.moveDown();
        System.out.println("Move down: " + movablePoint);
        movablePoint.moveLeft();
        System.out.println("Move left: " + movablePoint);
        movablePoint.moveRight();
        System.out.println("Move right: " + movablePoint);

        System.out.println("------------------------------------------------------------------");

        MovableRectangle movableRectangle = new MovableRectangle(0, 10, 5, 0, 5, 5);
        System.out.println(movableRectangle);
        movableRectangle.moveUp();
        System.out.println("Move up: " + movableRectangle);
        movableRectangle.moveDown();
        System.out.println("Move down: " + movableRectangle);
        movableRectangle.moveLeft();
        System.out.println("Move left: " + movableRectangle);
        movableRectangle.moveRight();
        System.out.println("Move right: " + movableRectangle);

        System.out.println("------------------------------------------------------------------");

        MovableCircle movableCircle = new MovableCircle(0, 0, 5, 8, 10);
        System.out.println(movableCircle);
        movableCircle.moveUp();
        System.out.println("Move up: " + movableCircle);
        movableCircle.moveDown();
        System.out.println("Move down: " + movableCircle);
        movableCircle.moveLeft();
        System.out.println("Move left: " + movableCircle);
        movableCircle.moveRight();
        System.out.println("Move right: " + movableCircle);
    }

}

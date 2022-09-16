package practice3.tasks45;

public class MovableRectangle implements Movable{

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "Type: MovableRectangle; topLeft: x=" + topLeft.x + ", y=" + topLeft.y + "; bottomRight: x=" +
                bottomRight.x + ", y=" + bottomRight.y + "; xSpeed: " + topLeft.xSpeed + "; ySpeed: " + topLeft.ySpeed;
    }

    @Override
    public void moveUp() {
        if (isSpeedCorrect()){
            topLeft.y += topLeft.ySpeed;
            bottomRight.y += bottomRight.ySpeed;
        }
        else {
            movementError();
        }
    }

    @Override
    public void moveDown() {
        if (isSpeedCorrect()){
            topLeft.y -= topLeft.ySpeed;
            bottomRight.y -= bottomRight.ySpeed;
        }
        else {
            movementError();
        }
    }

    @Override
    public void moveLeft() {
        if (isSpeedCorrect()){
            topLeft.x -= topLeft.xSpeed;
            bottomRight.x -= bottomRight.xSpeed;
        }
        else {
            movementError();
        }
    }

    @Override
    public void moveRight() {
        if (isSpeedCorrect()){
            topLeft.x += topLeft.xSpeed;
            bottomRight.x += bottomRight.xSpeed;
        }
        else {
            movementError();
        }
    }

    public boolean isSpeedCorrect() {
        return (topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed);
    }

    public void movementError() {
        System.out.println("Движение невозможно");
    }
}

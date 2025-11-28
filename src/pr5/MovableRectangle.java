package pr5;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int leftX, int topY, int rightX, int bottomY, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(leftX, topY, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(rightX, bottomY, xSpeed, ySpeed);
    }

    public MovablePoint getTopLeft() { return topLeft; }
    public MovablePoint getBottomRight() { return bottomRight; }

    public boolean hasSameSpeed() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed() &&
                topLeft.getYSpeed() == bottomRight.getYSpeed();
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return String.format("MovableRectangle{topLeft=%s, bottomRight=%s, sameSpeed=%b}",
                topLeft, bottomRight, hasSameSpeed());
    }
}

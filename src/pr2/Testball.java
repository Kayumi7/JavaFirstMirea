package pr2;

public class Testball {
    public static void main(String[] args) {
        Ball ball = new Ball(100, 100);
        System.out.println(ball);
        ball.move(30,15);
        System.out.println(ball);
    }
}

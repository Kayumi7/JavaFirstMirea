package pr8;

import javax.swing.*;
import java.awt.*;
import java.awt.Shape;
import java.util.Random;

public class Task2 extends JPanel {

    private final java.awt.Shape[] shapes = new java.awt.Shape[20];

    public Task2() {
        Random rand = new Random();

        for (int i = 0; i < shapes.length; i++) {
            int type = rand.nextInt(3);
            Color color = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
            int x = rand.nextInt(500);
            int y = rand.nextInt(400);

            switch (type) {
                case 0 -> shapes[i] = new Circle(color, x, y, 30 + rand.nextInt(50));
                case 1 -> shapes[i] = new Square(color, x, y, 40 + rand.nextInt(40));
                case 2 -> shapes[i] = new RectangleShape(color, x, y, 40 + rand.nextInt(50), 30 + rand.nextInt(50));
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape s : shapes) {
            s.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.add(new Task2 ());
        frame.setVisible(true);
    }
}

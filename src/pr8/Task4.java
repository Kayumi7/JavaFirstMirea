package pr8;

import javax.swing.*;
import java.awt.*;

public class Task4 extends JPanel {
    private final ImageIcon[] frames;
    private int current = 0;

    public Task4() {
        frames = new ImageIcon[]{
                new ImageIcon(getClass().getResource("frame1.png")),
                new ImageIcon(getClass().getResource("frame2.png")),
                new ImageIcon(getClass().getResource("frame3.png")),
                new ImageIcon(getClass().getResource("frame4.png"))
        };


        Timer timer = new Timer(150, e -> {
            current = (current + 1) % frames.length;
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        frames[current].paintIcon(this, g, 50, 30);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Task4());
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}

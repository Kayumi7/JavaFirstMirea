package pr8;

import java.awt.*;
import java.awt.Shape;

public class Square extends Shape {
    private int size;

    public Square(Color color, int x, int y, int size) {
        super(color, x, y);
        this.size = size;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, size, size);
    }
}

package pr8;

import javax.swing.*;

public class Task3 extends JFrame {
    public Task3(String path) {
        super("Image Viewer");
        JLabel label = new JLabel(new ImageIcon(path));
        add(label);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Укажите путь к изображению!");
            return;
        }
        SwingUtilities.invokeLater(() -> new Task3(args[0]));
    }
}

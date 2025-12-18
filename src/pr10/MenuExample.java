package pr10;

import javax.swing.*;
import java.awt.*;

public class MenuExample extends JFrame {

    JTextArea textArea = new JTextArea(10, 30);

    public MenuExample() {
        super("Пример меню");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ===== Меню =====
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Файл");
        JMenuItem saveItem = new JMenuItem("Сохранить");
        JMenuItem exitItem = new JMenuItem("Выйти");

        JMenu editMenu = new JMenu("Правка");
        JMenuItem copyItem = new JMenuItem("Копировать");
        JMenuItem cutItem = new JMenuItem("Вырезать");
        JMenuItem pasteItem = new JMenuItem("Вставить");

        JMenu helpMenu = new JMenu("Справка");
        JMenuItem aboutItem = new JMenuItem("О программе");

        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        editMenu.add(copyItem);
        editMenu.add(cutItem);
        editMenu.add(pasteItem);

        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        // ===== Панель с кнопками =====
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        JButton btnClear = new JButton("Очистить");
        JButton btnHello = new JButton("Привет");

        buttonPanel.add(btnClear);
        buttonPanel.add(btnHello);

        // ===== Основная панель =====
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(new JScrollPane(textArea), BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);

        // ===== Обработчики =====
        exitItem.addActionListener(e -> System.exit(0));

        saveItem.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Файл сохранён!")
        );

        copyItem.addActionListener(e -> textArea.copy());
        cutItem.addActionListener(e -> textArea.cut());
        pasteItem.addActionListener(e -> textArea.paste());

        aboutItem.addActionListener(e ->
                JOptionPane.showMessageDialog(this,
                        "Практическая работа №15\nМеню и GUI",
                        "Справка",
                        JOptionPane.INFORMATION_MESSAGE)
        );

        btnClear.addActionListener(e -> textArea.setText(""));
        btnHello.addActionListener(e -> textArea.append("Здравствуйте!\n"));

        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}

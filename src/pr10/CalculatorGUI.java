package pr10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame {

    JTextField display = new JTextField();
    String operator = "";
    double firstNumber = 0;

    public CalculatorGUI() {
        super("Калькулятор");
        setSize(300, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display.setFont(new Font("Arial", Font.BOLD, 20));
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 16));
            panel.add(btn);

            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    buttonClick(text);
                }
            });
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void buttonClick(String text) {
        try {
            if (text.matches("[0-9]")) {
                display.setText(display.getText() + text);
            } else if (text.matches("[+\\-*/]")) {
                firstNumber = Double.parseDouble(display.getText());
                operator = text;
                display.setText("");
            } else if (text.equals("=")) {
                double secondNumber = Double.parseDouble(display.getText());
                double result = 0;

                switch (operator) {
                    case "+": result = firstNumber + secondNumber; break;
                    case "-": result = firstNumber - secondNumber; break;
                    case "*": result = firstNumber * secondNumber; break;
                    case "/": result = firstNumber / secondNumber; break;
                }

                display.setText(String.valueOf(result));
            } else if (text.equals("C")) {
                display.setText("");
                operator = "";
                firstNumber = 0;
            }
        } catch (Exception e) {
            display.setText("Ошибка");
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}

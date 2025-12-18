package pr10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    JTextField tf1 = new JTextField(10);
    JTextField tf2 = new JTextField(10);

    JButton btnAdd = new JButton("+");
    JButton btnSub = new JButton("-");
    JButton btnMul = new JButton("*");
    JButton btnDiv = new JButton("/");

    public Calculator() {
        super("Калькулятор");
        setSize(300, 200);
        setLayout(new FlowLayout());

        add(new JLabel("Первое число:"));
        add(tf1);

        add(new JLabel("Второе число:"));
        add(tf2);

        add(btnAdd);
        add(btnSub);
        add(btnMul);
        add(btnDiv);

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate("+");
            }
        });

        btnSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate("-");
            }
        });

        btnMul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate("*");
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate("/");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void calculate(String op) {
        try {
            double a = Double.parseDouble(tf1.getText());
            double b = Double.parseDouble(tf2.getText());
            double result = 0;

            switch (op) {
                case "+": result = a + b; break;
                case "-": result = a - b; break;
                case "*": result = a * b; break;
                case "/":
                    if (b == 0) throw new ArithmeticException();
                    result = a / b;
                    break;
            }

            JOptionPane.showMessageDialog(
                    this,
                    "Результат: " + result,
                    "Ответ",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Ошибка ввода данных!",
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

package pr10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountryMenu extends JFrame {

    JComboBox<String> countries;

    public CountryMenu() {
        super("Выбор страны");
        setSize(300, 150);
        setLayout(new FlowLayout());

        String[] countryList = {
                "Россия",
                "Германия",
                "Франция",
                "Япония",
                "США"
        };

        countries = new JComboBox<>(countryList);
        add(new JLabel("Выберите страну:"));
        add(countries);

        countries.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showInfo((String) countries.getSelectedItem());
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void showInfo(String country) {
        String info = "";

        switch (country) {
            case "Россия":
                info = "Столица: Москва\nНаселение: ~146 млн";
                break;
            case "Германия":
                info = "Столица: Берлин\nНаселение: ~83 млн";
                break;
            case "Франция":
                info = "Столица: Париж\nНаселение: ~67 млн";
                break;
            case "Япония":
                info = "Столица: Токио\nНаселение: ~125 млн";
                break;
            case "США":
                info = "Столица: Вашингтон\nНаселение: ~331 млн";
                break;
        }

        JOptionPane.showMessageDialog(
                this,
                info,
                "Информация о стране",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static void main(String[] args) {
        new CountryMenu();
    }
}

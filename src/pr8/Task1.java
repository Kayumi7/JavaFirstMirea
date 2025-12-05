package pr8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Task1 extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;

    private final JLabel resultLabel = new JLabel("Result: 0 X 0");
    private final JLabel lastScorerLabel = new JLabel("Last Scorer: N/A");
    private final JLabel winnerLabel = new JLabel("Winner: DRAW");

    public Task1() {
        super("Milan vs Madrid");

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        milanButton.addActionListener((ActionEvent e) -> updateScore(true));
        madridButton.addActionListener((ActionEvent e) -> updateScore(false));

        setLayout(new GridLayout(3, 2, 10, 10));

        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);

        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void updateScore(boolean milanScored) {
        if (milanScored) {
            milanScore++;
            lastScorerLabel.setText("Last Scorer: AC Milan");
        } else {
            madridScore++;
            lastScorerLabel.setText("Last Scorer: Real Madrid");
        }

        resultLabel.setText("Result: " + milanScore + " X " + madridScore);

        if (milanScore > madridScore)
            winnerLabel.setText("Winner: AC Milan");
        else if (madridScore > milanScore)
            winnerLabel.setText("Winner: Real Madrid");
        else
            winnerLabel.setText("Winner: DRAW");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Task1::new);
    }
}

package practice4.task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scores extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;
    private String winner;

    String acMilan = "AC Milan";
    String madrid = "Real Madrid";

    JButton milanBtn = new JButton(acMilan);
    JButton madridBtn = new JButton(madrid);

    JLabel resultLabel = new JLabel("Result 0 X 0");
    JLabel lastScorerLabel = new JLabel("Last Scorer: N/A");
    Label winnerLabel = new Label("Winner: DRAW");

    JPanel resultPanel = new JPanel();
    JPanel lastScorerPanel = new JPanel();
    JPanel winnerPanel = new JPanel();
    JPanel buttonsPanel = new JPanel();

    public Scores() {
        super("Scores");
        setSize(300, 400);
        setLayout(new GridLayout(4, 1));

        resultPanel.setLayout(new FlowLayout());
        lastScorerPanel.setLayout(new FlowLayout());
        winnerPanel.setLayout(new FlowLayout());
        buttonsPanel.setLayout(new FlowLayout());

        resultPanel.add(resultLabel);
        lastScorerPanel.add(lastScorerLabel);
        winnerPanel.add(winnerLabel);
        buttonsPanel.add(milanBtn);
        buttonsPanel.add(madridBtn);

        add(resultPanel);
        add(lastScorerPanel);
        add(winnerPanel);
        add(buttonsPanel);

        milanBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore += 1;
                winner = winnerChoice();
                resultLabel.setText("Result " + milanScore + " X " + madridScore);
                lastScorerLabel.setText("Last Scorer: " + acMilan);
                winnerLabel.setText("Winner: " + winner);
            }
        });

        madridBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore += 1;
                winner = winnerChoice();
                resultLabel.setText("Result " + milanScore + " X " + madridScore);
                lastScorerLabel.setText("Last Scorer: " + madrid);
                winnerLabel.setText("Winner: " + winner);
            }
        });
        setVisible(true);
    }

    public String winnerChoice() {
        if (milanScore > madridScore)
            return acMilan;
        if (milanScore == madridScore)
            return "N/A";
        return madrid;
    }

    public static void main(String[] args) {
        new Scores();
    }
}

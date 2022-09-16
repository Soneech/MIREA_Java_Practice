package practice4.examples.example3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaExample extends JFrame {
    JTextArea jta1 = new JTextArea(10,25);
    JScrollPane jScroll = new JScrollPane(jta1);
    JButton button = new JButton("Add some Text");
    public TextAreaExample() {
        super("Example");
        setSize(300,300);
        setLayout(new FlowLayout());
        add(jScroll);
        add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                String txt = JOptionPane.showInputDialog(null,"Insertsome text");
                jta1.append(txt);
            }
        });
    }

    public static void main(String[]args) {
        new TextAreaExample().setVisible(true);
    }
}

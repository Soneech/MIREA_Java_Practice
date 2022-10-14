package practice9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.HashSet;

public class OnlineShop extends JFrame {
    private HashSet<User> users = new HashSet<>();
    public OnlineShop(String title) {
        super(title);
        setSize(500, 500);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JLabel titleLabel = new JLabel("Online shop");
        titleLabel.setFont(new Font("Serif", Font.PLAIN, 30));

        JLabel nameLabel = new JLabel("Введите ФИО:");
        JTextField nameField = new JTextField(30);

        JLabel innLabel = new JLabel("Введите ИНН:");
        JTextField innField = new JTextField(30);

        JLabel orderLabel = new JLabel("Введите артикул позиций для заказа через запятую:");
        JTextField orderField = new JTextField(30);

        JButton orderButton = new JButton("Заказать");
        JButton regButton = new JButton("Зарегистрироваться");

        orderButton.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    publishOrder(orderField.getText(), new User(nameField.getText(), Long.parseLong(innField.getText())));
                    JOptionPane.showMessageDialog(getContentPane(), "Заказ размещен", "Успех", JOptionPane.INFORMATION_MESSAGE);
                } catch(InnIncorrectException exception) {
                    exception.printStackTrace();
                    JOptionPane.showMessageDialog(getContentPane(), "Недействительный ИНН для текущего пользователя", "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        regButton.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                User user = registerDialog();
                if (user != null) {
                    users.add(user);
                }
            }
        });

        nameField.setMaximumSize(nameField.getPreferredSize());
        innField.setMaximumSize(innField.getPreferredSize());
        orderField.setMaximumSize(nameField.getPreferredSize());

        add(titleLabel);
        add(nameLabel);
        add(nameField);
        add(innLabel);
        add(innField);
        add(orderLabel);
        add(orderField);
        add(orderButton);
        add(regButton);

        setVisible(true);
    }

    private void publishOrder(String order, User user) {
        if(!users.contains(user)) {
            throw new InnIncorrectException("FIO: " + user.getName() + ", INN: " + user.getInn());
        }
        System.out.println("Server-server, here's the data: " + order);
    }

    private static User registerDialog() {
        JTextField nameField = new JTextField(10);
        JTextField innField = new JTextField(10);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Введите ФИО:"));
        myPanel.add(nameField);
        myPanel.add(new JLabel("ИНН:"));
        myPanel.add(innField);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Регистрация пользователя", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            return new User(nameField.getText(), Long.parseLong(innField.getText()));
        }
        return null;
    }

    public static void main(String[] args) {
        new OnlineShop("Online shop");
    }
}

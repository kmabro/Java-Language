import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculation implements ActionListener {
    JTextField f1, f2, f3;
    JButton b1, b2;

    Calculation() {
        JFrame f = new JFrame();

        f1 = new JTextField();
        f1.setBounds(50, 50, 150, 30);
        f2 = new JTextField();
        f2.setBounds(50, 100, 150, 30);
        f3 = new JTextField("Result");
        f3.setBounds(50, 150, 150, 30);
        f3.setEditable(false);

        b1 = new JButton("Add");
        b1.setBounds(50, 200, 80, 30);
        b2 = new JButton("Subtract");
        b2.setBounds(150, 200, 100, 30);

        b1.addActionListener(this);
        b2.addActionListener(this);

        f.add(f1);
        f.add(f2);
        f.add(f3);
        f.add(b1);
        f.add(b2);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = f1.getText();
        String s2 = f2.getText();

        // Validate input
        if (s1.isEmpty() || s2.isEmpty()) {
            f3.setText("Invalid Input");
            return;
        }

        try {
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int c = 0;

            if (e.getSource() == b1) {
                c = a + b;
            } else if (e.getSource() == b2) {
                c = a - b;
            }

            f3.setText(String.valueOf(c));
        } catch (NumberFormatException ex) {
            f3.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new Calculation();
    }
}

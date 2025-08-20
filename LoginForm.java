import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    public static void main(String[] args) {

        JFrame f = new JFrame("Login Form");
        JPanel p = new JPanel();

        JTextField uf = new JTextField(20);
        JPasswordField pf = new JPasswordField(20);

        JButton lb = new JButton("login");
        p.add(new JLabel("Username"));
        p.add(uf);
        p.add(new JLabel("Password"));
        p.add(pf);
        p.add(lb);

        lb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = uf.getText();
                String password = new String(pf.getPassword());

                if (username.equals("Admin") && password.equals("Password")) {
                    JOptionPane.showMessageDialog(f, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(f, "Invalid username or password");
                }
            }
        });

        f.add(p);
        f.setSize(300, 150);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

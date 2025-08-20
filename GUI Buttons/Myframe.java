// import java.awt.Color;
// import java.awt.Font;
// import java.awt.Image;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import javax.swing.*;

// public class Myframe extends JFrame implements ActionListener {
//     JButton b;
//     JLabel l;

//     Myframe() {

//         ImageIcon image = new ImageIcon("ico.png");
//         ImageIcon image2 = new ImageIcon("emo.jpeg");

//         l = new JLabel();
//         l.setBounds(150,250,400,500);
//         l.setIcon(image2);  
//         l.setVisible(false );


//         b = new JButton(); // Initialize class-level button
//         b.setBounds(20, 100, 300, 250);
//         b.setText("Submit");
//         b.addActionListener(this); // Add the action listener to the button
//         b.setFocusable(false);
//         b.setIcon(image);
//         b.setHorizontalTextPosition(JButton.CENTER);
//         b.setVerticalTextPosition(JButton.BOTTOM);
//         b.setFont(new Font("Comic Sans", Font.BOLD, 15));
//         b.setIconTextGap(-30);
//         b.setForeground(Color.CYAN);
//         b.setBackground(Color.LIGHT_GRAY);
//         b.setBorder(BorderFactory.createEtchedBorder());
//         b.setEnabled(true);


//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setLayout(null);
//         this.setSize(500, 500);
//         this.setVisible(true);
//         this.add(b);
//         this.add(l);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         if (e.getSource() == b) {
//             System.out.println("Hey you just clicked the button.");
//            // b.setEnabled(false);
//            l.setVisible(true);
//         }
//     }
// }

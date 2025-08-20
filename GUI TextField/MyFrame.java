// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JTextField;

// import java.awt.Color;
// import java.awt.Dimension;
// import java.awt.FlowLayout;
// import java.awt.Font;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class MyFrame extends JFrame implements ActionListener {
// JButton b;
// JTextField tf;
//     MyFrame(){
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setLayout(new FlowLayout());

//     b = new JButton("Submit");
//         b.addActionListener(this);

//   tf = new JTextField();
//         tf.setPreferredSize(new Dimension(250,40));
//         tf.setFont(new Font("Consolas ",Font.PLAIN,35));
//         tf.setForeground(Color.GREEN);
//         tf.setBackground(Color.BLACK);
//         tf.setCaretColor(Color.WHITE);
//         tf.setText("user name");
   


//         this.add(b);
//         this.add(tf);
//         this.pack();
//         this.setVisible(true);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         if(e.getSource() == b){
//            System.out.println("Welcome "+tf.getText());
//            b.setEnabled(false);
//            tf.setEditable(false);

//         }
//     }
    



// }

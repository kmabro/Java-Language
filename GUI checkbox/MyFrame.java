// import java.awt.FlowLayout;
// import java.awt.Font;
// import java.awt.LayoutManager;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.ImageIcon;
// import javax.swing.JButton;
// import javax.swing.JCheckBox;
// import javax.swing.JFrame;

// public class MyFrame extends JFrame implements ActionListener{
//     JButton b;
//     JCheckBox cb;

//     ImageIcon yIcon;
//     ImageIcon nIcon;
     

//     MyFrame(){


//         yIcon = new ImageIcon("yes.png");
//         nIcon = new ImageIcon("no.png");


//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setLayout(new FlowLayout());

//         b = new JButton();
//         b.setText("Submit");
//         b.addActionListener(this);


//     cb = new JCheckBox();
//         cb.setText("I am not a robot"); 
//         cb.setFocusable(false);
//         cb.setFont(new Font("New Roman",Font.BOLD,20));
//         cb.setIcon(nIcon);
//          cb.setSelectedIcon(yIcon);


//         this.add(b);
//         this.add(cb);
//         this.pack();
//         this.setVisible(true);


//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//      if (e.getSource()==b) {
//        System.out.println( cb.isSelected());
//      }

//     }
// }
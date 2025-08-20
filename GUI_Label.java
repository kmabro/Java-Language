// import javax.swing.ImageIcon;

// import java.awt.BorderLayout;
// import java.awt.Color;
// import java.awt.Font;

// import javax.swing.*;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.border.Border;

// class JUI_Label{
//     public static void main(String[] args) {
        
//        ImageIcon image = new ImageIcon("my pic.jpg"); // Image
//         Border border = BorderFactory.createLineBorder(Color.blue,6); //Border

 
//         JLabel l = new JLabel("I am practicing Java Labels"); //Creating label for text
//        l.setIcon(image); // add image to label
//        l.setHorizontalTextPosition(JLabel.CENTER); // Set text left,right,center of image icon
//         l.setVerticalTextPosition(JLabel.TOP); //Set text top,bottom,center of image icon
//        l.setForeground(Color.GREEN); // Set text color
//        l.setFont(new Font("MV Boli",Font.PLAIN,20)); // Font style
//         l.setIconTextGap(-5); // Move text near or far to image 
//        l.setBackground(Color.BLACK ); // Set background color
//        l.setOpaque(true); // visibility of background
//        l.setBorder(border); // set border 
//         l.setVerticalAlignment(JLabel.CENTER); //VerticalAlignment
//         l.setHorizontalAlignment(JLabel.CENTER); //HorizontalAlignment
//       l.setBounds(0,0,440,400); // Set Bounds of label 



//        JFrame f = new JFrame("Labels Practice: "); // creating frame
//        f.setSize(500,500); // frame size
//        f.add(l); // adds label to frame 
//        f.setLayout(null); // nothing show until we set bounds
//         f.setVisible(true); // Show visibility of frame
//         f.pack(); // occupy only necessary space on screen 

//     }
// }
// import java.awt.BorderLayout;
// import java.awt.Color;
// import java.awt.Dimension;

// import javax.swing.JFrame;
// import javax.swing.JPanel;

// class GUI_BorderLayout{
//     public static void main(String[] args) {
        

//             JFrame f = new JFrame("Border Layout");
//             f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//             f.setLayout(new BorderLayout(10,10));
//             f.setSize(500,500);
//             f.setVisible(true);


//             JPanel p1 = new JPanel();
//             JPanel p2 = new JPanel();
//             JPanel p3 = new JPanel();
//             JPanel p4 = new JPanel();
//             JPanel p5 = new JPanel();
          
//             p1.setBackground(Color.red);
//             p2.setBackground(Color.green);
//             p3.setBackground(Color.yellow);
//             p4.setBackground(Color.magenta);
//             p5.setBackground(Color.blue);

//             p1.setPreferredSize(new Dimension(100,100));
//             p2.setPreferredSize(new Dimension(100,100));
//             p3.setPreferredSize(new Dimension(100,100));
//             p4.setPreferredSize(new Dimension(100,100));
//             p5.setPreferredSize(new Dimension(100,100));

//             f.add(p1, BorderLayout.NORTH);
//             f.add(p2, BorderLayout.WEST);
//             f.add(p3, BorderLayout.EAST);
//             f.add(p4, BorderLayout.SOUTH);
//             f.add(p5, BorderLayout.CENTER);
            


//             //---------------------------------------------------------------

            
//             JPanel p6 = new JPanel();
//             JPanel p7 = new JPanel();
//             JPanel p8 = new JPanel();
//             JPanel p9 = new JPanel();
//             JPanel p10 = new JPanel();
          
//             p6.setBackground(Color.BLACK);
//             p7.setBackground(Color.darkGray);
//             p8.setBackground(Color.GRAY);
//             p9.setBackground(Color.lightGray);
//             p10.setBackground(Color.WHITE);

//             p5.setLayout(new BorderLayout());

//             p6.setPreferredSize(new Dimension(50,50));
//             p7.setPreferredSize(new Dimension(50,50));
//             p8.setPreferredSize(new Dimension(50,50));
//             p9.setPreferredSize(new Dimension(50,50));
//             p10.setPreferredSize(new Dimension(50,50));

//            p5.add(p6, BorderLayout.NORTH);
//            p5.add(p7, BorderLayout.SOUTH);
//            p5.add(p8, BorderLayout.WEST);
//            p5.add(p9, BorderLayout.EAST);
//            p5.add(p10, BorderLayout.CENTER);

//             f.add(p1, BorderLayout.NORTH);
//             f.add(p2, BorderLayout.WEST);
//             f.add(p3, BorderLayout.EAST);
//             f.add(p4, BorderLayout.SOUTH);
//             f.add(p5, BorderLayout.CENTER);
            

//     }
// }
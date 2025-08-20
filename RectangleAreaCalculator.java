// import javax.swing.*;  
// import java.awt.event.*;  

// public class RectangleAreaCalculator {  
//     JTextField lengthField, widthField, resultField;  
//     JButton calculateButton;  

//     RectangleAreaCalculator() {  
//         // Create JFrame  
//         JFrame frame = new JFrame("Rectangle Area Calculator");  
//         frame.setSize(300, 200);  
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
//         frame.setLayout(null);  
//         frame.setLocationRelativeTo(null); // Center the frame  

//         // Create JLabels  
//         JLabel lengthLabel = new JLabel("Length:");  
//         lengthLabel.setBounds(20, 20, 60, 20);  
//         JLabel widthLabel = new JLabel("Width:");  
//         widthLabel.setBounds(20, 50, 60, 20);  
//         JLabel resultLabel = new JLabel("Area:");  
//         resultLabel.setBounds(20, 80, 60, 20);  

//         // Create JTextFields  
//         lengthField = new JTextField();  
//         lengthField.setBounds(90, 20, 150, 20);  
//         lengthField.setToolTipText("Enter the length of the rectangle");  
//         widthField = new JTextField();  
//         widthField.setBounds(90, 50, 150, 20);  
//         widthField.setToolTipText("Enter the width of the rectangle");  
//         resultField = new JTextField();  
//         resultField.setBounds(90, 80, 150, 20);  
//         resultField.setEditable(false);  

//         // Create JButton  
//         calculateButton = new JButton("Calculate");  
//         calculateButton.setBounds(90, 110, 100, 30);  
//         calculateButton.setToolTipText("Click to calculate the area of the rectangle");  

//         // Add ActionListener using Lambda  
//         calculateButton.addActionListener(e -> {
//             try {  
//                 double length = Double.parseDouble(lengthField.getText());  
//                 double width = Double.parseDouble(widthField.getText());  
//                 if (length <= 0 || width <= 0) {
//                     throw new NumberFormatException("Non-positive value entered");
//                 }
//                 double area = length * width;  
//                 resultField.setText(String.format("%.2f", area));  
//             } catch (NumberFormatException ex) {  
//                 JOptionPane.showMessageDialog(null, "Please enter valid positive numbers for length and width.");  
//             }  
//         });

//         // Add components to the frame  
//         frame.add(lengthLabel);  
//         frame.add(widthLabel);  
//         frame.add(resultLabel);  
//         frame.add(lengthField);  
//         frame.add(widthField);  
//         frame.add(resultField);  
//         frame.add(calculateButton);  

//         // Make the frame visible  
//         frame.setVisible(true);  
//     }  

//     public static void main(String[] args) {  
//         new RectangleAreaCalculator();  
//     }  
// }

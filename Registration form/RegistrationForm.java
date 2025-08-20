// import javax.swing.*;
// import java.awt.*;

// public class RegistrationForm {
//     public static void main(String[] args) {
//         // Create the frame
//         JFrame frame = new JFrame("Registration Form");
//         frame.setSize(600, 600);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//         // Create a panel to hold all components
//         JPanel panel = new JPanel();
//         panel.setLayout(new GridLayout(15, 2, 10, 10)); // 15 rows, 2 columns
        
//         // Add labels and text fields
//         panel.add(new JLabel("First Name:"));
//         JTextField firstNameField = new JTextField();
//         panel.add(firstNameField);
        
//         panel.add(new JLabel("Middle Name:"));
//         JTextField middleNameField = new JTextField();
//         panel.add(middleNameField);
        
//         panel.add(new JLabel("Last Name:"));
//         JTextField lastNameField = new JTextField();
//         panel.add(lastNameField);
        
//         panel.add(new JLabel("Birth Date (MM/DD/YYYY):"));
//         JPanel birthDatePanel = new JPanel(new GridLayout(1, 3));
        
//         // Populate month, day, and year dropdowns
//         String[] months = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
//         String[] days = new String[31];
//         for (int i = 0; i < 31; i++) {
//             days[i] = String.format("%02d", i + 1); // 01, 02, ..., 31
//         }
//         String[] years = new String[25];
//         for (int i = 0; i < 25; i++) {
//             years[i] = String.valueOf(2000 + i); // 2000 to 2024
//         }

//         JComboBox<String> monthBox = new JComboBox<>(months);
//         JComboBox<String> dayBox = new JComboBox<>(days);
//         JComboBox<String> yearBox = new JComboBox<>(years);

//         birthDatePanel.add(monthBox);
//         birthDatePanel.add(dayBox);
//         birthDatePanel.add(yearBox);
//         panel.add(birthDatePanel);
        
//         panel.add(new JLabel("Gender:"));
//         JComboBox<String> genderBox = new JComboBox<>(new String[]{"Male", "Female", "Other"});
//         panel.add(genderBox);
        
//         panel.add(new JLabel("Address:"));
//         JTextField addressField = new JTextField();
//         panel.add(addressField);
        
//         panel.add(new JLabel("City:"));
//         JTextField cityField = new JTextField();
//         panel.add(cityField);
        
//         panel.add(new JLabel("State/Province:"));
//         JTextField stateField = new JTextField();
//         panel.add(stateField);
        
//         panel.add(new JLabel("Postal/Zip Code:"));
//         JTextField postalCodeField = new JTextField();
//         panel.add(postalCodeField);
        
//         panel.add(new JLabel("Student E-mail:"));
//         JTextField emailField = new JTextField();
//         panel.add(emailField);
        
//         panel.add(new JLabel("Mobile Number:"));
//         JTextField mobileField = new JTextField();
//         panel.add(mobileField);
        
//         panel.add(new JLabel("Phone Number:"));
//         JTextField phoneField = new JTextField();
//         panel.add(phoneField);
        
//         panel.add(new JLabel("Work Number:"));
//         JTextField workField = new JTextField();
//         panel.add(workField);
        
//         panel.add(new JLabel("Company:"));
//         JTextField companyField = new JTextField();
//         panel.add(companyField);
        
//         panel.add(new JLabel("Courses:"));
//         JComboBox<String> courseBox = new JComboBox<>(new String[]{"Course 1", "Course 2", "Course 3"});
//         panel.add(courseBox);
        
//         panel.add(new JLabel("Additional Comments:"));
//         JTextArea commentsArea = new JTextArea(5, 20);
//         JScrollPane commentsScrollPane = new JScrollPane(commentsArea);
//         panel.add(commentsScrollPane);
        
//         // Submit button
//         JButton submitButton = new JButton("Submit");
//         panel.add(new JLabel()); // Empty label for spacing
//         panel.add(submitButton);
        
//         // Add panel to frame
//         frame.add(panel);
//         frame.setVisible(true);
//     }
// }

import javax.swing.*;  
import java.awt.event.*;  

public class A {  
    public static void main(String[] args) {  
        // Create a JFrame
        JFrame frame = new JFrame("Menu Example");  
        
        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();  
        
        // Create menus
        JMenu fileMenu = new JMenu("File");  
        JMenu editMenu = new JMenu("Edit");  
        JMenu helpMenu = new JMenu("Help");  
        
        // Create menu items for File menu
        JMenuItem newItem = new JMenuItem("New");  
        JMenuItem openItem = new JMenuItem("Open");  
        JMenuItem exitItem = new JMenuItem("Exit");  
        
        // Add action listener for Exit menu item
        exitItem.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                System.exit(0);  
            }  
        });  
        
        // Add menu items to File menu
        fileMenu.add(newItem);  
        fileMenu.add(openItem);  
        fileMenu.addSeparator(); // Adds a separator line
        fileMenu.add(exitItem);  
        
        // Create menu items for Edit menu
        JMenuItem cutItem = new JMenuItem("Cut");  
        JMenuItem copyItem = new JMenuItem("Copy");  
        JMenuItem pasteItem = new JMenuItem("Paste");  
        
        // Add menu items to Edit menu
        editMenu.add(cutItem);  
        editMenu.add(copyItem);  
        editMenu.add(pasteItem);  
        
        // Add menus to the menu bar
        menuBar.add(fileMenu);  
        menuBar.add(editMenu);  
        menuBar.add(helpMenu);  
        
        // Set the menu bar to the frame
        frame.setJMenuBar(menuBar);  
        
        // Set frame properties
        frame.setSize(400, 300);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}  

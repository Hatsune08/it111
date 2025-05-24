import javax.swing.*;  
import java.awt.*;     

public class showWindow2 {
    public static void main(String[] args) {
        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 300;

        // Create window
        JFrame window = new JFrame();
        window.setTitle("A Simple Window");
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null); 

        // Set background color
        window.getContentPane().setBackground(Color.GREEN);

        // Create first label
        JLabel myLabel = new JLabel("My First Big Label!!!");
        myLabel.setFont(new Font("Arial", Font.BOLD, 20));  
        myLabel.setBounds(50, 30, 250, 30);

        // Create second label
        JLabel myLabel2 = new JLabel("My Second Big Label!");
        myLabel2.setFont(new Font("Arial", Font.PLAIN, 16));  
        myLabel2.setBounds(50, 110, 250, 30);

        // Create first text field
        JTextField field1 = new JTextField();
        field1.setBounds(50, 60, 250, 30);

        // Create second text field
        JTextField field2 = new JTextField();
        field2.setBounds(50, 140, 250, 30);

        // Add components to window
        window.add(myLabel);
        window.add(field1);
        window.add(myLabel2);
        window.add(field2);

        // Optional: center the window on screen
        window.setLocationRelativeTo(null);

        // Show window
        window.setVisible(true);
    }
}

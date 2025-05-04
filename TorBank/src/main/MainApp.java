package main;

import frontend.auth.Login;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainApp extends JFrame {

    public MainApp() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); 
        setLocation(480, 150); 
        setSize(671, 539);
        setTitle("Tor Bank"); 

        add(new Login());
    }

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new MainApp().setVisible(true);
        });
    }
}

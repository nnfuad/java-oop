import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    
    Login(){

        setTitle("F CORP");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/FcorpPNG.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        getContentPane().setBackground(Color.black);

        JLabel fcorplogo = new JLabel(i3);
        fcorplogo.setBounds(40,40,200,200);
        add(fcorplogo);
        
        JLabel welcometext = new JLabel("Welcome to F Corp");
        welcometext.setFont(new Font("Osward", Font.BOLD, 24)); // Increased font size for better visibility
        welcometext.setForeground(Color.WHITE);
        welcometext.setBounds(200, 40, 400, 40); // Adjusted bounds to fit the text better
        add(welcometext);

        JLabel cardno = new JLabel("Card no:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 14)); // Increased font size for better visibility
        cardno.setForeground(Color.WHITE);
        cardno.setBounds(250, 160, 400, 20); // Adjusted bounds to fit the text better
        add(cardno);

        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Raleway", Font.BOLD, 14)); // Increased font size for better visibility
        pin.setForeground(Color.WHITE);
        pin.setBounds(250, 1, 400, 50); // Adjusted bounds to fit the text better
        add(pin);

        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
        

    }

    public static void main(String[] args) {
        new Login();
    }
}
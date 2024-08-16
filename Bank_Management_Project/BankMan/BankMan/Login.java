import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton clear,signin,signup;
    JTextField cardTextField,PINTextField;
    JPasswordField PINPasswordField;

    Login(){

        setTitle("F CORP");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/FcorpPNG.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        getContentPane().setBackground(Color.black);

        JLabel fcorplogo = new JLabel(i3);
        fcorplogo.setBounds(150,20,200,200);
        add(fcorplogo);
        
        JLabel welcometext = new JLabel("Welcome to F Corp");
        welcometext.setFont(new Font("Osward", Font.BOLD, 24)); // Increased font size for better visibility
        welcometext.setForeground(Color.WHITE);
        welcometext.setBounds(300, 80, 400, 40); // Adjusted bounds to fit the text better
        add(welcometext);

        JLabel cardno = new JLabel("Card no    :");
        cardno.setFont(new Font("Raleway", Font.BOLD, 14)); // Increased font size for better visibility
        cardno.setForeground(Color.WHITE);
        cardno.setBounds(120, 220, 200, 20); // Adjusted bounds to fit the text better
        add(cardno);

        JLabel pin = new JLabel("PIN          :");
        pin.setFont(new Font("Raleway", Font.BOLD, 14)); // Increased font size for better visibility
        pin.setForeground(Color.WHITE);
        pin.setBounds(120, 280, 200, 20); // Adjusted bounds to fit the text better
        add(pin);

        cardTextField = new JTextField();
        cardTextField.setBounds(200, 220, 250, 20);
        add(cardTextField);

        PINTextField = new JPasswordField();
        PINTextField.setBounds(200, 280, 250, 20);
        add(PINTextField);

        clear = new JButton("CLEAR");
        clear.setBounds(450,250,100,30);
        clear.setBackground(Color.WHITE);
        clear.setForeground(Color.BLACK);
        clear.addActionListener(this);
        add(clear);

        signin = new JButton("SIGN IN");
        signin.setBounds(250,340,100,30);
        signin.setBackground(Color.WHITE);
        signin.setForeground(Color.BLACK);
        signin.addActionListener(this);
        add(signin);

        signup = new JButton("SIGN UP");
        signup.setBounds(390,340,100,30);
        signup.setBackground(Color.WHITE);
        signup.setForeground(Color.BLACK);
        signup.addActionListener(this);
        add(signup);

        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
        

    }


    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            cardTextField.setText("");
            PINTextField.setText("");
        }
        else if(ae.getSource() == signin){

        }
        else if(ae.getSource()== signup){

        }
    }
    public static void main(String[] args) {
        new Login();
    }


}
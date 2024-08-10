import java.awt.Color;
import java.util.*;
import javax.swing.*;
import java.awt.*;


public class SignupOne extends JFrame{
    
    SignupOne(){
        setLayout(null);

        setTitle("Create an account");
        
        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L)+1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO: "+random);
        formno.setForeground(Color.WHITE);
        add(formno);

        getContentPane().setBackground(Color.DARK_GRAY);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SignupOne();
    }
}

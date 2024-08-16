import java.awt.Color;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.*;


public class SignupOne extends JFrame{
    
    SignupOne(){
        setLayout(null);

        setTitle("Create an account");
        
        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L)+1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO: "+random);
        formno.setForeground(Color.WHITE);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel personalDetails = new JLabel("PAGE 1: Personal Details");
        personalDetails.setForeground(Color.WHITE);
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,80,800,30);
        add(personalDetails);

        JLabel name = new JLabel("Name:");
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        JTextField nameField = new JTextField();
        nameField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameField.setBounds(300,140,400,30);
        nameField.setBackground(Color.lightGray);
        add(nameField);

        JLabel fname = new JLabel("Father's name:");
        fname.setForeground(Color.WHITE);
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        JTextField fnameField = new JTextField();
        fnameField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameField.setBounds(300,190,400,30);
        fnameField.setBackground(Color.lightGray);
        add(fnameField);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setForeground(Color.WHITE);
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 200, 30);
        dateChooser.setBackground(Color.lightGray);
        add(dateChooser);

        JLabel gender = new JLabel("Specify Gender:");
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(300,290,100,30);
        male.setForeground(Color.WHITE);
        male.setBackground(Color.LIGHT_GRAY);
        add(male);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(405,290,100,30);
        female.setBackground(Color.LIGHT_GRAY);
        female.setForeground(Color.WHITE);
        add(female);
        JRadioButton nul = new JRadioButton("Rather not say");
        nul.setBounds(510,290,500,30);
        nul.setBackground(Color.LIGHT_GRAY);
        nul.setForeground(Color.WHITE);
        add(nul);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(nul);



        JLabel email = new JLabel("Email:");
        email.setForeground(Color.WHITE);
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);

        JTextField emailField = new JTextField();
        emailField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailField.setBounds(300,340,400,30);
        emailField.setBackground(Color.lightGray);
        add(emailField);

        JLabel marital = new JLabel("Marital Status :");
        marital.setForeground(Color.WHITE);
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);

        JRadioButton married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setForeground(Color.WHITE);
        married.setBackground(Color.LIGHT_GRAY);
        add(married);
        JRadioButton unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.LIGHT_GRAY);
        unmarried.setForeground(Color.WHITE);
        add(unmarried);
        JRadioButton other = new JRadioButton("Other");
        other.setBounds(630,390,500,30);
        other.setBackground(Color.LIGHT_GRAY);
        other.setForeground(Color.WHITE);
        add(other);

        ButtonGroup marriageGroup = new ButtonGroup();
        marriageGroup.add(married);
        marriageGroup.add(unmarried);
        marriageGroup.add(other);

        JLabel address = new JLabel("Address:");
        address.setForeground(Color.WHITE);
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        JTextField addressField = new JTextField();
        addressField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressField.setBounds(300,440,400,30);
        addressField.setBackground(Color.lightGray);
        add(addressField);

        JLabel city = new JLabel("City:");
        city.setForeground(Color.WHITE);
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        JTextField cityField = new JTextField();
        cityField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityField.setBounds(300,490,400,30);
        cityField.setBackground(Color.lightGray);
        add(cityField);

        JLabel state = new JLabel("State/Division:");
        state.setForeground(Color.WHITE);
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

        JTextField stateField = new JTextField();
        stateField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateField.setBounds(300,540,400,30);
        stateField.setBackground(Color.lightGray);
        add(stateField);

        JLabel pcode = new JLabel("Postal Code:");
        pcode.setForeground(Color.WHITE);
        pcode.setFont(new Font("Raleway",Font.BOLD,20));
        pcode.setBounds(100,590,200,30);
        add(pcode);

        JTextField pcodeField = new JTextField();
        pcodeField.setFont(new Font("Raleway", Font.BOLD, 14));
        pcodeField.setBounds(300,590,400,30);
        pcodeField.setBackground(Color.lightGray);
        add(pcodeField);

        JButton next = new JButton("Next");
        next.setFont(new Font( "Raleway",Font.BOLD,14));
        next.setBackground(Color.white);
        next.setForeground(Color.BLACK);
        next.setBounds(620,660,80,30);
        add(next);

        getContentPane().setBackground(Color.DARK_GRAY);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SignupOne();
    }
}

package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JButton next;
    JRadioButton r1,r2,m1,m2,m3;
    JTextField textName, textFname, textEmail, textAdd, textCity, textPin, textState;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L)+1000L;
    String first = " "+ Math.abs(first4);

    Signup(){
        super("APPLICATION FORM");
        ImageIcon bank1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image bank2 = bank1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon bank3 = new ImageIcon(bank2);
        JLabel bank = new JLabel(bank3);
        bank.setBounds(5,5,150,150);
        add(bank);

        JLabel label1 = new JLabel("APPLICATION FORM NO: "+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(430, 70,600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(380,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name: ");
        labelName.setFont(new Font("Raleway",Font.BOLD, 20));
        labelName.setBounds(100,160,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 160, 400,30);
        add(textName);

        JLabel labelFname = new JLabel("Father's Name: ");
        labelFname.setFont(new Font("Raleway",Font.BOLD, 20));
        labelFname.setBounds(100,210,200,30);
        add(labelFname);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD, 14));
        textFname.setBounds(300, 210, 400,30);
        add(textFname);

        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway",Font.BOLD, 20));
        dob.setBounds(100,270,200,30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,270,400,30);
        add(dateChooser);

        JLabel gen = new JLabel("Gender: ");
        gen.setFont(new Font("Raleway", Font.BOLD, 20));
        gen.setBounds(100, 320,200,30);
        add(gen);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(204,255,204));
        r1.setBounds(300,320,60,30);
        add(r1);
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(204,255,204));
        r2.setBounds(450,320,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email address: ");
        labelEmail.setFont(new Font("raleway", Font.BOLD,20));
        labelEmail.setBounds(100, 360, 200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 360, 400,30);
        add(textEmail);

        JLabel labelMs = new JLabel("Martial Status: ");
        labelMs.setFont(new Font("raleway", Font.BOLD,20));
        labelMs.setBounds(100, 410, 200,30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Raleway", Font.BOLD, 14));
        m1.setBackground(new Color(204,255,204));
        m1.setBounds(300,410,100,30);
        add(m1);
        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway", Font.BOLD, 14));
        m2.setBackground(new Color(204,255,204));
        m2.setBounds(450,410,150,30);
        add(m2);
        m3 = new JRadioButton("Others");
        m3.setFont(new Font("Raleway", Font.BOLD, 14));
        m3.setBackground(new Color(204,255,204));
        m3.setBounds(620,410,150,30);
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAdd = new JLabel("Address: ");
        labelAdd.setFont(new Font("raleway", Font.BOLD,20));
        labelAdd.setBounds(100, 460, 200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        textAdd.setBounds(300, 460, 400,30);
        add(textAdd);

        JLabel labelCity = new JLabel("City: ");
        labelCity.setFont(new Font("raleway", Font.BOLD,20));
        labelCity.setBounds(100, 510, 200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(300, 510, 400,30);
        add(textCity);


        JLabel labelPin = new JLabel("Pin Code: ");
        labelPin.setFont(new Font("raleway", Font.BOLD,20));
        labelPin.setBounds(100, 560, 200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        textPin.setBounds(300, 560, 400,30);
        add(textPin);

        JLabel labelState = new JLabel("State: ");
        labelState.setFont(new Font("raleway", Font.BOLD,20));
        labelState.setBounds(100, 610, 200,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(300, 610, 400,30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(204, 255,204));
        setLayout(null);
        setSize(850, 750);
        setLocation(350,40);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if(r2.isSelected()){
            gender  = "Female";
        }else{
            gender = "Other";
        }

        String email = textEmail.getText();
        String martial = null;
        if(m1.isSelected()){
            martial = "Married";
        }else if(m2.isSelected()){
            martial = " Unmarried";
        }else if(m3.isSelected()){
            martial = "other";
        }

        String address = textAdd.getText();
        String city = textCity.getText();
        String pinCode = textPin.getText();
        String state = textState.getText();

        try{
            if(textName.getText().equals("") || textFname.getText().equals("")|| textEmail.getText().equals("")||textAdd.getText().equals("")||textCity.getText().equals("")||textPin.getText().equals("")||textState.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please fill all the fields");
            }else{
                Connect connect1 = new Connect();
                String q = "INSERT INTO signup VALUES('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+martial+"','"+address+"','"+city+"','"+pinCode+"','"+state+"')";
                connect1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
    public static void main(String[] args) {
        new Signup();
    }
}

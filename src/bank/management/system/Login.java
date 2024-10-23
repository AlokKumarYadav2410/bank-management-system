package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

/*
We have to make a frame so we extend our class by JFrame
JFrame is present inside swing package
 */
public class Login extends JFrame implements ActionListener {
    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1, button2, button3;

    Login(){
        //to set the title we use super
        super("Bank Management System");
        ImageIcon bank1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image bank2 = bank1.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT);
        ImageIcon bank3 = new ImageIcon(bank2);
        JLabel bank = new JLabel(bank3);
        bank.setBounds(330,5,200,150);
        add(bank);

        ImageIcon card1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image card2 = card1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon card3 = new ImageIcon(card2);
        JLabel card = new JLabel(card3);
        card.setBounds(650, 390, 100, 100);
        add(card);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGrade", Font.BOLD, 38));
        label1.setBounds(250,140,450,40);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Raleway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(220, 190, 375,30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(375, 190, 230,30);
        textField2.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField2);

        label3 = new JLabel("Pin: ");
        label3.setFont(new Font("Raleway",Font.BOLD, 28));
        label3.setForeground(Color.white);
        label3.setBounds(220, 230, 375,30);
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(375, 230, 230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD, 14));
        add(passwordField3);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(380, 300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(500, 300, 100, 30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(380, 350, 220, 30);
        button3.addActionListener(this);
        add(button3);

        ImageIcon bg1 = new ImageIcon(ClassLoader.getSystemResource("icon/backg.png"));
        Image bg2 = bg1.getImage().getScaledInstance(850,525,Image.SCALE_DEFAULT);
        ImageIcon bg3 = new ImageIcon(bg2);
        JLabel bg = new JLabel(bg3);
        bg.setBounds(0,0,850, 525);
        add(bg);

        setLayout(null);
        setSize(850,525);
        //to set the location where we want to display our frame
        setLocation(350, 125);
        setUndecorated(true);
        setResizable(false);
        //class frame will run but the frame will not be visible
        //so we set the visibility to true
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == button1){
                Connect c = new Connect();
                String cardNo = textField2.getText();
                String pin = passwordField3.getText();
                String q = "SELECT * FROM login WHERE card_number = '"+cardNo+"' and pin = '"+pin+"'";
                ResultSet rs = c.statement.executeQuery(q);
                if(rs.next()){
                    setVisible(false);
                    new MainClass(pin);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }


            } else if (e.getSource() == button2) {
                //to clear the fields
                textField2.setText("");
                passwordField3.setText("");
            } else if (e.getSource() == button3) {
                new Signup();
                setVisible(false);
            }else{

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}

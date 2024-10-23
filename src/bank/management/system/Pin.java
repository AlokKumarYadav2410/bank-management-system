package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {

    String pin;
    JButton b1, b2;
    JPasswordField passwordField, passwordField2;

    Pin(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setForeground(Color.YELLOW);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(550,160,400,35);
        image.add(label1);

        JLabel label2 = new JLabel("New PIN:");
        label2.setForeground(Color.YELLOW);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(430,205,150,35);
        image.add(label2);

        passwordField = new JPasswordField();
        passwordField.setBackground(new Color(65,125,128));
        passwordField.setForeground(Color.WHITE);
        passwordField.setBounds(600,210,200,25);
        passwordField.setFont(new Font("Raleway",Font.BOLD,22));
        image.add(passwordField);

        JLabel label3 = new JLabel("Re-Enter New PIN: ");
        label3.setForeground(Color.YELLOW);
        label3.setFont(new Font("System",Font.BOLD,16));
        label3.setBounds(430,255,400,35);
        image.add(label3);

        passwordField2 = new JPasswordField();
        passwordField2.setBackground(new Color(65,125,128));
        passwordField2.setForeground(Color.WHITE);
        passwordField2.setBounds(600,260,200,25);
        passwordField2.setFont(new Font("Raleway",Font.BOLD,22));
        image.add(passwordField2);


        b1 = new JButton("CHANGE");
        b1.setBounds(705, 365,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(705, 410,150,35);
        b2.setBackground(new Color(25, 48, 49));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        image.add(b2);




        setLayout(null);
        setSize(1550,1080);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{
            String pin1 = passwordField.getText();
            String pin2 = passwordField2.getText();

            if(!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }
            if((e.getSource()==b1)){
                if(passwordField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Entered New PIN");
                    return;
                }
                if(passwordField2.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Re_enter New PIN");
                    return;
                }

                Connect c = new Connect();
                String q1 = "UPDATE bank SET pin='"+pin1+"' WHERE pin='"+pin+"'";
                String q2 = "UPDATE login SET pin='"+pin1+"' WHERE pin='"+pin+"'";
                String q3 = "UPDATE signupthree SET pin='"+pin1+"' WHERE pin='"+pin+"'";
                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN Changed Successfully");
                setVisible(false);
                new MainClass(pin);

            }
            else if(e.getSource()==b2){
                new MainClass(pin);
                setVisible(false);

            }


        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Pin("");
    }
}

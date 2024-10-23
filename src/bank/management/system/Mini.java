package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Mini extends JFrame implements ActionListener {
    String pin;
    JButton button;
    Mini(String pin){
        this.pin = pin;

        getContentPane().setBackground(new Color(255,204,204));
        setSize(400,600);
        setLocation(950,100);
        setLayout(null);

        JLabel label1 = new JLabel();
        label1.setBounds(20,100,400,200);
        add(label1);

        JLabel label2 = new JLabel("Subastral Bank");
        label2.setFont(new Font("System", Font.BOLD, 24));
        label2.setBounds(110,20,200,20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,80,300,30);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,400,300,20);
        add(label4);

        try {
            Connect c = new Connect();
            ResultSet rs = c.statement.executeQuery("SELECT * FROM login WHERE pin='"+pin+"'");
            while(rs.next()){
                label3.setText("Card Number: "+rs.getString("card_number").substring(0,4)+"XXXXXXXX"+rs.getString("card_number").substring(12));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int balance = 0;
            Connect c = new Connect();
            ResultSet rs = c.statement.executeQuery("SELECT * FROM bank WHERE pin='"+pin+"'");
            while(rs.next()){

                label1.setText(label1.getText()+"<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br><html>");


                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }else{
                    balance -= Integer.parseInt(rs.getString("amount"));

                }
            }

            label4.setText("Your Total Balance is Rs. "+balance);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        button = new JButton("Exit");
        button.setBounds(20,500,100,25);
        button.addActionListener(this);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        add(button);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);

    }

    public static void main(String[] args) {
        new Mini("");
    }
}

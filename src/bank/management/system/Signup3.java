package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s, c;
    String formno;
    Signup3(String formno){

        this.formno = formno;

        ImageIcon bank1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image bank2 = bank1.getImage().getScaledInstance(200,130,Image.SCALE_DEFAULT);
        ImageIcon bank3 = new ImageIcon(bank2);
        JLabel bank = new JLabel(bank3);
        bank.setBounds(80,0,200,130);
        add(bank);

        JLabel l1 = new JLabel("Page 3:");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(350,40,100,40);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(310,70,400,40);
        add(l2);

        JLabel l3 = new JLabel("Account Type: ");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,140,200,30);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(new Color(215,252,252));
        r1.setBounds(100, 170, 150,30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(new Color(215,252,252));
        r2.setBounds(350, 170, 250,30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(new Color(215,252,252));
        r3.setBounds(100, 200, 250,30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(new Color(215,252,252));
        r4.setBounds(350, 200, 250,30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number: ");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,250,200,30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,280,200,20);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(330,250,250,30);
        add(l6);

        JLabel l7 = new JLabel("(It would appear on ATM card/cheque book and statements)");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(330,280,500,20);
        add(l7);

        JLabel l8 = new JLabel("PIN: ");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,320,200,30);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(330,320,200,30);
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(100,350,200,20);
        add(l10);

        JLabel l11 = new JLabel("Services Required: ");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,390,200,30);
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Raleway",Font.BOLD, 16));
        c1.setBounds(100, 420, 200 ,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Raleway",Font.BOLD, 16));
        c2.setBounds(350, 420, 200 ,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Raleway",Font.BOLD, 16));
        c3.setBounds(100, 450, 200 ,30);
        add(c3);

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Raleway",Font.BOLD, 16));
        c4.setBounds(350, 450, 200 ,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Raleway",Font.BOLD, 16));
        c5.setBounds(100, 480, 200 ,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Raleway",Font.BOLD, 16));
        c6.setBounds(350, 480, 200 ,30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I hereby declares that the above entered details correct to be the best of my knowledge.", true);
        c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Raleway",Font.BOLD, 12));
        c7.setBounds(100, 540, 600 ,20);
        add(c7);

        JLabel l12 = new JLabel("Form No: ");
        l12.setFont(new Font("Raleway",Font.BOLD, 14));
        l12.setBounds(600, 10, 70 ,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD, 14));
        l13.setBounds(670, 10, 70 ,30);
        add(l13);

        s = new JButton(("Submit"));
        s.setFont(new Font("Raleway",Font.BOLD,14));
        s.setForeground(Color.WHITE);
        s.setBackground(Color.BLACK);
        s.setBounds(250,600,100,30);
        s.addActionListener(this);
        add(s);

        c = new JButton(("Cancel"));
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setForeground(Color.WHITE);
        c.setBackground(Color.BLACK);
        c.setBounds(420,600,100,30);
        c.addActionListener(this);
        add(c);



        getContentPane().setBackground(new Color(215, 252,252));
        setLayout(null);
        setSize(850, 750);
        setLocation(350,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accType = null;
        if(r1.isSelected()){
            accType = "Saving Account";
        }else if(r2.isSelected()){
            accType = "Fixed Deposit Account";
        }else if(r3.isSelected()){
            accType = "Current Account";
        }else if(r4.isSelected()){
            accType = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong()%90000000L)+1409963000000000L;
        String cardNo = ""+Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L)+1000L;
        String pin = ""+Math.abs(first3);

        String fac = "";
        if(c1.isSelected()){
            fac += "ATM CARD ";

        } if (c2.isSelected()) {
            fac = fac+ "Internet Banking ";

        }if(c3.isSelected()){
            fac = fac+"Mobile Banking ";

        }if(c4.isSelected()){
            fac = fac+"Email Alerts ";

        }
         if(c5.isSelected()){
            fac=fac+"Cheque Book ";
        }
         if(c6.isSelected()){
            fac = fac+"E-Statement ";

        }
        try{
            if(e.getSource() == s){
                if(accType.equals("")){
                    JOptionPane.showMessageDialog(null,"Please fill all the details");
                }
                else{
                    Connect c1 = new Connect();
                    String q1 = "INSERT INTO signupthree VALUES ('"+formno+"','"+accType+"','"+cardNo+"','"+pin+"','"+fac+"')";
                    String q2 = "INSERT INTO login VALUES('"+formno+"','"+cardNo+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: "+cardNo+ "\nPin: "+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==c) {
                System.exit(0);

            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup3("");
    }
}

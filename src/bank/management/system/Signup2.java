package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan, textAadhar;
    JRadioButton r1,r2, e1,e2;
    JButton nextButton;
    String formno;
    Signup2(String formno){
        super("APPLICATION FORM");
        this.formno = formno;
        ImageIcon bank1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image bank2 = bank1.getImage().getScaledInstance(200,150,Image.SCALE_DEFAULT);
        ImageIcon bank3 = new ImageIcon(bank2);
        JLabel bank = new JLabel(bank3);
        bank.setBounds(130,0,200,150);
        add(bank);

        JLabel l1 = new JLabel("Page 2:");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(430,30,100,40);
        add(l1);
        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(380, 60, 600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion: ");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(150, 140, 100,30);
        add(l3);

        String religion[] = {"Hindu","Muslim","Christian","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD, 14));
        comboBox.setBounds(350,140,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category: ");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(150, 190, 100,30);
        add(l4);

        String category[] = {"General","OBC","SC","ST", "Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD, 14));
        comboBox2.setBounds(350,190,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income: ");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(150, 240, 100,30);
        add(l5);

        String income[] = {"Null","<1,50,000","<2,50,000","Upto 10,00,000", "Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD, 14));
        comboBox3.setBounds(350,240,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational: ");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(150, 290, 150,30);
        add(l6);

        String educational[] = {"Non-Graduate","Graduate","Post-Graduate", "Doctrate", "Other"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD, 14));
        comboBox4.setBounds(350,290,320,30);
        add(comboBox4);


        JLabel l7 = new JLabel("Occupation: ");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(150, 340, 150,30);
        add(l7);

        String occupation[] = {"Salaried","Self-Employed","Business", "Student", "Retired","Other"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway",Font.BOLD, 14));
        comboBox5.setBounds(350,340,320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number: ");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(150, 390, 150,30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,18));
        textPan.setBounds(350, 390, 320,30);
        add(textPan);

        JLabel l9 = new JLabel("Aadhar Number: ");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(150, 440, 180,30);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway",Font.BOLD,18));
        textAadhar.setBounds(350, 440, 320,30);
        add(textAadhar);

        JLabel l10 = new JLabel("Senior Citizen: ");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(150, 490, 180,30);
        add(l10);

        r1= new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350, 490, 100,30);
        add(r1);

        r2= new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(460, 490, 100,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        JLabel l11 = new JLabel("Existing Account: ");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(150, 540, 200,30);
        add(l11);

        e1= new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350, 540, 100,30);
        add(e1);

        e2= new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(460, 540, 100,30);
        add(e2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(e1);
        buttonGroup1.add(e2);

        JLabel l12 = new JLabel("Form No: ");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(600, 10, 150,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        l13.setBounds(690, 10, 100,30);
        add(l13);

        nextButton = new JButton("NEXT");
        nextButton.setFont(new Font("Raleway", Font.BOLD,18));
        nextButton.setBackground(Color.WHITE);
        nextButton.setForeground(Color.BLACK);
        nextButton.setBounds(570,640,100,30);
        nextButton.addActionListener(this);
        add(nextButton);

        setLayout(null);
        setSize(850,750);
        setLocation(350,40);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String)comboBox.getSelectedItem();
        String cate = (String)comboBox2.getSelectedItem();
        String inc = (String)comboBox3.getSelectedItem();
        String edu = (String)comboBox4.getSelectedItem();
        String occ = (String)comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String aadhar = textAadhar.getText();

        String scitizen = " ";
        if(r1.isSelected()){
            scitizen = "Yes";
        }else if(r2.isSelected()){
            scitizen = "No";
        }

        String eaccount = " ";
        if(e1.isSelected()){
            eaccount = "Yes";
        }else if(e2.isSelected()){
            eaccount = "No";
        }

        try{
            if(textPan.getText().equals("")||textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please fill all the fields");
            }else{
                Connect c1 = new Connect();
                String q = "INSERT INTO signuptwo VALUES('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup2("");
    }
}

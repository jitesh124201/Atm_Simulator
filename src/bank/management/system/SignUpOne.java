package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUpOne extends JFrame implements ActionListener{
         
        long random;
        JTextField nametextfield,fathertextfield,dobtextfield,emailtextfield,addresstextfield,citytextfield,statetextfield,pintextfield;
        JButton next;
        JRadioButton male,female,other,married,unmarried;
        JDateChooser dateChooser;
        
         SignUpOne(){
             
             setLayout(null);
             
             Random ran = new Random();
             random=Math.abs((ran.nextLong()%9000L)+1000L);         //random number
             
             JLabel formno = new JLabel("APPLICATION FORM NO. "+random);   // concate random number to form
             formno.setFont(new Font("Raleway",Font.BOLD,38));
             formno.setBounds(140,20,600,40);
             add(formno);
             
             JLabel personaldetail = new JLabel("Page 1: Personal details ");    //page 1
             personaldetail.setFont(new Font("Raleway",Font.BOLD,22));
             personaldetail.setBounds(290,80,400,30);
             add(personaldetail);
             
              JLabel name = new JLabel("Name:");    
             name.setFont(new Font("Raleway",Font.BOLD,20));                //Name 
             name.setBounds(100,140,100,30);
             add(name);
             
              nametextfield=new JTextField();
             nametextfield.setFont(new Font("Raleway", Font.BOLD,14));      //textfield name
             nametextfield.setBounds(300,140,400,30);
             add(nametextfield);
             
              JLabel fname = new JLabel("Father's Name:");              //Fathers Name
             fname.setFont(new Font("Raleway",Font.BOLD,20));
             fname.setBounds(100,190,200,30);
             add(fname);
             
              fathertextfield=new JTextField();
             fathertextfield.setFont(new Font("Raleway", Font.BOLD,14));
             fathertextfield.setBounds(300,190,400,30);
             add(fathertextfield);
             
             JLabel dob = new JLabel("Date of Birth:");              //date of birth 
             dob.setFont(new Font("Raleway",Font.BOLD,20));
             dob.setBounds(100,240,200,30);
             add(dob);
             
              dateChooser = new JDateChooser();
             dateChooser.setBounds(300,240,400,30);                 // date choose
             dateChooser.setForeground(new Color(105,105,105));
             add(dateChooser);
             
              JLabel gender = new JLabel("Gender:");              //gender
             gender.setFont(new Font("Raleway",Font.BOLD,20));
             gender.setBounds(100,290,200,30);
             add(gender);
             
              male=new JRadioButton("Male");
             male.setBounds(300,290,60,30);
             male.setBackground(Color.white);
             add(male);
             
             
              female=new JRadioButton("Female");
             female.setBounds(450,290,120,30);
             female.setBackground(Color.white);
             add(female);
             
             ButtonGroup gendergroup = new ButtonGroup();
             gendergroup.add(male);
             gendergroup.add(female);
             
              JLabel email = new JLabel("Email Address:");              //Email
             email.setFont(new Font("Raleway",Font.BOLD,20));
             email.setBounds(100,340,200,30);
             add(email);
             
              emailtextfield=new JTextField();   
             emailtextfield.setFont(new Font("Raleway", Font.BOLD,14));   //email text field
             emailtextfield.setBounds(300,340,400,30);
             add(emailtextfield);
             
              JLabel marital = new JLabel("Marital Status:");              //marital status
             marital.setFont(new Font("Raleway",Font.BOLD,20));
             marital.setBounds(100,390,200,30);
             add(marital);
             
              married=new JRadioButton("Married");
             married.setBounds(300,390,100,30);
             married.setBackground(Color.white);
             add(married);
             
             
              unmarried=new JRadioButton("Unmarried");
             unmarried.setBounds(450,390,100,30);
             unmarried.setBackground(Color.white);
             add(unmarried);
             
               other=new JRadioButton("Other");
             other.setBounds(630,390,100,30);
             other.setBackground(Color.white);
             add(other);
             
             ButtonGroup maritalgroup = new ButtonGroup();
             maritalgroup.add(married);
             maritalgroup.add(unmarried);
             maritalgroup.add(other);
             
             JLabel address = new JLabel("Address:");              // address
             address.setFont(new Font("Raleway",Font.BOLD,20));
             address.setBounds(100,440,200,30);
             add(address);
             
              addresstextfield=new JTextField();   
             addresstextfield.setFont(new Font("Raleway", Font.BOLD,14));   //address text field
             addresstextfield.setBounds(300,440,400,30);
             add(addresstextfield);
             
             JLabel city = new JLabel("City:");              // city
             city.setFont(new Font("Raleway",Font.BOLD,20));
             city.setBounds(100,490,200,30);
             add(city);
             
              citytextfield=new JTextField();   
             citytextfield.setFont(new Font("Raleway", Font.BOLD,14));   //city text field
             citytextfield.setBounds(300,490,400,30);
             add(citytextfield);
             
             JLabel state = new JLabel("State:");              
             state.setFont(new Font("Raleway",Font.BOLD,20));           // state
             state.setBounds(100,540,200,30);
             add(state);
             
               statetextfield=new JTextField();   
             statetextfield.setFont(new Font("Raleway", Font.BOLD,14));   //state text field
             statetextfield.setBounds(300,540,400,30);
             add(statetextfield);
             
             JLabel pincode = new JLabel("Pincode:");              // pincode
             pincode.setFont(new Font("Raleway",Font.BOLD,20));
             pincode.setBounds(100,590,200,30);
             add(pincode);
             
              pintextfield=new JTextField();   
             pintextfield.setFont(new Font("Raleway", Font.BOLD,14));   //pin text field
             pintextfield.setBounds(300,590,400,30);
             add(pintextfield);
             
              next = new JButton("Next");
             next.setBackground(Color.BLACK);
             next.setForeground(Color.WHITE);
             next.setFont(new Font("Raleway",Font.BOLD,14));
             next.setBounds(620,660,80,30);
             next.addActionListener(this);
             add(next);
             
             
             getContentPane().setBackground(Color.white);
             
             setSize(850,800);                                      //Frame size
             setLocation(350,10);
             setVisible(true);
             
        }
         
         public void actionPerformed(ActionEvent ae){
             String formno=""+random;
             String name=nametextfield.getText();
             String fname = fathertextfield.getText();
             String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
             String gender=null;
             if(male.isSelected()){
                 gender="Male";
             }else if(female.isSelected()){
                 gender="Female";
             }
             
             String email=emailtextfield.getText();
             String marital=null;
             if(married.isSelected()){
                 marital="Married";
             }else if(unmarried.isSelected()){
                 marital="Unmarrired";
             }else if(other.isSelected()){
                 marital="Other";
             }
             
             String address = addresstextfield.getText();
             String city = citytextfield.getText();
             String state = statetextfield.getText();
             String pin = pintextfield.getText();
             
             try{
                 if(name.equals("")){
                     JOptionPane.showMessageDialog(null, "Name is required");
                 }else{
                     Cons c = new Cons();
                     String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                     c.s.executeUpdate(query);
                     
                     setVisible(false);
                     new SignUpTwo(formno).setVisible(true);
                 }
             }catch(Exception e){
                 System.out.println(e);
             }
         }
    public static void main(String args[]) {
        new SignUpOne();
    }
}

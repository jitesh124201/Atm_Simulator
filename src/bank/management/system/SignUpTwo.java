package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUpTwo extends JFrame implements ActionListener{
         
        JTextField pan,adharno;
        JButton next;
        JRadioButton syes,sno,eyes,eno;
        JComboBox religion,category,income,occupation,education;
        String formno;
        
         SignUpTwo(String formno){
             this.formno = formno;
             setLayout(null);
             
             setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
             
             
             JLabel additionaldetail = new JLabel("Page 2: Additional details ");    //page 1
             additionaldetail.setFont(new Font("Raleway",Font.BOLD,22));
             additionaldetail.setBounds(290,80,400,30);
             add(additionaldetail);
             
              JLabel name = new JLabel("Religion:");    
             name.setFont(new Font("Raleway",Font.BOLD,20));                //Name 
             name.setBounds(100,140,100,30);
             add(name);
             
             String valreligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
              religion = new JComboBox(valreligion);
             religion.setBounds(300,140,400,30);
             religion.setBackground(Color.WHITE);
             add(religion);
             
            
              JLabel fname = new JLabel("Category:");              //Fathers Name
             fname.setFont(new Font("Raleway",Font.BOLD,20));
             fname.setBounds(100,190,200,30);
             add(fname);
             
             String valCategory[] ={"General","OBC","SC","ST","Other"};
              category = new JComboBox(valCategory);
             category.setBounds(300,190,400,30);
              category.setBackground(Color.WHITE);
             add(category);
             
             JLabel dob = new JLabel("Income:");              //date of birth 
             dob.setFont(new Font("Raleway",Font.BOLD,20));
             dob.setBounds(100,240,200,30);
             add(dob);
             
              String incomeCategory[] ={"NULL","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
              income = new JComboBox(incomeCategory);
             income.setBounds(300,240,400,30);
              income.setBackground(Color.WHITE);
             add(income);
             
             
              JLabel gender = new JLabel("Educational");              //gender
             gender.setFont(new Font("Raleway",Font.BOLD,20));
             gender.setBounds(100,290,200,30);
             add(gender);
            
             
              JLabel email = new JLabel("Qualification:");              //Email
             email.setFont(new Font("Raleway",Font.BOLD,20));
             email.setBounds(100,315,200,30);
             add(email);
             
              String educationalValues[] ={"Non-Graduate","Graduate","Post-Graduation","Doctrate","Others"};
              education = new JComboBox(educationalValues);
             education.setBounds(300,315,400,30);
              education.setBackground(Color.WHITE);
             add(education);
   
             
              JLabel marital = new JLabel("Occupation:");              //marital status
             marital.setFont(new Font("Raleway",Font.BOLD,20));
             marital.setBounds(100,390,200,30);
             add(marital);
             
             String occupationValues[] ={"Salaried","Self-employed","Business","Student","Retired","Other"};
              occupation = new JComboBox(occupationValues);
             occupation.setBounds(300,395,400,30);
              occupation.setBackground(Color.WHITE);
             add(occupation);
             
             
             JLabel address = new JLabel("PAN Number:");              // address
             address.setFont(new Font("Raleway",Font.BOLD,20));
             address.setBounds(100,440,200,30);
             add(address);
             
              pan=new JTextField();   
             pan.setFont(new Font("Raleway", Font.BOLD,14));   //address text field
             pan.setBounds(300,440,400,30);
             add(pan);
             
             JLabel adhar = new JLabel("Adhar Number:");              // city
             adhar.setFont(new Font("Raleway",Font.BOLD,20));
             adhar.setBounds(100,490,200,30);
             add(adhar);
             
              adharno=new JTextField();   
             adharno.setFont(new Font("Raleway", Font.BOLD,14));   //city text field
             adharno.setBounds(300,490,400,30);
             add(adharno);
             
             JLabel state = new JLabel("Senior Citizen:");              
             state.setFont(new Font("Raleway",Font.BOLD,20));           // state
             state.setBounds(100,540,200,30);
             add(state);
             
             syes = new JRadioButton("Yes");
             syes.setBounds(300,540,100,30);
             syes.setBackground(Color.WHITE);
             add(syes);
             
             sno = new JRadioButton("No");
             sno.setBounds(450,540,100,30);
             sno.setBackground(Color.WHITE);
             add(sno);
             
             ButtonGroup maritalgroup = new ButtonGroup();
             maritalgroup.add(syes);
             maritalgroup.add(sno);
             
             
             JLabel pincode = new JLabel("Existing account:");              // pincode
             pincode.setFont(new Font("Raleway",Font.BOLD,20));
             pincode.setBounds(100,590,200,30);
             add(pincode);
             
             eyes = new JRadioButton("Yes");
             eyes.setBounds(300,590,100,30);
             eyes.setBackground(Color.WHITE);
             add(eyes);
             
             eno = new JRadioButton("No");
             eno.setBounds(450,590,100,30);
             eno.setBackground(Color.WHITE);
             add(eno);
             
             ButtonGroup emaritalgroup = new ButtonGroup();
             emaritalgroup.add(eyes);
             emaritalgroup.add(eno);
             
//              pintextfield=new JTextField();   
//             pintextfield.setFont(new Font("Raleway", Font.BOLD,14));   //pin text field
//             pintextfield.setBounds(300,590,400,30);
//             add(pintextfield);
//             
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
             String sreligion=(String)religion.getSelectedItem();
             String scategory = (String)category.getSelectedItem();
             String sincome = (String)income.getSelectedItem();
             String seductaion = (String)education.getSelectedItem();
             String soccupation = (String)occupation.getSelectedItem();
             String seniorcitizen=null;
             if(syes.isSelected()){
                 seniorcitizen="Yes";
             }else if(sno.isSelected()){
                 seniorcitizen="No";
             }
             
             String existingaccount=null;
             if(eyes.isSelected()){
                 existingaccount="Yes";
             }else if(eno.isSelected()){
                 existingaccount="No";
             }
             
             String span = pan.getText();
             String sadhar = adharno.getText();
             
             
             try{
                     Cons c = new Cons();
                     String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seductaion+"','"+soccupation+"','"+span+"','"+sadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                     c.s.executeUpdate(query);
                 
                     
                     setVisible(false);
                     new SignUpThree(formno).setVisible(true);
                     
             }catch(Exception e){
                 System.out.println(e);
             }
         }
    public static void main(String args[]) {
        new SignUpTwo("");
    }
}

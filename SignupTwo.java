package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    long random;
    JTextField nameTextField,fnameTextField,emailaddressTextField,panTextField,aadharTextField,stateTextField,pinTextField;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JDateChooser dateChooser;
    JComboBox religion,category,edvalues,income;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        
        
        setTitle("New Account Application: Page 2");
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        setLayout(null);
       
       JLabel personalDetails = new JLabel("Page 2: Additional Details");
       personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
       personalDetails.setBounds(290, 80, 400, 30);
       add(personalDetails);
       
       JLabel name = new JLabel("Religion: ");
       name.setFont(new Font("Raleway", Font.BOLD, 22));
       name.setBounds(100, 140, 100, 30);
       add(name);
       
       String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
       religion = new JComboBox(valReligion);
       religion.setFont(new Font("Raleway",Font.BOLD, 15));
       religion.setBounds(300, 140, 400, 30);
       religion.setBackground(Color.white);
       add(religion);
       
       JLabel fname = new JLabel("Category: ");
       fname.setFont(new Font("Raleway", Font.BOLD, 22));
       fname.setBounds(100, 190, 200, 30);
       add(fname);
       
       String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
       category = new JComboBox(valCategory);
       category.setFont(new Font("Raleway",Font.BOLD, 15));
       category.setBounds(300, 190, 400, 30);
       category.setBackground(Color.white);
       add(category);
       
       JLabel dob = new JLabel("Income: ");
       dob.setFont(new Font("Raleway", Font.BOLD, 22));
       dob.setBounds(100, 240, 200, 30);
       add(dob);
       
       String valIncome[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
       income = new JComboBox(valIncome);
       income.setFont(new Font("Raleway",Font.BOLD, 15));
       income.setBounds(300, 240, 400, 30);
       income.setForeground(new Color(105, 15, 105));
       income.setBackground(Color.white);
       add(income);
       
       JLabel gender = new JLabel("Educational ");
       gender.setFont(new Font("Raleway", Font.BOLD, 22));
       gender.setBounds(100, 290, 200, 30);
       add(gender);
       
       JLabel email = new JLabel("Qualification: ");
       email.setFont(new Font("Raleway", Font.BOLD, 22));
       email.setBounds(100, 315, 200, 30);
       add(email);
       
       String valedvalues[] = {"Non-Graduation", "Graduation", "Under-Graduation", "Post-Graduation", "PHD"};
       edvalues = new JComboBox(valedvalues);
       edvalues.setFont(new Font("Raleway",Font.BOLD, 15));
       edvalues.setBounds(300, 315, 400, 30);
       edvalues.setForeground(new Color(105, 15, 105));
       edvalues.setBackground(Color.white);
       add(edvalues);
       
       JLabel marital = new JLabel("PAN Number: ");
       marital.setFont(new Font("Raleway", Font.BOLD, 22));
       marital.setBounds(100, 390, 200, 30);
       add(marital);
       
       panTextField = new JTextField();
       panTextField.setFont(new Font("Raleway",Font.BOLD, 22));
       panTextField.setBounds(300, 390, 400, 30);
       add(panTextField);
       
       JLabel address = new JLabel("Aadhar Number: ");
       address.setFont(new Font("Raleway", Font.BOLD, 22));
       address.setBounds(100, 440, 200, 30);
       add(address);
       
       aadharTextField = new JTextField();
       aadharTextField.setFont(new Font("Raleway",Font.BOLD, 22));
       aadharTextField.setBounds(300, 440, 400, 30);
       add(aadharTextField);
       
       JLabel city = new JLabel("Senior Citizen: ");
       city.setFont(new Font("Raleway", Font.BOLD, 22));
       city.setBounds(100, 490, 200, 30);
       add(city);
       
       syes = new JRadioButton("Yes");
       syes.setBounds(300, 490, 60, 30);
       syes.setBackground(Color.WHITE);
       add(syes);
       
       sno = new JRadioButton("No");
       sno.setBounds(450, 490, 120, 30);
       sno.setBackground(Color.WHITE);   
       add(sno);
       
       ButtonGroup gendergroup = new ButtonGroup();
       gendergroup.add(syes);
       gendergroup.add(sno);
       
       JLabel state = new JLabel("Exisiting Account: ");
       state.setFont(new Font("Raleway", Font.BOLD, 22));
       state.setBounds(100, 540, 200, 30);
       add(state);
       
       eyes = new JRadioButton("Yes");
       eyes.setBounds(300, 540, 60, 30);
       eyes.setBackground(Color.WHITE);
       add(eyes);
       
       eno = new JRadioButton("NO");
       eno.setBounds(450, 540, 120, 30);
       eno.setBackground(Color.WHITE);   
       add(eno);
       
       ButtonGroup egroup = new ButtonGroup();
       gendergroup.add(eyes);
       gendergroup.add(eno);
       
              
       next = new JButton("Next");
       next.setBackground(Color.BLACK);
       next.setForeground(Color.WHITE);
       next.setFont(new Font("Raleway", Font.BOLD, 14));
       next.setBounds(620, 640, 80, 30);
       next.addActionListener(this);
       add(next);
       
       getContentPane().setBackground(Color.white);
        
       setSize(850, 800);
       setLocation(350, 10);
       setVisible(true);        
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) edvalues.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        } else if(sno.isSelected()){
            seniorcitizen = "No";
        }
        String exisitingacoount = null;
        if(eyes.isSelected()){
            exisitingacoount = "Yes";
        }else if(eno.isSelected()){
            exisitingacoount = "No";
        }
        String span = panTextField.getText();
        String saadhar = aadharTextField.getText();
        
        try{
            Conn c = new Conn();
            String query = "insert into signuptwo value('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+seniorcitizen+"','"+exisitingacoount+"','"+span+"','"+saadhar+"')";
            c.s.executeUpdate(query);
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args){
        new SignupTwo("");
    }

}

package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton logIn, cancel;
    JTextField tfusername, tfpass; 
    
    Login(){
    
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lbllogo = new JLabel("LOG IN");
        lbllogo.setBounds(100,20,100,20);
        lbllogo.setForeground(Color.BLUE);
        lbllogo.setFont(new Font("serif",Font.BOLD, 18));

        add(lbllogo);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40,60,100,20);
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(120,60,150,20);
        add(tfusername);
        
        JLabel lblpass = new JLabel("Password");
        lblpass.setBounds(40,90,100,20);
        add(lblpass);
        
        tfpass = new JPasswordField();
        tfpass.setBounds(120,90,150,20);
        add(tfpass);
        
        
        logIn = new JButton("Login");
        logIn.setBounds(40,170,120,30);
        logIn.setBackground(Color.BLUE);
        logIn.setForeground(Color.WHITE);
        logIn.addActionListener(this);
        logIn.setFont(new Font("serif",Font.BOLD, 15));
        add(logIn);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(180,170,120,30);
        cancel.setBackground(Color.BLUE);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);

        cancel.setFont(new Font("serif",Font.BOLD, 15));
        add(cancel);
      
        
        
        setSize(600,300);
        setLocation(500,250);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Login();
    }

  
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== logIn){
            String username = tfusername.getText();
            String password = tfpass.getText();
            
            String query = "select * from login where username ='"+ username+"'and password ='"+password+"'";
            try{
                Conn c = new Conn();
                ResultSet rs =  (ResultSet) c.s.executeQuery(query);
                
                if(rs.next()){
                    setVisible(false);
                    new Project();
                }else{
                    JOptionPlane.showMessageDialog(null, "invalid username or password");
                    setVisible(false);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==cancel){
            setVisible(false);
        }
            
//        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}

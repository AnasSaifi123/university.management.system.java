package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);
//        
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(350, 0, 300, 200);
//        add(image);
        
        JLabel heading = new JLabel("<html>University Management System</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("Developed By: Anas Saifi, Ritik Kumar");
        name.setBounds(70, 220, 700, 40);
          name.setForeground(Color.RED);
        name.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(name);
        
//         JLabel nname = new JLabel("Ritik Kumar");
//        nname.setBounds(70, 270, 550, 40);
//        nname.setFont(new Font("Tahoma", Font.BOLD, 30));
//        add(nname);
        
        JLabel rollno = new JLabel("Roll number: 200920106007, 200920106025");
        rollno.setBounds(70, 300, 800, 40);
        rollno.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(rollno);
        
        JLabel contact = new JLabel("Contact: anassaifi6140@gmail.com");
        contact.setBounds(70, 340, 550, 40);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(contact);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}
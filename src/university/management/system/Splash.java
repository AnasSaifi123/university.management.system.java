package university.management.system;

import javax.swing.*;
import java.awt.*;


public class Splash extends JFrame implements Runnable {
    
    Thread t;
    

    Splash(){
        
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("C:\\Users\\muhammad\\Desktop\\New folder (4)\\343109128_613587437369719_6799589158410576710_n.jpg"));
//        JLabel image = new JLabel(i1);
//        add(image);
//        
      t = new Thread(this);
      t.start();
       setVisible(true);
       
       int x = 1;
        for(int i = 2; i<=600; i++, i+=4, x+=1){
            setLocation(600-((i+x)/2),350-(i/2));
            setSize(i+3*x, i+x/2);
            
            try{
            Thread.sleep(10);
            }catch(Exception e){}

        }
    
    
        
        
}
    public void run(){
        try{
            Thread.sleep(5000);
            setVisible(false);
            
            new Login();
        }catch(Exception e){
            
        }
}
    
    public static void main (String[] args){
        
        new Splash();
}
}
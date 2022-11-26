import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {
Splash() 
{
    getContentPane().setBackground (Color.WHITE);
    setLayout(null);
    
    
    JLabel heading = new JLabel("The Office");
    heading.setBounds(100, 40, 1240, 60);
    heading.setFont(new Font("serif", Font. PLAIN, 60));
    add(heading);
    heading.setForeground(Color.BLACK);
    
    ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("front.jpg"));
    Image i2 = il.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3); 
    image.setBounds(1, 1, 1240, 640);
     add(image); 
     
     
     JButton clickhere = new JButton("Welcome to The Office");
     clickhere.setBounds(400, 400, 300, 70);
     image.add(clickhere);
     clickhere.setBackground(Color.BLACK);
     clickhere.setForeground(Color.WHITE);
     clickhere.addActionListener(this);
     image.add(clickhere);
    
    
  setSize (1240,640);
  setLocation (250,50);
  setVisible (true);
       
  
        while(true) {
heading.setVisible(false);
try 
      {
Thread.sleep(500);
}
   catch (Exception e)
{
           }
heading.setVisible(true);
try
     {
    Thread.sleep(500);
}
    catch (Exception e){
} 
        }
}

    public void actionPerformed(ActionEvent ae)
    {
      setVisible(false);
      new Login();
}

        
 
    public static void main(String args[])
    {
      new Splash();
    }
}

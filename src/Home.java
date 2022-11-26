import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Home extends JFrame implements ActionListener
{
JButton view,add,update,remove;
Home()  
{
    setLayout(null);
    ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("home.jpg"));
    Image i2 = il.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3); 
    image.setBounds(1, 1, 1120, 630);
     add(image); 
     
     JLabel heading = new JLabel("Employee Management System");
     heading.setBounds(100, 40, 1240, 60);
    heading.setFont(new Font("serif", Font.BOLD , 60));
    image.add(heading);
    heading.setForeground(Color.BLACK);
    
    
  add = new JButton("Add Employee");
    add.setBounds(470,150,150,40);
    add.addActionListener(this);
    image.add(add);
    
        view = new JButton("View Employee");
    view.setBounds(470,210,150,40);
     view.addActionListener(this);
    
    image.add(view);
    
         update = new JButton("Update Employee");
   update.setBounds(470,270,150,40);
        update.addActionListener(this);

    image.add(update);
    
         remove = new JButton("Remove Employee");
    remove.setBounds(470,330,150,40);
         remove.addActionListener(this);

    image.add(remove);
    
    
    setSize(1120,630);
    setVisible(true);
    
}
    public void actionPerformed(ActionEvent ae){
       if (ae.getSource()==add){
           setVisible(false);
           new AddEmployee();
    }
       else if (ae.getSource()==view){
           setVisible(false);
           new ViewEmployee();
       }
       else if (ae.getSource()==update){
    setVisible(false);
           new ViewEmployee();
    }
       //else if (ae.getSource()==remove){
         //  setVisible(false);
         //  new RemoveEmployee();}
    }
public static void main(String[] args)
{
  new Home();
}
}

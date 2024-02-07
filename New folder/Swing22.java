import javax.swing.JFrame;

import javafx.event.ActionEvent;

import javax.swing.*;
//package New folder;
import java.awt.event.*;
import java.awt.*;
public class Swing2 extends JFrame
 {
     private JButton b=new JButton("new");
     public Swing2(){}
     public Swing2(String s){super(s);}
     public void setComponents()
     {
         add(b);
         setLayout(null);
         b.setBounds(30,30,100,20);
         b.addActionListener(new Myclass());
     }
     
     public static void main(String []args)
     {
     Swing2 obj=new Swing2("program");
     obj.setComponents();
     obj.setVisible(true);
     obj.setSize(300,300);
     obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
}
class Myclass implements ActionListener
     {
        public void actionPerformed(ActionEvent e)
         {
             System.out.println("hii");
         }
     }
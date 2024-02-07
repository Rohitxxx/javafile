import javax.swing.*;
public class GuiExample {
    public GuiExample(){}
  //  public GuiExample(String s){super(s);}
    public static void main(String aa[]){
        JFrame jf=new JFrame("MyApp");
        JPanel p=new JPanel();
        JLabel l1,l2;
        JTextField t1,t2;
      //  JButton b;
        l1=new JLabel("Login id:");
        l2=new JLabel("Password:");
        t1=new JTextField(30);
        t2=new JTextField(30);
      
       p.add(l1);
       p.add(t1);
        p.add(l2);
       
        p.add(t2);
        jf.add(p);
       // b=new JButton("Submit");
      //  jf.add(b);
        jf.setVisible(true);
        jf.setSize(500,500);
       
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}
//package New folder;
import javax.swing.*;
public class SwingExample2 extends JFrame {
    public SwingExample2(){}
    public SwingExample2(String s)
    {
        super(s);
    }
    public static void main(String []args)
    {
        SwingExample2 sw=new SwingExample2("Rohit new");
        sw.setSize(400,300);
        sw.setVisible(true);
        sw.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
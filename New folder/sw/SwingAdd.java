import javax.swing.*;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.awt.event.*;

public class SwingAdd extends JFrame 
{
    public JLabel l1, l2, l3, l4;
    public JTextField t1, t2;
    public JButton b;

    public SwingAdd() {
    }

    public SwingAdd(String s) {
        super(s);
    }

    public void setComponents()
     {
        l1 = new JLabel("Enter two numbers");
        l2 = new JLabel("First Number");
        l3 = new JLabel("Second Number");
        t1 = new JTextField();
        t2 = new JTextField();
        b = new JButton("Add");
        l4 = new JLabel();
        setLayout(null);

        l1.setBounds(30, 30, 200, 20);
        l2.setBounds(30, 50, 100, 20);
        t1.setBounds(150, 50, 100, 20);
        l3.setBounds(30, 130, 100, 20);
        t2.setBounds(150, 130, 100, 20);
        b.setBounds(80, 180, 100, 20);

        l4.setBounds(50, 240, 200, 20);
        b.addActionListener(new Handler());
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b);
    }

    class Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int s = a + b;
            l3.setText("Result is " + s);
        }
    }

    public static void main(String[] args) // throws NullPointerException
    {
        SwingAdd obj = new SwingAdd("Rohit's add ");
        obj.setComponents();

        obj.setSize(400, 500);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

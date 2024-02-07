import java.awt.*;
public class MyFrame {
    public static void main(String args[]){
        Frame f=new Frame("myFrame");
	Panel p1= new Panel();
	Label l1= new Label("Login ID");
	TextField t1= new TextField(30);
	Label l2= new Label("PAssword");
	TextField t2= new TextField(30);
	p1.add(l1);
	p1.add(t1);
	p1.add(l2);
	p1.add(t2);
	f.add(p1);
        f.setSize(350,400);
        f.setVisible(true);
    }
}
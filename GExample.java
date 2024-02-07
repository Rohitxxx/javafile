import java.awt.*;
public class GExample {
    public static void main(String args[]){
        Frame f=new Frame("MyFrame");
        Panel p=new Panel();
      //  Panel p2=new Panel();
        Label l1=new Label("Login id:");
        Label l2=new Label("Password:");
        TextField t1=new TextField(30);
        TextField t2=new TextField(30);
       
        p.add(l1);
        p.add(t1);
        
        p.add(l2);
        p.add(t2);
        f.add(p);
       // f.add(p2);
        f.setSize(400,400);
        f.setVisible(true);
       f.exit
    }
}
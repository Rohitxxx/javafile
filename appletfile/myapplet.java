import java.applet.Applet;
import java.awt.*;
/*<applet code="Myapplet" width="300" height="300"></applet>*/
public class Myapplet extends Applet
{
	public void init()
	{
		Label l1,l2;
		TextField t1,t2;
		Button b1;
		l1=new Label("First number");
		l2=new Label("Second number");
		t1=new TextField();
		t2=new TextField();
		b1=new Button("Add");
		setLayout(null);
		l1.setBounds(30,50,100,20);
		t1.setBounds(150,50,100,20);
		l2.setBounds(30,100,100,20);
		t2.setBounds(150,100,100,20);
		b1.setBounds(100,150,80,20);
		add(l1);
		add(l2);
		add(t1);
		add(t2);
		add(b1); 
	}
} 
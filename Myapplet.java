import java.applet.Applet;
import java.awt.*;
// <applet code='Myapplet' width='300' height='300'></applet code>
public class Myapplet extends Applet{
    Label l1;
    public void init(){
        l1=new Label("hello applet");
        add(l1);
    }
}
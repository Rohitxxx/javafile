import java.awt.*;
import java.awt.event.*;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
public class GuiCal extends Frame implements ActionListener{
    TextField txtAns;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn00,btnDecimal,btnPlus,btnMinus,btnMul,btnDiv,btnClr;
    Panel p1;
    public GuiCal(){
        btn0=new Button("0");
        btn1=new Button("1");
        btn2=new Button("2");
        btn3=new Button("3");
        btn4=new Button("4");
        btn5=new Button("5");
        btn6=new Button("6");
        btn7=new Button("7");
        btn8=new Button("8");
        btn9=new Button("9");
        btn00=new Button("00");
        btnPlus=new Button("+");
        btnMinus=new Button("-");
        btnMul=new Button("*");
        btnDiv=new Button("/");
        btnDecimal=new Button(".");
        txtAns=new TextField();
        setUi();
    }
    public void setUi(){
        add(btn0);
        p1.add(btn1);

    }
    
}
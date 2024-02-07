import java.util.*;

public class Cal {
    String s1,s2,op,res;
    Float f1,f2,ans;
    public void cal(){
        f1=Float.parseFloat(s1);
        f2=Float.parseFloat(s2);
        //ans=Float.parseFloat(res);
        switch(op.charAt(0)){
            case '+':ans=f1+f2;
                    break;
            case '-':ans=f1-f2;
                    break;
            case '*':ans=f1*f2;
                    break;
            case '/':/*if(f2==0){
                    ans=0f;
                    }
                    else{
                        ans=f1/f2;

                    }*/
                    ans=f1/f2;
                    break;
            default:ans=0f;
        }
        res=ans.toString();
    }
    public static void main(String args[]){
        Cal c=new Cal();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        c.s1=scan.next();
        System.out.println("Enter an operator");
        c.op=scan.next();
        System.out.println("Enter a number");
        c.s2=scan.next();
        c.cal();
        System.out.println("the result is "+c.res);
        
    }
}
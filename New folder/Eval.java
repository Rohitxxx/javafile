import java.util.*;
public class Eval {
    // String p[]={"1","2","*","3","+","4","5","/","-","#"};
    String p[]={"4","5","2","*","+","3","-","3","3","/","-","2","4","*","-","#"};
    public static void main(String args[]){
        Eval e=new Eval();
        System.out.println(e.eval());
    }
    boolean isDigit(char ch){
        char c[]={'0','1','2','3','4','5','6','7','8','9','.'};
        for(int i=0;i<11;i++)
            if(ch==c[i]){
                return true;
            }
        return false;

    }
    public String eval(){
        //add # to p
        int i=0;
        Stack<String> stk=new Stack();
        while(p[i]!="#"){
            if(isDigit(p[i].charAt(0))){
                stk.push(p[i]);
                i++;
            }
            else{
                Float A,B,res=0f;
                A=Float.parseFloat(stk.pop());
                B=Float.parseFloat(stk.pop());
                char ch=p[i].charAt(0);
                switch(ch){
                    case '+':res=B+A;
                            break;
                    case '-':res=B-A;
                            break;
                    case '*':res=B*A;
                            break;
                    case '/':res=B/A;
                            break;
                    
                  }
                  stk.push(res.toString());
                  i++;
            }
        }
        return stk.pop();
    }
}
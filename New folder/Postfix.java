import java.util.*;

// import javax.lang.model.util.ElementScanner6;
public class Postfix {
    // public String str[]={"53","-","4.2","/","52","*","8.3",null};
    // public String str[]={"1","*","2","/","(","3","+","4",")","-","5","*","6",null};
    // public String str[]={"1","*","2","+","3","-","4","/","5",null};
    public String str[]={"4","+","5","*","2","-","3","-","3","/","3","-","2","*","4",null};
    public String p[];
    public String exp[];
    {exp=new String[20];
     p=new String[20];
    }
    
    public static void main(String args[]){
        // String str[]={"rohit","mohit","533","osd"};
        // Stack<String> stk=new Stack();
        // for(int i=0;i<str.length;i++){
        //     stk.push(str[i]);
        // }
        // while(!stk.isEmpty()){
        //     System.out.println(stk.pop());
        // }
        Postfix px=new Postfix();
            px.postfix();
             for(int i=0;px.p[i]!=null;i++)
             System.out.println(px.p[i]);
    }
    boolean isDigit(char ch){
        char c[]={'0','1','2','3','4','5','6','7','8','9','.'};
        for(int i=0;i<11;i++)
            if(ch==c[i]){
                return true;
            }
        return false;

    }
    public int priority(String s){
        if(s=="-"||s=="+"){
            return 1;
        }
        else if(s=="*"||s=="/"||s=="%"){
            return 2;
        }
        else if(s=="("||s==")")
            return 0;
        else
            return 0;
    }
    public void postfix(){
        int i=0,j=0,k;
        for( k=0;str[k]!=null;k++){
            exp[k]=str[k];
        }
        exp[k]=")";
       
        Stack<String> stk=new Stack();
        stk.push("(");
        while(!stk.isEmpty()){
            if(isDigit(exp[i].charAt(0))){
                p[j]=exp[i];
                i++;
                j++;
            }
            else if(exp[i]=="("){
                stk.push(exp[i]);
                i++;
            }
            else if((exp[i]==")")){
                while(stk.peek()!="("){
                    p[j]=stk.pop();
                    j++;
                }
                stk.pop();
            }
            else if(!isDigit(exp[i].charAt(0))){
                while(priority(stk.peek())>=priority(exp[i])){
                    p[j]=stk.pop();
                    j++;
                    
                }
                stk.push(exp[i]);
                i++;
            }
        }
        // for(int y=0;y<p.length;y++){
        //     System.out.println(p[i]);
        // }
    }

}
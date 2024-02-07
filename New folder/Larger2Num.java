import java.util.*;
public class Larger2Num {
    private int num1,num2;
    public Larger2Num(){
        Scanner cin=new Scanner(System.in);
        System.out.println("enter the two number");
        num1=cin.nextInt();
        num2=cin.nextInt();
    }
    public void compare(){
        if(num1>num2){
            System.out.println(num1+" is greater");
        }
        else{
            System.out.println(num2+" is greater");
        }
    }
    public static void main(String args[]){
        Larger2Num num=new Larger2Num();
        num.compare();
    }
}
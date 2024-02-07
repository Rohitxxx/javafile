import java.util.*;

public class sum {
    private int num1,num2,sum;
    public sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
    }
    public int cal(){
        sum=num1+num2;
        return sum;
    }
    public static void main(String args[]){
        sum s=new sum();
        System.out.println("sum is "+s.cal());
    }
}
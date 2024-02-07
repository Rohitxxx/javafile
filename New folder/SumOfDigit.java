import java.util.Scanner;

public class SumOfDigit {
    private int num;
    public SumOfDigit(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        num=scan.nextInt();
    }
    public int sum(){
        int copy=num;
        int temp=0,res=0;
        while(copy>0){
            temp=copy%10;
            copy/=10;
            res=res+temp;
        }
        return res;
    }
    public static void main(String args[]){
        SumOfDigit obj=new SumOfDigit();
        System.out.println(obj.sum());
    }
}
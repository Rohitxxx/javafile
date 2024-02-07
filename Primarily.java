import java.util.Scanner;
public class Primarily {
    private int num;
    public Primarily(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        num=scan.nextInt();
    }
    public boolean check(){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }

        }
        return true;
    }
    public static void main(String args[]){
        Primarily obj=new Primarily();
        if(obj.check()==true)
            System.out.println("the given number is prime");
        else
            System.out.println("the given number is not prime");
       
    }
}
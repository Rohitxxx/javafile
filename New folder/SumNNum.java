import java.util.Scanner;

public class SumNNum {
    private int num[],n;
    public SumNNum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount of numbers");
         n=sc.nextInt();
        num =new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the number");
          num[i]=sc.nextInt();
      }
      sc.close();
    }
    public void fun(){
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+num[i];
        }
        System.out.println("sum is "+sum);
    }
    public static void main(String args[]){
      SumNNum s=new SumNNum();
      s.fun();
    }

}
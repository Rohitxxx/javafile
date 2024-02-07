import java.util.*;

public class LargestNum {
    private int num[],n;
    public LargestNum(){
        Scanner jin=new Scanner(System.in);
        System.out.println("Enter the amount of numbers:");
        n=jin.nextInt();
        num=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the number");
            num[i]=jin.nextInt();
        }
    }
    public int cal(){
        int temp;
        temp=num[0];
        for(int i=1;i<n;i++){
            if(num[i]>temp){
                temp=num[i];
            }
        }
        return temp;
    }
    public static void main(String []args){
        LargestNum obj=new LargestNum();
        System.out.print("Largest number is "+obj.cal());
    }
}
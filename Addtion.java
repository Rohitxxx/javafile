import java.util.*;
public class Addtion {
    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int sum=0;
        int []num=new int[x];
        for(int i=0;i<x;i++)
        {
            num[i]=sc.nextInt();
            sum=sum+num[i];
        }
        System.out.println(sum);
    }
}
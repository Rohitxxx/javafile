/*import java.util.Scanner;
public class IsDuplicateNum {
    public static void main(String args[]){
        int digits[]=new int[10];
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scan.nextInt();
        for(int i=0;i<10;i++){
            digits[i]=num%10;
            num/=10;
            if(num<0)
                break;
        }
        int occur;
        for(int j=0;j<10;j++){
            occur=0;
            for(int i=0;i<10;i++){
                if(j==digits[i]){
                    occur++;
                }
            }
            System.out.println(j+" occurs: "+occur+" times");
        }
    }
    
}*/
import java.util.Scanner;

public class IsDuplicateNum{
    public static void main(String args[]){

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scan.nextInt();
        int []arr=new int[10];
        // for(int i=0;i<10;i++){
        //     System.out.println(arr[i]);        all arr[i] will contain 0
        // }
        while(num>0){
            int rem=num%10;
            arr[rem]++;
            num/=10;
        }
        for(int i=0;i<10;i++){
            if(arr[i]>1){
                System.out.println(i+": "+arr[i]+" times");
            }
        }
        scan.close();
    }

}
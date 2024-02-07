import java.util.Scanner;
public class PrimeNumber {
    private int limit;
    public PrimeNumber(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the limit of prime numbers:");
        limit=scan.nextInt();
    }
    public boolean prime(int i){
       
            for(int j=2;j<i;j++){
                if(i%j==0)
                    return false;
            }
            return true;
     }
     public void print(){
         for(int i=2;i<limit;i++){
             if(prime(i)){
                 System.out.print(i+"  ");
             }
         }
     }
     public static void main(String args[]){
         PrimeNumber obj=new PrimeNumber();
         obj.print();
     }

 }

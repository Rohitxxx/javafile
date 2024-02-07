import java.util.Scanner;

public class NthPrime {
    private int Nth;
    public NthPrime(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Nth place of prime");
        Nth=scan.nextInt();
    }
    public boolean prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int findNthPrime(){
        int temp=0;
       for(int i=2;i<1_00_000;i++){
           if(prime(i)){
               temp++;
           }
           if(temp==Nth){
               return i;
           }
        }
        return 0;
    }
    public static void main(String args[]){
        NthPrime obj=new NthPrime();
       System.out.println( obj.findNthPrime());
    }
}
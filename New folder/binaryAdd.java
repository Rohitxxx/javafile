import java.util.Scanner;
class binaryAdd{
  
   public static String add(String n1,String n2){
    int b1=Integer.parseInt(n1,16);
    int b2=Integer.parseInt(n2,16);
    int s=b1+b2;
    return Integer.toHexString(s);
   }
    public static void main(String arg[]){
        String b1,b2,sum;
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the first binary number");
        b1=sc.nextLine();
        System.out.println("Enter the Second binary number");
        b2=sc.nextLine(); 
        sum=add(b1,b2);
        System.out.println("The sum is"+sum);
    }

}
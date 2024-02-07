import java.util.*;
public class Mycase {
   
    public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        switch(num){
            case 1:System.out.println("you have entered 1");
                    break;
            case 2:System.out.println("you have entered 2");
                    break;
            case 3:System.out.println("you have entered 3");
                    break;
            default:System.out.println("invalid selection");
        }
        sc.close();
    }
}
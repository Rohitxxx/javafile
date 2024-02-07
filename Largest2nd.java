import java.util.Scanner;

public class Largest2nd {
    private int num[], num1, num2;
    private final int n;

    public Largest2nd() {
        final Scanner sn = new Scanner(System.in);
        System.out.println("enter the amount of number");
        n =sn.nextInt();
        num=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number");
            num[i] = sn.nextInt();
        }
        sn.close();
    }

    public int cal() {
        num1 = num[0];
        for (int i = 1; i < n; i++) {
            if (num[i] > num1) {
                num1 = num[i];
        }
    }
        num2=num[0];
        for(int i=1;i<n;i++){
            if(num[i]>num2&&(num1!=num[i])){
                num2=num[i];
            }
        }
        return num2;
    }


    public static void main(final String args[]){
        final Largest2nd obj = new Largest2nd();
        System.out.println("the second largest numbrer is " + obj.cal());
    }
}
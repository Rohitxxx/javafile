import java.util.Scanner;
// import java.lang.Math;

public class Armstrong {
    private int num;

    public Armstrong() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        num = scan.nextInt();
    }

    public boolean check() {
        // Math m=new Math();
        int temp, copy, res=0;
        copy = num;
        while (copy > 0) {
            temp = copy % 10;
            res = res + temp * temp * temp;
            copy /= 10;
        }
        if (res == num)
            return true;
        else
            return false;
    }

    public static void main(String args[]) {
        Armstrong obj = new Armstrong();
        if(obj.check()){
            System.out.println("The given number is Armstrong");
        }
        else{
            System.out.println("The given number is not Armstrong");
        }
    }
}
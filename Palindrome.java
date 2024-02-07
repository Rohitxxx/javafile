import java.util.Scanner;

public class Palindrome {
    private final int num;

    public Palindrome() {
        final Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        num = scan.nextInt();
        scan.close();
    }

    public boolean check() {
        final int rev = reverse();
        if (rev == num) {
            return true;
        } else
            return false;
    }

    public int reverse() {
        int temp, copy = num, rev = 0;
        while (copy > 0) {
            temp = copy % 10;
            copy /= 10;
            rev = rev * 10 + temp;
        }
        return rev;
    }

    public static void main(final String args[]) {
        final Palindrome obj = new Palindrome();
        if (obj.check()) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
    }
}
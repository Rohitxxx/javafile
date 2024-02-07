public class Exception3 {
    public static void main (String args[]){
        int balance=5000;
        int withdrawl=6000;
        if(withdrawl>balance)
            throw new ArithmeticException("insufficient balance");
        balance=balance-withdrawl;
        System.out.println("transaction successfull");
        System.out.println("Program continues");
    }    
}
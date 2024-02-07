public class Exception4 {
    public static void main(String arg[]){
        int balance=5000;
        int withdrawl=6000;
        try{
            if(withdrawl>balance)
                throw new ArithmeticException("insufficient balance");
            balance=balance-withdrawl;
            System.out.println("transaction successfull");

        }
        catch(ArithmeticException e){
            System.out.println("Exception :"+e.getMessage());
        }
        finally{
            System.out.println("in finally");
        }
        System.out.println("program continues");
    }    
}
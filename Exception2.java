public class Exception2 {
    public static void main(String args[]){
        try{
            int a[]=null;
            System.out.println(a.length);
            System.out.println("in try");

        }
        catch(ArithmeticException e){
            System.out.println("Exception :"+e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println("Exception :"+e.getMessage());
        }
        finally{
            System.out.println("Program continues");
        }
    }
}
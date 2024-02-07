public class Exception6 {
    public void divide() throws ArithmeticException{
        int a=5,b=0,c;
        c=a/b;
        System.out.println("answer is "+c);
    }
    public static void main(String args[]){
        Exception6 e=new Exception6();
        e.divide();
    }   
}
import java.util.Scanner;
public class FactorialRec {
        private long num;
        public long getNum() {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter a number :");
            num=scan.nextLong();
            scan.close();
            return num;
        }
        public long factorial(long num) {
            long res=1;
            if(num==1){
                return 1;
            }
            else{
                 res=num*factorial(num-1);
                 return res;
            }
        }
        public static void main(String args[]){
            FactorialRec obj=new FactorialRec();
            System.out.println(obj.factorial(obj.getNum()));
        }
}
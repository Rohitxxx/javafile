import java.util.*;

public class LightSpeed {
    public static void main(String args[]){
        long days,second,distance,lightspeed;
        lightspeed=186000;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of days");
        days=scan.nextLong();
        second=lightspeed*60*60*24;
         distance=second*days;
         System.out.println("distance is "+distance+" in "+days+" days");
         scan.close();
    }
    
}
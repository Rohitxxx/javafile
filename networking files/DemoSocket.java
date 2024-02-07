import java.net.*;

public class DemoSocket {
    public static void main(String args[]){
        try{
            Socket s=new Socket("localHost",44);
            System.out.println("client is started");
            System.out.println(s);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
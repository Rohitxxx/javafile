
import java.net.*;
public class DemoServerSocket {
    public static void main(String args[]){
        try{
            ServerSocket sk=new ServerSocket(44);
            Socket s=sk.accept();
            System.out.println("Server is started...");
            System.out.println(s);

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
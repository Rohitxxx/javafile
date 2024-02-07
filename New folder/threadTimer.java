public class threadTimer extends Thread{
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("hello there");
                sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String arg[]){
        threadTimer t=new threadTimer();
        t.start();
    }
}

class Aa implements Runnable{
    public void run(){
        for(int i=0;i<10;i++)
            System.out.println(i+" Aa");
    }
}
class Bb implements Runnable{
    public void run(){
        for(int j=0;j<10;j++)
            System.out.println(j+" Bb");
    }
}
class Mythreadn{
    public static void main(String args[]){
        Thread t1=new Thread(new Aa());
        Thread t2=new Thread(new Bb());
        t1.start();
        t2.start();
    }
}
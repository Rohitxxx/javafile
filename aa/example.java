class Box{
    private int length,breadth,height;
    public void setDimention(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
    }
    public void showDimention(){
        System.out.println("l="+length);
        System.out.println("b="+breadth);
        System.out.println("h="+height);

    }
}
public class example{
    public static void main(String args[]){
        Box smallBox=new Box();
        smallBox.setDimention(4, 5, 6);
        smallBox.showDimention();
    }
}
interface i1{
    void f1();
}
interface i2{
    void f2();
}
interface i3 extends i1,i2{
    void f3();
}

public class InterfaceDemo implements i3{
   public void f1(){
        System.out.println("f1");
    }
    public void f2(){
        System.out.println("f2");
    }
    public void f3(){
        System.out.println("f3");
    } 
    public static void main(String args[]){
        InterfaceDemo d=new InterfaceDemo();
        d.f1();
        d.f2();
        d.f3();
    }
}
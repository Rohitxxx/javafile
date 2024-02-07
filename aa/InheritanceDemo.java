class a{
    public void f1(){
        System.out.println("f1");
    }
}
class b{
    public void f2(){
        System.out.println("f2");
    }
}

public class InheritanceDemo extends a{//java not supports multiple inheritance i.e class InheritanceDemo extends a,b error
    public static void main(String args[]){
        InheritanceDemo i=new InheritanceDemo();
        i.f1();
        
    }
}
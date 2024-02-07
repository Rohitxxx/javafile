class Example{
   private int a;
   public void fun(){
       a=3;
   }
}
class ModifierDemo  {
    public static void main(String args[]){
       Example e1=new Example();
        e1.a=123;
        System.out.println(e1.a);
    }
}
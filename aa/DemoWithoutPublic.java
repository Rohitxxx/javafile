 class display {
    public static void main(String args[]){
        System.out.println("hellow");
        DemoWithoutPublic d=new DemoWithoutPublic();
        d.show();
    }
}
class DemoWithoutPublic {
    public void show(){
        System.out.println("bye");
    }
    public static void main(String args[]){
        System.out.println("this is out of my mind");
    }
}
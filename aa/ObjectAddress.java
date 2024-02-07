

public class ObjectAddress {
    public static void main(String args[]){
        String s="rohit";
        String s1="rohit";
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        s=s+s+s1;
        System.out.println(s);
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        
    }
}
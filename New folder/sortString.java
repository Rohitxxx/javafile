import java.util.Arrays;
class sortString{
    public static void main(String arg[]){
        String s="rohit";
        System.out.println(s);
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        String s2=ch.toString();
        System.out.println(s2);
        System.out.println(new String(ch));
    }
}
import java.io.*;
public class FileOutputExample  {
    public static void main(String args[]) throws IOException{
        FileOutputStream fout=new FileOutputStream(".abc.txt");
        String s="My name is Rohit maurya";
        char []ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            fout.write(ch[i]);
        }
        fout.close();
    }
}
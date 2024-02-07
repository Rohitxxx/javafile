import java.io.*;
//import java.lang.*;
public class ExFileWrite
{
	public static void main(String []args) throws IOException
	{
		FileOutputStream f1=new FileOutputStream("e:/javafile/aa.txt",true);
		String n="rohit";
		char ch[]=n.toCharArray();
		for(int i=0;i<n.length();i++)
			f1.write(ch[i]);
		f1.close();
	} 
}
import java.lang.*;
import java.io.*;
public class ExampleFile
{
	public static void main(String []args) throws IOException
	{
		File f1=new File("e:/javafile/aa.txt");
	//	if(!f1.exists())
		{
			f1.createNewFile();
		}
		System.out.println("file size is "+f1.length());
		//f1.write();
	}
}
import java.io.*;
public class ExFileRead
{
	public static void main(String []args) throws IOException
	{
		FileInputStream fin=new FileInputStream("e:/javafile/aa.txt");
		int i;
		i=fin.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fin.read();
		}
		fin.close();
	}
}
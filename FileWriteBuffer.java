import java.io.*;
public class FileWriteBuffer
{
	public static void main(String []args) throws IOException
	{
		FileWriter fw=new FileWriter("e:/javafile/aaa.txt",true);
		BufferedWriter bf=new BufferedWriter(fw);
		String s="\n hii...";
		bf.write(s);
		bf.close();
	}
}
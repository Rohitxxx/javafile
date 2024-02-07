import java.io.*;
public class FileReadBuffer
{
	public static void main(String []args) throws IOException
	{
		FileReader fr=new FileReader("e:/javafile/aaa.txt");
		BufferedReader bf=new BufferedReader(fr);
		char []ch=new char[30];
		fr.read(ch,3,20);
		System.out.println(ch);
		bf.close();
	}
}
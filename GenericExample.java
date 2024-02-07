class Array
{
	public <E> void printArray(E []a)
	{
		for(int i=0;i<a.length;i++)
			System.out.println(" "+a[i]);
	} 
}
public class GenericExample
{
	public static void main(String []args)
	{
		Array a1=new Array();
		String s[]={"rohit","ashu","anish","rinki","kirti"};
		Integer n[]=new Integer[]{5,3,25,3,54,32,66,256};
		a1.printArray(n);
		a1.printArray(s);
	}
}
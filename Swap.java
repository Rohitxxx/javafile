import java.util.Scanner;
 class SwapClass
{
	private int a,b;
	Scanner sc=new Scanner(System.in);
	public void getData()
	{
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	public void swapnum()
	{
		int temp;
		temp=a;
		a=b;
		b=temp;
	}
	public void show()
	{
		System.out.println("a="+a+" b="+b);
	}
}
public  class Swap
{
	public static void main(String []args)
	{
		SwapClass sp=new SwapClass();
		sp.getData();
		sp.show();
		sp.swapnum();
		sp.show();
	}
}
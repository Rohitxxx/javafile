class A extends Thread
{
	public void run()
	{
		for(int i=0;i<11;i++)
			System.out.println("thread A "+i);
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=0;i<11;i++)
			System.out.println("thread B "+i);
	}
}
public class ExampleThread2
{
	public static void main(String []args)
	{
		A o1=new A();
		B o2=new B();
		o1.start();
		o2.start();

	}
}
import java.lang.*;
class A implements Runnable
{
	public void run()
	{
		for(int i=0;i<11;i++)
			System.out.println("thread A "+i);
		
	}
}
class B implements Runnable
{
	public void run()
	{
		for(int i=0;i<11;i++)
			System.out.println("thread B"+i);
	}
}
public class ExampleThread
{
	public static void main(String []args)
	{
		Thread t1=new Thread(new A());
		Thread t2=new Thread(new B());
		t1.start();
		t2.start();
	}
}
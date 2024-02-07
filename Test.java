class A
{
	public A()
	{
		System.out.println("class A");
	}
}
class B extends A
{
	public B()
	{
		System.out.println("class B");
	}
}
public class Test
{
	public static void main(String []args)
	{
		B obj = new B();
	}
}
interface I1
{
	void f1();
}
interface I2
{
	void f2();
}
interface I3 extends I1,I2
{
	void f3();
}
class A implements I3
{
	public void f1()
	{
		System.out.println("I1 f1");
	}
	public void f2()
	{
		System.out.println("I2 f2");
	}
	public void f3()
	{
		System.out.println("I3 f3");
	}
}
public class InterfaceExample
{
	public static void main(String []args)
	{
		I1 obj=new A();
		obj.f1();
		obj.f2();
		obj.f3();
	}
}
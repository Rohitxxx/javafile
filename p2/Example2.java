class Person
{
	private int age;
	private String name;
	public void setAge(int a)
	{age=a;}
	public void setName(String n)
	{name=n;}
	public int getAge()
	{return(age);}
	public String getName()
	{return(name);}

}
class Student2 extends Person
{
	private int rollno;
	public void setRollno(int r)
	{
		rollno=r;
	}
	public int getRollno()
	{
		return(rollno);
	}
}
//emport Person;
//emport Student2;
public class Example2
{
	public static void main(String []agrs)
	{
		Student2 s1=new Student2();
		s1.setAge(19);
		s1.setName("Rohit");
		s1.setRollno(21);
		System.out.println("name:"+s1.getName());
		System.out.println("age:"+s1.getAge());
		System.out.println("rollno:"+s1.getRollno());
	}
}
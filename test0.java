public class test0
{
	public static void main(String []args)
	{
		int balance=1000;
		int withdrawl=1500;
		try
		{
			if(balance<withdrawl)
				throw new ArithmeticException("insufficient balance");
			balance=balance-withdrawl;
			System.out.println("transection succesfull");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("program continues...");
	}

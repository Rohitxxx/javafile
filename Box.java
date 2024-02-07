class Box
{
	private int l,b,h;
	public Box()
	{
		l=10;
		b=7;
		h=2;
	}
	public Box(int L,int B,int H)
	{
		l=L;
		b=B;
		h=H;
	}
	public void printVal()
	{
		System.out.print("l="+l);
		System.out.print("b="+b);
		System.out.print("h="+h);
	}
	public static void main(String []args)
	{
		Box b1=new Box();
		Box b2=new Box(12,8,3);
		b1.printVal();
		b2.printVal();
	}
}
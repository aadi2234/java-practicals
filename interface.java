interface Demo
{
	static final int a=5;
	public abstract void display();
}
class basic implements Demo
{
	public void display()
		{
			System.out.print("I am abstract class");
			System.out.println("\na="+a);
		}
	public static void main(String args[])
	{
		basic b=new basic();
		b.display();
	}
	
}

class Demo
{
	int rollno;
	String name;
	Demo(int r,String n)
	{
		this.rollno=r;
		this.name=n;
		System.out.println("Roll no="+rollno);
		System.out.println("Name="+name);
	}
	public static void main(String args[])
	{
		Demo d1=new Demo(1,"Rajesh");
		Demo d2=new Demo(2,"Ram");
	}
}

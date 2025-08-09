import java.util.Scanner;
class Fibo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("How many no. in Fibonacci series:");
		int no=sc.nextInt();
		int f1,f2=0,f3=1;
		for (int i=0;i<no;++i)
		{
			System.out.print(" "+f3+" ");	
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}
	}
}
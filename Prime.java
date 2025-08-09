import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int no=sc.nextInt();
		int flag=0;
		for(int i=2;i<no;++i)
		{
			if(no%i==0)
			{
			System.out.print(no+" is not a prime number");
			flag=1;
			break;
			}
		}
		if(flag==0)
		{
		System.out.print(no+" is a prime number");
		}

	}
}
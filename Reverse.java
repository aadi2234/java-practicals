import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int no=sc.nextInt();
		int remainder,result=0;
		while(no>0)
		{
			remainder=no%10;
			result=result*10+remainder;
			no=no/10;
		}
		System.out.print("Reversed number:"+result);

	}
}
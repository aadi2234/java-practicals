import java.util.Scanner;
class Bitwiseop
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a positive even number:-");
		int no=sc.nextInt();
		double result=no>>1;
		System.out.print("Division-"+result);
	}
}

import java.util.Scanner;
public class PosNeg
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int no=sc.nextInt();
		if(no>0)
			System.out.println(no+" is positive");
		else if(no<0)
			System.out.println(no+" is negative");
		else
			System.out.println(no+" is zero");
	}
}

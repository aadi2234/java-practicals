import java.util.Scanner;
public class Add
{
	 public static void main(String args[])
	 {
		Scanner sc=new Scanner(System.in);
  		 int a;
		 int b;
		 int c;
		 System.out.println("Enter number 1:");
		 a=sc.nextInt();
		 System.out.println("Enter number 2:");
		 b=sc.nextInt();
		 c=a+b;
		 System.out.println("\nAddition:-\n"+c);
	 }
}

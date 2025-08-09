import java.util.*;
class AF extends Exception
{
	AF(String s)
	{
		super(s);
	}
}
class Pass
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur password:-");
		String pass=sc.next();
		try
		{
			if(pass.equals("Adi2234"))
			{
				System.out.println("Password Matched...");
			}
			else
			{
				System.out.println("Password Not Matched...");
				System.out.println("Incorrect Password...");
				throw new AF("Authentication Failure");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			if(pass.equals("Adi2234"))
			{
				System.out.println("You inputted a correct Password..");
			}
			else
			{
				System.out.println("You inputted a incorrect Password..");
			}
		}
	}
}

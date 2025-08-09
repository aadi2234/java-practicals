import java.io.*;
public class Filecpy
{
	public static void main(String args[])
	{
	try{
		FileInputStream src=new FileInputStream("src.txt");
		FileOutputStream dest=new FileOutputStream("dest.txt");
		int i;
		while((i=src.read())!=-1)
		{
			dest.write(i);
		}
		System.out.println("File Data copied Successfully....");
		src.close();
		dest.close();
		}
		catch(IOException e)
		{
			System.out.println("Exception Occured...."+e.toString());
		}
		finally
		{
			System.out.println("File operations performed....");
		}
	}
}
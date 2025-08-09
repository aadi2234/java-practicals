import java.util.*;
import java.lang.*;
class NotMatchException extends NotMatchException
{
    String msg;
    NotMatchException(String msg)
    {
        super(msg);
    }
}
class A 
{
    public static void main(String args[])
    {
        System.out.println("Enter a String");
        Scanner sc= new Scanner(System.in);
        String p=sc.next();
        try {
            {
                if(p.equals("India"))
                {
                    System.out.println("You inputted correct String\nString is Matched");
                }
                else
                {
                    throw new NotMatchException("You inputted incorrect String\nString is not Matched");
                }
            }
        }
        catch(NotMatchException e)
        {
            System.out.println(e);
        }
    }
}
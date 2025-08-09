import java.util.Scanner;
class Greater
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers :");
		a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b&&a>c)
        {
            System.out.println(a+" is greater number");
        }
        else if(b>c&&b>a)
        {
            System.out.println(b+" is greater number");
        }
        else
        {
            System.out.println(c+" is greater number");
        }
    }
}
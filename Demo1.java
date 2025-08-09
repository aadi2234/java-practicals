import let_me_calculate.*;
import java.util.*;
class Demo1
{
    public static void main(String args[]) 
    {
        Calculator c=new Calculator();
        System.out.println("Enter 2 integers:-");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        c.add(a,b);
        c.sub(a,b);
        c.mul(a,b);
        c.div(a,b);
    }
}
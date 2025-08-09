import java.util.*;
import java.lang.*;
class Employee
{
    int age;
    String name;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age:-");
        age= sc.nextInt();
        System.out.print("Enter Name:-");
        name= sc.next();
    }
    void display()
    {
        System.out.println("Name-"+name+"\nAge="+age);
    }
}
interface Salary
{
    float basic_salary=19000.99f;
    void basic_sal();
}
public class Gross_Salary extends Employee implements Salary
{
    float ta,da,hra;
    public void basic_sal()
    {
        System.out.println("Basic Salary="+basic_salary);
    }
    void get_sal()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter TA:-");
        ta=sc.nextFloat();
        System.out.print("Enter DA:-");
        da=sc.nextFloat();
        System.out.print("Enter HRA:-");
        hra=sc.nextFloat();
    }
    void total_sal()
    {
        float total_sal=ta+da+hra+basic_salary;
        System.out.println("Total Salary="+total_sal);
    }
    public static void main(String args[]) 
    {
        Gross_Salary e= new Gross_Salary();
        System.out.println("Enter Employee Details-");
        e.accept();
        e.get_sal();
        System.out.println("Employee Details-");
        e.display();
        e.basic_sal();
        e.total_sal();
    }
}
import java.lang.*;
class Student
{
    int rollno;
    String name;
    Double per;
    Student()
    {
        rollno=10;
        name="Smita";
        per=93.2;
    }
    Student(int r, String s,Double p)
    {
        rollno=r;
        name=s;
        per=p;
    }
    void display()
    {
        System.out.println("Roll no:-"+rollno);
        System.out.println("Name:-"+name);
        System.out.println("Percentage:-"+per +"%");
    }
    public static void main(String args[])
    {
        Student S1=new Student();
        Student S2=new Student(19,"Ajay",87.44);
        System.out.println("Information of Student-1:");
        S1.display();
        System.out.println("Information of Student-2:");
        S2.display();
    }
}
class Student
{
  int RollNo;
  String Name;	
  double Per;
    Student() //
	{
	RollNo=15;
	Name="ABC";
	Per=82.42;
	}
	Student(int R,String n,double p) 
	{ 
	RollNo=R;
	Name=n;
	Per=p;
	}
	public void display()
	{
	System.out.println("Roll No-"+RollNo);
	System.out.println("Name-"+Name);
	System.out.println("Percentage-"+Per);
	}
	public static void main(String args[])
	{
	Student s1=new Student();
	s1.display();
	Student s2=new Student(19,"Shraddha",85.24);
	s2.display();
	}
}
   
   
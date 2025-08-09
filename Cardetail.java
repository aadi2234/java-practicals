import java.util.Scanner;
class car 
{
    Scanner sc=new Scanner(System.in);
 String car_type;
 public void getcar()
 {
 	System.out.println("Enter Car type:");
 	car_type=sc.next();
 }
 public void putcar()
 {
 	System.out.println("\nCar type:"+car_type);
 }
}
class brand extends car
{
	String brand_name;
	int speed;
	public void getbrand()
	{
		System.out.println("Enter Car Brand:");
		brand_name=sc.next();
		System.out.println("Enter Car MAX Speed:");
        speed=sc.nextInt();
	}
	public void putbrand()
	{
		System.out.println("\nCar Brand:"+brand_name);
		System.out.println("\nCar MAX Speed:"+speed);
	}
}
class model extends brand
{
	String model_name;
	int price;
	public void getmodel()
	{
		System.out.println("Enter Car Model:");
		model_name=sc.next();
		/*System.out.println("Enter Car Price:");
        price=sc.nextInt();*/
	}
	void putmodel()
	{
		System.out.println("\nCar Model:"+model_name);
		System.out.println("\nCar Price:"+price);
	}
}
class Cardetail
{
    public static void main (String args[])
    {
        model C=new model();
        System.out.println("Enter Information of Car:\n");
        C.getcar();
        C.getbrand();
	    C.getmodel();
	    System.out.println("\nInformation of Car:\n");
	    C.putcar();
	    C.putbrand();
	    C.putmodel();
    }
}

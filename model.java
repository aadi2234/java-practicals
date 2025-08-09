import java.util.Scanner;
class car 
{
    Scanner sc=new Scanner();
 String car_type;
 public void getcar()
 {
 	System.out.println("Enter Car type:");
 	car_type=sc.next();
 }
 void putcar()
 {
 	cout<<"\nCar type:"<<car_type;
 }
};
class brand:public car
{
	private:
	char brand_name[25];
	int speed;
	public:
	void getbrand()
	{
		fflush (stdin);
		cout<<"Enter Car Brand:";
		gets(brand_name);
		cout<<"Enter Car MAX Speed:"; cin>>speed;
	}
	void putbrand()
	{
		cout<<"\nCar Brand:"<<brand_name;
		cout<<"\nCar MAX Speed:"<<speed;
	}
};
class model:public brand
{
	private:
	char model_name[25];
	float price;
	public:
	void getmodel()
	{
		fflush (stdin);
		cout<<"Enter Car Model:";
		gets(model_name);
		cout<<"Enter Car Price:"; cin>>price;
	}
	void putmodel()
	{
		cout<<"\nCar Brand:"<<model_name;
		cout<<"\nCar MAX Speed:"<<price;
	}
};
int main()
{
	model C;
	cout<<"Enter Information of Car:\n";
	C.getcar();
	C.getbrand();
	C.getmodel();
	cout<<"\nInformation of Car:\n";
	C.putcar();
	C.putbrand();
	C.putmodel();
	return 0;
}
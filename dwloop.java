import java.lang.Math;
import java.util.Scanner;
class dwloop
{
	public static void main(String args[])
	{
        int no1,no2,ch;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("\tMenu");
            System.out.println("1] Minimum Value");
            System.out.println("2] Maximum Value");
            System.out.println("3] Square Root");
            System.out.println("4] Cube Root");
			System.out.println("5] Absolute Value");
			System.out.println("6] Power");
            System.out.println("7] Exit");
            System.out.println("Enter your Choice:");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
					System.out.print("Enter 2 numbers:");
					no1=sc.nextInt();
					no2=sc.nextInt();
                    System.out.println("Minimum Value="+Math.min(no1,no2));
                    break;
                case 2:
					System.out.print("Enter 2 numbers:");
					no1=sc.nextInt();
					no2=sc.nextInt();
					System.out.println("Maximum Value="+Math.max(no1,no2));
					break;
                case 3:
					System.out.print("Enter a number:");
					no1=sc.nextInt();
					System.out.println("Square root of "+no1+" ="+Math.sqrt(no1));
					break;
                case 4:
					System.out.print("Enter a number:");
					no1=sc.nextInt();
					System.out.println("Cube root of "+no1+" ="+Math.cbrt(no1));
					break;
                case 5:
					System.out.print("Enter a number:");
					no1=sc.nextInt();
					System.out.println("Absolute Number="+Math.abs(no1));
                    break;
				case 6:
					System.out.print("Enter 2 numbers(x,y):");
					no1=sc.nextInt();
					no2=sc.nextInt();
                    System.out.println("Power="+Math.pow(no1,no2));
                    break;
				case 7:
				break;
                default:
                    System.out.println("Invalid Choice...");
                    break;
            }
        }while(ch!=7);
    }
}

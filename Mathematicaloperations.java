import java.util.Scanner;
class Mathematicaloperations
{
    public static void main(String args[])
    {
        int no1,no2,sum,diff,prod,div,ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 2 numbers:");
        no1=sc.nextInt();
        no2=sc.nextInt();
        do{
            System.out.println("\tMenu");
            System.out.println("1] Addition");
            System.out.println("2] Subtraction");
            System.out.println("3] Multiplication");
            System.out.println("4] Division");
            System.out.println("5] Exit");
            System.out.println("Enter your Choice:");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    sum=no1+no2;
                    System.out.println("Addition="+sum);
                    break;
                case 2:
                    diff=no1-no2;
                    System.out.println("Subtraction="+diff);
                    break;
                case 3:
                    prod=no1*no2;
                    System.out.println("Multiplication="+prod);
                    break;
                case 4:
                    div=no1/no2;
                    System.out.println("Division="+div);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid Choice...");
                    break;
            }
        }while(ch!=5);
    }
}
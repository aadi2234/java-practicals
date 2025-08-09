import java.util.Scanner;
class Dayswitchcase
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter any character:");
		ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'A':System.out.println(ch+" is a vowel.\n");
                    break;
            case 'E':System.out.println(ch+" is a vowel.\n");
                    break;
            case 'I':System.out.println(ch+" is a vowel.\n");
                    break;
            case 'O':System.out.println(ch+" is a vowel.\n");
                    break;
            case 'U':System.out.println(ch+" is a vowel.\n");
                    break;
            default:System.out.println(ch+" is a constant.\n");
                    break;
        }
    }
}
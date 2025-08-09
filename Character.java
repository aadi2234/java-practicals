import java.util.Scanner;
import java.util.*;
class Character
{
    public static void main(String args[])
    {
        char ch;
        System.out.print("Enter a Character:");
        Scanner s=new Scanner(System.in);
        ch=s.next().charAt(0);
        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.println(ch+" is a vowel character...");
            break;
            default:
            System.out.println(ch+" is a consonant character...");
        }
    }
}
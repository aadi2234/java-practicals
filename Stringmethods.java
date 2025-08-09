import java.lang.*;
class Stringmethods
{
    public static void main(String args[])
    {
        String a="Aditya";
        String b="Vikas";
        System.out.println("Upper Case:"+a.toUpperCase());
        System.out.println("Lower Case:"+b.toLowerCase());
        System.out.println("Length:"+a.length());
        System.out.println("Character Search:"+b.charAt(3));
        System.out.println("Concatination:"+b.concat(a));
        System.out.println("Index Of Character:"+b.indexOf("s"));
        System.out.println("Equal Case:"+a.equals(b));
        System.out.println("Equal Ignore Case:"+a.equalsIgnoreCase(b));
        System.out.println("Start with:"+a.startsWith("N"));
        System.out.println("End with:"+a.endsWith("y"));
        System.out.println("Substring:"+a.substring(2,4));
    }
}
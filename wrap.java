import java.util.*;
class Wrap
{
	public static void main(String args[])
	{
System.out.println("Premitive to Object...");
int a=5;
Integer A=Integer.valueOf(a);
System.out.println(A);

byte b=8;
Byte B=new Byte(b);
System.out.println(B);

short c=3;
Short C=new Short(c);
System.out.println(C);

long d=56;
Long D=new Long(d);
System.out.println(D);

double e=43d;
Double E=new Double(e);
System.out.println(E);

float f=23.678f;
Float F=new Float(f);
System.out.println(F);

/*char g=x;
Character G=new Character(g);
System.out.println(G);

boolean h=T;
Boolean H=new Boolean(h);
System.out.println(H);*/
}
}
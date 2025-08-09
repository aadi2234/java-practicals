import java.lang.*;
import java.util.Scanner;

class WrapperClass {
    public static void main(String args[]) {
        // Autoboxing
        System.out.println("Primitive to Object");
        int a = 5;
        Integer sc = new Integer(a);
        System.out.println("Value of a-" + a);
        float b = 5.145f;
        Float s2 = new Float(b);
        System.out.println("Value of b-" + b);
        Double c = 5.1445445d;
        Double s3 = new Double(c);
        System.out.println("Value of c-" + c);
        byte d = 55;
        Byte s4 = new Byte(d);
        System.out.println("Value of d-" + d);
        short e = 544;
        Short s5 = Short.valueOf(e);
        System.out.println("Value of e-" + e);

        Long f = 554404l;
        Long s6 = new Long(f);
        System.out.println("Value of f-" + f);
        char g = 'A';
        // Character s7 = Character.valueOf(g);
        Character s7 = g;
        System.out.println("Value of g-" + g);

        boolean h = true;
        Boolean s8 = new Boolean(h);
        System.out.println("Value of h-" + h);
    }
}
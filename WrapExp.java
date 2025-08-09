import java.lang.*;
public class WrapExp
{
		public static void main(String[] args)
		{
			System.out.println("\n\tPRIMITIVE TO OBJECT");
			int a =5;
			Integer b=new Integer (a);
			System.out.println(b);
			
			short c =24;
			Short d=new Short(c);
			System.out.println(d);

			float e =24.45f;
			Float f=new Float(e);
			System.out.println(f);
			
			double g=44.8869d;
			Double h=new Double(d);
			System.out.println(h);
			
			char ab='M';
			Character ac=new Character(ab);
			System.out.println(ac);
			
			long l=6881;
			Long ln=new Long(l);
			System.out.println(ln);
			
			boolean bc=true;
			Boolean cc=new Boolean (bc);
			System.out.println(cc);
			
			byte bb=8;
			Byte nn=new Byte(bb);
			System.out.println(nn);
			
			
			
			
			System.out.println("\n\tOBJECT TO PRIMITIVE");
			int m;
			m=b.intValue();
			System.out.println(m);
			
			short n;
			n=d.shortValue();
			System.out.println(n);
			
			float p;
			p=f.floatValue();
			System.out.println(f);
			
			double dd;
			dd=h.doubleValue();
			System.out.println(dd);
			
			char oa;
			oa=ac.charValue();
			System.out.println(oa);
			
			long ob;
			ob=ln.longValue();
			System.out.println(ob);
			
			boolean oc;
			oc=cc.booleanValue();
			System.out.println(cc);
			
			byte od;
			od=nn.byteValue();
			System.out.println(od);	

		}
}

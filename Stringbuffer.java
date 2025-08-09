import java.lang.*;

class Stringbuffer {
	public static void main(String args[]) {
		StringBuffer S1 = new StringBuffer("Tendulkar");
		StringBuffer S2 = new StringBuffer("Sachin");
		StringBuffer S3 = new StringBuffer("Hello");
		System.out.println("Append String:-" + S1.append(S2));
		System.out.println("Reversed String:-" + S2.reverse());
		System.out.println("Length of String:-" + S1.length());
		S3.delete(1, 3);
		System.out.println("Delete from String:-" + S3);
		S3.replace(1, 3, "Java");
		System.out.println("Replaced String:-" + S3);
	}
}
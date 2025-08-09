import java.util.*;

public class Vectorpr {
   public static void main(String args[]) {
      Vector<String> vec = new Vector<String>(4);
      vec.add("Tiger");
      vec.add("Lion");
      vec.add("Dog");
      vec.add("Elephant");
      System.out.println("Size of vector is: " + vec.size());
      System.out.println("Default capacity of vector is: " + vec.capacity());
      System.out.println("Vector element is: " + vec);
      vec.addElement("Rat");
      vec.addElement("Cat");
      vec.addElement("Deer");
      System.out.println("Size of vector after adding new element: " + vec.size());
      System.out.println("Capacity after adding new element is: " + vec.capacity());
      System.out.println("Vectors elements are: " + vec);
      if (vec.contains("Lion")) {
         System.out.println("Lion is present at the index " + vec.indexOf("Lion"));
      } else {
         System.out.println("Lion is not present in the list.");
      }
      System.out.println("The first animal of the vector is = " + vec.firstElement());
      System.out.println("The last animal of the vector is = " + vec.lastElement());
   }
}

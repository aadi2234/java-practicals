import java.io.*;
public class Aa {
   public static void main(String[] args) 
   {
      byte[] bytes = {65,100,105,116,121,97}; 
      try
	  {
         FileOutputStream fileStream = new FileOutputStream("output.txt");
         fileStream.write(bytes);
         fileStream.close();
         System.out.println("Bytes written to file.");
      }
	  catch (IOException e) 
	  {
		System.out.println("Error writing to file: " + e.getMessage());
      }
   }
}

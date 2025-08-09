import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ab {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please specify a file name.");
            return;
        }
        
        String fileName = args[0];
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

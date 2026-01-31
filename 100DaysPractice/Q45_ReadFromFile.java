import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q45_ReadFromFile {
    public static void main(String[] args) {
        try {
            // Pass the path to the file as a parameter
            File myFile = new File("output.txt");
            Scanner reader = new Scanner(myFile);
            
            // Loop through the file line by line
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close(); // Close scanner
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found! Make sure it exists.");
            e.printStackTrace();
        }
    }
}
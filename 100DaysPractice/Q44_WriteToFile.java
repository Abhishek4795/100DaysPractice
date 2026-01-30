import java.io.FileWriter;
import java.io.IOException;

public class Q44_WriteToFile {
    public static void main(String[] args) {
        try {
            // Creating a FileWriter object to write to "output.txt"
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, this is my first file writing program in Java!");
            
            // Always close the writer when done
            writer.close();
            System.out.println("Successfully wrote to the file.");
            
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {
    public static void main(String[] args) {
        try{
          FileInputStream file =new FileInputStream("Greetings.txt");   
          Scanner scan =new Scanner(file);
          while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
          scan.close();
        }catch(FileNotFoundException exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}

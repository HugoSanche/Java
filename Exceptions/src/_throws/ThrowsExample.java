package _throws;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//throw - only one exception to catch
//throws - many exception to catch in this example FileNotFoundException, IOException


//throws keyword is used in method declarations to specify that the method may throw certain types of exceptions
//during its execution
public class ThrowsExample {

    public void readFiles(String name) throws FileNotFoundException, IOException {

        FileReader fileReader=new FileReader(name);

    }

    public static void main(String[] args) {
        ThrowsExample throwsExample=new ThrowsExample();
        try{
            throwsExample.readFiles("noexiste.txt");
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println(fileNotFoundException);
        }
        catch (IOException ioException){
            System.out.println(ioException);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

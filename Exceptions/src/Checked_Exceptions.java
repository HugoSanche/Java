import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked_Exceptions {
    public static void main(String[] args) throws FileNotFoundException{
        //you can use throws FileNotFoundException or implement try-catch

        readFile2("hugo.txt");


    }

    public static void readFile2(String fileName) throws FileNotFoundException {

        FileReader fileReader = new FileReader(fileName); //this is checked Exceptions if you not write try catch you don't make compile

    }
}

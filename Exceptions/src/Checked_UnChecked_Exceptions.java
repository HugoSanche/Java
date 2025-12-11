import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked_UnChecked_Exceptions {
    //Checked Exceptions.- "Compile time" Exceptions are IOExceptions,FileNotFoundExceptions, SQLException

    //Unchecked Exceptions are.- "Run time exceptions".- like NullPointerExceptions, numberfomatexception,IllegalArgumentException, IndexOutOfBoundsExceptions,ArithmeticException

    public static void main(String[] args) {
    //this generates Unchecked exceptions.- null pointer exceptions
    String string=null;
    printLength(string);

    //this generates Checked exceptions.-


    ///


    }
    public static void printLength(String string){
        int myString=string.length();
        System.out.println(myString);

        readFile("myfile.txt");
    }

    public static void readFile(String fileName){
        try {
            FileReader fileReader = new FileReader(fileName); //this is checked Exceptions if you not write try catch you don't make compile
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }


}

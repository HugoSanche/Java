import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Example_InputStreamReader {
    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);

        Scanner sc = new Scanner(System.in);

        System.out.println("I.S.R. - "+(char)isr.read());
        System.out.println("Scanner - " + sc.nextLine());
    }
}

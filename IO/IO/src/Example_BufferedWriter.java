import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Example_BufferedWriter {
    public static void main(String[] args)throws IOException {
        BufferedReader isr = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);

        System.out.println("B.R. - "+(char)isr.read());
        System.out.println("Scanner - " + sc.nextLine());
    }
}

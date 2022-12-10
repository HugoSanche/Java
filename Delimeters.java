import java.util.Scanner;

public class Delimeters {
    public static void main(String[] Args){
        Scanner scan= new Scanner(System.in);

        System.out.println("Introduce 2 integers en la misma linea");
        int num1= scan.nextInt();
        int num2=scan.nextInt();

        System.out.println("Introduce 2 valores con decimales en la misma linea");
        double decimal1=scan.nextDouble();
        double decimal2=scan.nextDouble();

        System.err.println("Introduce 2 textos en la misma linea");
        String texto1=scan.nextLine();
        String texto2=scan.nextLine();

        System.out.println("2 enteros "+num1+" "+num2);
        System.out.println("2 decimales "+decimal1+" "+decimal2);
        System.out.println("2 textos "+texto1+" "+texto2);

        //checa con nextLine ocupa toda una linea, quiere decir que puede guardar los valores
        //que tu pongas en la misma linea, ejemplo
        System.out.println("Introduce 2 enteros en la misma linea");
        String entero=scan.nextLine();
        System.out.println("Enteros "+entero);
    }
}

import java.util.Scanner;

public class SingUp {
    public static void main(String[] Args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Whats is your first name");
        String firstName=scanner.nextLine();

        System.out.println("Whats is your last name");
        String lastName=scanner.nextLine();

        System.out.println("How old are you?");
        int age=scanner.nextInt();
        
        System.out.println("Make a username");
         scanner.nextLine(); String username= scanner.nextLine();

        System.out.println("Whats city do you live in?");
        String city=scanner.nextLine();

        System.out.println("What country is that");
        String country=scanner.nextLine();

        System.out.println("Thank you for joining JavaGram!");
        System.out.println("\nHere is the information you entered:");
        System.out.println("\n\tFirst Name: "+firstName);    
        System.out.println("\n\tLast Name: "+lastName);
        System.out.println("\n\tUser Name: "+username);
        System.out.println("\n\tAge: "+age);
        System.out.println("\n\tCity: "+city);
        System.out.println("\n\tCountry: "+country);  
    }
}

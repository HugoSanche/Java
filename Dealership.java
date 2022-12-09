import java.util.*;
public class Dealership {
    public static void main(String[] Args ){
        
        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome to the Java DealerShip");
        System.out.println("* Select 'a' to buy a car");
        System.out.println("* Select 'b' to buy sell a car");
        String option =scanner.nextLine();

        switch(option){
            case "a": System.out.println("Your select the option "+option); break;
            case "b": System.out.println("Your select the option "+option); break;a
            default:System.out.println("Option invalid");
        }
        scanner.close();

    }
}

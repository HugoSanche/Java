import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class Dealership {
    public static void main(String[] Args ){
        
        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome to the Java DealerShip");
        System.out.println("* Select 'a' to buy a car");
        System.out.println("* Select 'b' to buy sell a car");
        String option =scanner.nextLine();

        switch(option){
            case "a": 
            
            System.out.println("Whats is your budget?");
            int budget=scanner.nextInt();
            if (budget>1000){
                System.out.println("Great!, a nissan Altima is available");
                
                scanner.nextLine();
                System.out.println("\n Do you have insurace? Write 'yes' or 'no'");
                String insurance=scanner.nextLine();

                System.out.println("\n Do you have license? Write 'yes' or 'no'");
                String licence=scanner.nextLine();
                System.out.println("\nWhats is your credit score?");
                int score=scanner.nextInt();
                if (insurance.equals("yes")&&licence.equals("yes")&&score>650){
                    System.out.println("Sold! Pleasure doing business with you");
                }else{
                    System.out.println("Sorry, you are not eligible");
                }
            } else{
                System.out.println("Sorry, we dont sell cars under 10,000");
            }
            break;

            case "b": 
            System.out.println("\nWhat is your car value at?");
            int value=scanner.nextInt();
            
            System.out.println("\nWhat is your selling price?");
            int price=scanner.nextInt();

            if (value>price && price<30000){
                System.out.println("\nWe will buy your car. Pleasure doing business with you!");
            }else{
                System.out.println("\nSorry, we dont interested");
            }
                break;
            default:System.out.println("Option invalid");
        }
        scanner.close();

    }
}

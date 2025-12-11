import java.util.Scanner;

public class ArgumentValidation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        User user = new User();
        System.out.println("We are setting up your user account.");

        System.out.print("Your username is currently " + user.getUsername() + ". Please update it here: ");
        String userName=scanner.nextLine();
        if (userName.isBlank()){
            System.out.println("Sorry, invalid username");
        }else{
            user.setUsername(userName);
        }
        //user.setUsername(user.getUsername());
        
        System.out.print("Your age is currently " + user.getAge() + ". Please update it here: ");
        if (scanner.hasNextInt()){
            int age=scanner.nextInt();
            if (age <0){
                System.out.println("Age cannot be negative");
            }
            else{
                user.setAge(age);
            }
        }

        // user.setAge(scanner.nextInt());
        scanner.close();
    }     
}
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] Args){
        Scanner scan=new Scanner(System.in);

        System.out.println(">>Let's play Rock Paper Scissors.");
        System.out.println("\n>>When I say 'shoot', Choose: rock, paper, or scissors.");
        System.out.println("\n>>Are you ready? Write 'yes' if you are");
        String ready =scan.nextLine();
            if (ready.equals("yes")){
                System.out.println("Great! ");
                System.out.println("\nrock - paper - scissors, shoot!");
                String choiceUser=scan.nextLine();

                if (!choiceUser.equals("rock") && !choiceUser.equals("paper") && !choiceUser.equals("scissors")){
                    System.out.println("\n Invalid option");
                    System.exit(0);
                }

                String choiceComputer=computerChoice();
                String result =result(choiceComputer, choiceUser);
                result(choiceUser,choiceComputer,result);
            }else{
                System.out.println("Darn, some other time...");
            }

    }
    public static String computerChoice(){
        int choice=(int)Math.random()*3;
        choice+=1;
        if (choice==0){
            return "rock";
        }else if (choice==1){
            return "paper";
        }else if (choice==2){
            return "scissors";
        }
        else{
            return "no valid";
        }
    }
    public static String result(String yourChoice, String computerChoice){
        String result="";
        if (yourChoice.equals("rock") && computerChoice.equals("scissors")){
             result="You win";
        }
        else if (yourChoice.equals("paper") && computerChoice.equals("rock")){
            result="You win";
        }
        else if (yourChoice.equals("scissors") && computerChoice.equals("paper")){
            result= "You win";
        }

        else if (computerChoice.equals("rock") && yourChoice.equals("scissors")){
            result="You lose";
        }
        else if (computerChoice.equals("paper") && yourChoice.equals("rock")){
            result="You lose";
        }
        else if (computerChoice.equals("scissors") && yourChoice.equals("paper")){
            result="You lose";
        }
        else if (computerChoice.equals(yourChoice)){
            result="It's a tie";
        }
        else{
            result= "INVALID CHOICE";
            System.exit(0);
        }
        return result;
    }
    
    public static void result( String yourChoice,String computerChice,String result){
        System.out.println("\nYour choice "+yourChoice);
        System.out.println("The computer Choice "+computerChice);
        System.out.println(result);
    }
}

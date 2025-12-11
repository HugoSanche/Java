
import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Pokerito. Type anything when you're ready."); 
        scan.nextLine();  
        System.out.println("It's like Poker, but a lot simpler.\n");      

        System.out.println(" • There are two players, you and the computer.");
        System.out.println(" • The dealer will give each player one card.");
        System.out.println(" • Then, the dealer will draw five cards (the river)");
        System.out.println(" • The player with the most river matches wins!");
        System.out.println(" • If the matches are equal, everyone's a winner!\n");

        System.out.println(" • Ready? Type anything if you are.");
        scan.nextLine();

        System.out.println("Here's your card:");
        String userCard= ramdomCard();
        System.out.println(userCard);

        System.out.println("Here's the computer's card:");
        String computerCard= ramdomCard();
        System.out.println(computerCard);

        int yourMatches = 0;
        int computerMatches =0;
        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");

        for (int i=1; i<=5; i++){
            scan.nextLine();  
            System.out.println("Card "+i);
            String card=ramdomCard();
            System.out.println(card+"\n\n");
            if (userCard.equals(card)){
                yourMatches++;
            }
            if (computerCard.equals(card)){
                computerMatches++;
            }

        }
       System.out.println("Your number of matches: "+yourMatches);
       System.out.println("Computer number of matches: "+computerMatches);
       
       if (yourMatches>computerMatches){
         System.out.println("You win!.");   
       }else if(computerMatches>yourMatches){
        System.out.println("The computer wins!");
       }
       else if(yourMatches==computerMatches){
        System.out.println("everyone wins!");
       }
         scan.close();
    }

    /**
     * task 1 .- Get a number Random 1 to 13
     * task 2.- Draw a card depens of number random
     * @return String
     */
    public static String ramdomCard(){
        //Random rand=new Random();
        //int randomNum=rand.nextInt((13- 1)+1)+1; //get random mumber between 1 and 13
        
        double randomNumber=Math.random()*13;   // 0 - 12.999
        randomNumber+=1;  // 1 - 13.9999
        
        int randomInt=(int)randomNumber;  // 1 - 13
        
        String card="";
        switch (randomInt){
            case 1:
                               card=    "   _____\n"+
                                        "  |A _  |\n"+ 
                                        "  | ( ) |\n"+
                                        "  |(_'_)|\n"+
                                        "  |  |  |\n"+
                                        "  |____V|\n";
            break;
            
            case 2:
                                 card=  "   ______\n"+              
                                        "  |2    |\n"+ 
                                        "  |  o  |\n"+
                                        "  |     |\n"+
                                        "  |  o  |\n"+
                                        "  |____Z|\n";

            break;
            case 3:
                                 card=  "   _____\n" +
                                        "  |3    |\n"+
                                        "  | o o |\n"+
                                        "  |     |\n"+
                                        "  |  o  |\n"+
                                        "  |____E|\n";
            
            break;

            case 4:
                                  card= "   _____\n" +
                                        "  |4    |\n"+
                                        "  | o o |\n"+
                                        "  |     |\n"+
                                        "  | o o |\n"+
                                        "  |____h|\n";
            break;
            case 5:
                                 card=  "   _____ \n" +
                                        "  |5    |\n" +
                                        "  | o o |\n" +
                                        "  |    o  |\n" +
                                        "  | o o |\n" +
                                        "  |____S|\n";
            break;

            case 6:
                                 card= "   _____ \n" +
                                        "  |6    |\n" +
                                        "  | o o |\n" +
                                        "  | o o |\n" +
                                        "  | o o |\n" +
                                        "  |____6|\n";

            break;
            case 7:
                                  card="   _____ \n" +
                                        "  |7    |\n" +
                                        "  | o o |\n" +
                                        "  |o o o|\n" +
                                        "  | o o |\n" +
                                        "  |____7|\n";
            break;

            case 8:
                                  card="   _____ \n" +
                                        "  |8    |\n" +
                                        "  |o o o|\n" +
                                        "  | o o |\n" +
                                        "  |o o o|\n" +
                                        "  |____8|\n";

            break;

            case 9:
                                  card= "   _____ \n" +
                                        "  |9    |\n" +
                                        "  |o o o|\n" +
                                        "  |o o o|\n" +
                                        "  |o o o|\n" +
                                        "  |____9|\n";

            break;

            case 10:
                                   card="   _____ \n" +
                                        "  |10  o|\n" +
                                        "  |o o o|\n" +
                                        "  |o o o|\n" +
                                        "  |o o o|\n" +
                                        "  |___10|\n";

            break;
            
            case 11:
                                  card= "   ______\n" +
                                        "  |J  ww|\n"+ 
                                        "  | o {)|\n"+ 
                                        "  |o o% |\n"+ 
                                        "  | | % |\n"+ 
                                        "  |__%%[|\n";
            break;
            
            case 12:
                                  card="   ______\n" +
                                        "  |Q  ww|\n"+ 
                                        "  | o {(|\n"+ 
                                        "  |o o%%|\n"+ 
                                        "  | |%%%|\n"+ 
                                        "  |_%%%O|\n";
            break;

            case 13:
                                  card= "   ______\n" +
                                        "  |K  WW|\n"+ 
                                        "  | o {)|\n"+ 
                                        "  |o o%%|\n"+ 
                                        "  | |%%%|\n"+ 
                                        "  |_%%%>|\n";

            break;
            default: card="This should never get called";
        }
        return card;
    }
}

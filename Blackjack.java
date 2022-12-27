import java.util.Scanner;

public class Blackjack {

    public static Scanner scan=new Scanner(System.in);


    public static void main(String[] args) {
        

        int total=0;
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");

         //Task 3 – Wait for the user to press enter.
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();
       
       
        //Task 4 – Get two random cards.
        //       – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>

        int userCard1=drawRandomCard();
        int userCard2=drawRandomCard();
        //System.out.println("\n "+userCard1+" "+userCard2);
        total=Math.min(userCard1, 10)+Math.min(userCard2,10);

        System.out.println("\n You get a \n" + cardString(userCard1) + "\n and a \n" + cardString(userCard2));

        //Task 5 – Print the sum of your hand value.
        //       – print: your total is: <hand value>
        System.out.println("\nyour total is: "+(total));
        
        //Task 6 – Get two random cards for the dealer.
        //       – Print: The dealer shows \n" + <first card> + "\nand has a card facing down \n" + <facedown card>
        //       – Print: \nThe dealer's total is hidden
        int dealerCard1=drawRandomCard();
        int dealerCard2=drawRandomCard();
       System.out.println("\nThe dealer shows\n" + cardString(dealerCard1) + "\nand has a card facing down\n"+faceDown());
       int totalDealer=Math.min(dealerCard1, 10)+Math.min(dealerCard2, 10);
       System.out.println("\nThe dealer's total is hidden");

        //Task 8 – Keep asking the player to hit or stay (while loop).
        //       1. Every time the player hits
        //             – draw a new card.
        //             – calculate their new total.
        //             – print: (new line) You get a (new line) <show new card>.
        //             - print: your new total is <total>

        //       2. Once the player stays, break the loop. 
        String option ="";
        while (true){
            option =hitOrStay();
            if (option.equalsIgnoreCase("stay"))
            {
                break;
            }
            int card =drawRandomCard();
            total+=Math.min(card, 10);
            System.out.println("\n You get a\n"+cardString(card));
            System.out.println("your new total is "+total);
            if (total>21){
                System.out.println("Bust! Player loses");
                System.exit(0);
            }

        }
          //For tasks 9 to 13, see the article: Blackjack Part II. 
        System.out.println("\n Dealer's turn");
        System.out.println("\nThe dealer cards are\n" + cardString(dealerCard1) + "\nand has a card facing down\n"+ cardString(dealerCard2));
        int dealerCard=drawRandomCard();
        System.out.println("\nDealer gets a\n" + cardString(dealerCard));
        totalDealer+=Math.min(dealerCard, 10);
        System.out.println("Dealer's total is "+totalDealer);
        while (totalDealer<17){
            int newCard=drawRandomCard();
            System.out.println("\nDealer gets a\n" + cardString(newCard));
            totalDealer+=Math.min(newCard, 10);
            System.out.println("Dealer's total is "+totalDealer);
        }

        if (totalDealer>21){
            System.out.println("Bust! Dealer loses");
            System.exit(0);
        }
        if (total>totalDealer){
            System.out.println("Player wins!");
            System.exit(0);
        }else {
            System.out.println("Dealer wins!");
            System.exit(0);
        }

         scan.close();

    }

    /** Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */
    public static int drawRandomCard(){
        double randomNumber=Math.random()*13;   // 0 - 12.999
        randomNumber+=1;  // 1 - 13.9999
        int randomInt=(int)randomNumber;  // 1 - 13
        return randomInt;
    }

 /** Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */
    public static String cardString(int cardNumber){
        //int getRandomNumber =drawRandomCard();
        String card="";
        switch (cardNumber){
            case 1:
                               card=    "   _____\n"+
                                        "  |A _  |\n"+ 
                                        "  | ( ) |\n"+
                                        "  |(_'_)|\n"+
                                        "  |  |  |\n"+
                                        "  |____V|\n";
            break;
            
            case 2:
                                 card=  "   _____\n"+              
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
                                 card=  "   _____ \n" +
                                        "  |6    |\n" +
                                        "  | o o |\n" +
                                        "  | o o |\n" +
                                        "  | o o |\n" +
                                        "  |____6|\n";

            break;
            case 7:
                                  card= "   _____\n" +
                                        "  |7    |\n" +
                                        "  | o o |\n" +
                                        "  |o o o|\n" +
                                        "  | o o |\n" +
                                        "  |____7|\n";
            break;

            case 8:
                                  card= "   _____ \n" +
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
                                  card= "   _____\n" +
                                        "  |J  ww|\n"+ 
                                        "  | o {)|\n"+ 
                                        "  |o o% |\n"+ 
                                        "  | | % |\n"+ 
                                        "  |__%%[|\n";
            break;
            
            case 12:
                                  card= "   _____\n" +
                                        "  |Q  ww|\n"+ 
                                        "  | o {(|\n"+ 
                                        "  |o o%%|\n"+ 
                                        "  | |%%%|\n"+ 
                                        "  |_%%%O|\n";
            break;

            case 13:
                                  card= "   _____\n" +
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


    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */
    
    public static String hitOrStay(){
       System.out.println("Choose hit or stay"); 
        String option=scan.nextLine();
        while(!(option.equalsIgnoreCase("hit") || option.equalsIgnoreCase("stay"))){
            System.out.println("Please write 'hit' or 'stay'");
            option=scan.nextLine();
        }   
        return option;
    }
}

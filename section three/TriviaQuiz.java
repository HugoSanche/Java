import java.util.Scanner;

class TriviaQuiz{
    public static void main (String[] Args){
        Scanner scan=new Scanner(System.in);
        int score=0;
        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\n\ta) China \n\tb) Ireland \n\tc) Brazil \n\td) Italy");
        String olypics=scan.nextLine();
        
        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\n\ta) Venus \n\tb) Saturn \n\tc) Mercury \n\td) Mars");
        String planetHottest= scan.nextLine();

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\n\ta) O \n\tb) A \n\tc) B \n\td) AB-Negative");
        String bloodType=scan.nextLine();

        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\n\ta) Ron Weasley \n\tb) Hermione Granger \n\tc) Draco Malfoy");
        String friendHarry=scan.nextLine();

        if (olypics.equals("c")){
            score+=5;
            
        } 
        if(planetHottest.equals("a")){
            score+=5;
        }
         if(bloodType.equals("d")){
            score+=5;
        }
         if (friendHarry.equals("a")){
            score+=5;
        }
        System.out.println("Your final score is: "+score+"/20");

        if (score>=15){
            System.out.println("\nWow, you know your stuff!");
        }else if (score<15 || score>=5){
            System.out.println("Not bad!");
        }else{
            System.out.println("better luck next time.");
        }
    }
}
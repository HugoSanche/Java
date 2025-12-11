import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BlockBuster {
    static Store store=new Store();
   public static void main(String[] args) {
        // Movie[] movies=new Movie[]{
        //     new Movie("The Shawshank Redemption", "BlueRay", 9.2),
        //     new Movie("The Godfather", "BlueRay", 9.1),
        //     new Movie("The Godfather: Part II", "DVD", 9.0),
        //     new Movie("The Dark Knight", "BlueRay", 9.0),
        //     new Movie("Schindler's List", "DVD", 8.9),
        //     new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
        //     new Movie("Pulp Fiction", "DVD", 8.8),
        //     new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        // };
        // System.out.println("****Movies******");
        // for (int i=0; i<movies.length; i++){
        //     store.setMovie(i,movies[i]);
        // }
        String movies="";
        try{
        loadMovies(movies);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
       printStore();
       userInput();
    }
    public static void userInput(){
        Scanner scanner=new Scanner(System.in);
        String status="continue";
        while (status.equals("continue")){
            //System.out.print("\nPlease choose an integer between 0 - 9: ");
            int choice=(promptForChoice(scanner));

            Movie movie=store.getMovie(choice);

            //System.out.print("Set a new rating for "+movie.getName()+": ");
            double rating =promptForRating(scanner, movie.getName());
            movie.setRating(rating);
            store.setMovie(choice, movie);
            printStore();
            System.out.print("To edit another rating, type: 'continue';");
            status=scanner.next();
        }
        scanner.close();
    }
    public static void printStore(){
        System.out.println("********************************MOVIE STORE*******************************");
        System.out.print(store);
}
    public static void loadMovies(String fileName)throws FileNotFoundException
    {
        FileInputStream file =new FileInputStream("movies.txt");
        Scanner scan =new Scanner(file);
        while (scan.hasNextLine()) {
            String line=scan.nextLine();
            String[] words=line.split("--");
            store.addMovie(new Movie(words[0],words[1],Double.parseDouble(words[2])));

        }
        scan.close();
    }
    public static boolean incorrectChoice(int choice){
        return choice<0 || choice >9;
    }
    public static boolean incorrectRating(double rating) {
        return rating <0 || rating >10;
    }
    public static int promptForChoice(Scanner scanner) {
        while (true) {
  
            System.out.print("\nPlease choose an integer between 0 - 9: ");
            // 1. Anticipate the user not entering an integer.
            if (scanner.hasNextInt()){
                int choice=scanner.nextInt();
                // 2. Anticipate the choice being incorrect. <--------------
                if (incorrectChoice(choice))continue;
                   return choice;
            }
            else {
                scanner.next();
                continue;
            }
        }
        
    }
    public static double promptForRating(Scanner scanner, String name) {
        while (true) {
            System.out.print("\nSet a new rating for " + name + ": ");
           
            if (scanner.hasNextDouble()){
                    // 1. Anticipate the user not entering a double.
            double rating = scanner.nextDouble(); 
                    if (incorrectRating(rating))continue;
                        // 2. Anticipate the rating being incorrect. <----------
                   return rating;   
                   
            }
            else{
                scanner.next();
                continue;
            }                                                                                                                                                                                  
         }
    }
}
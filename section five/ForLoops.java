import java.util.Scanner;

class ForLoops {
    public static void main(String[] Args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Hi Bart, I can write lines for you");
        System.out.println("What do you want me to write ");  
        String linesOfBart =scan.nextLine();
        
        linesOfBart(linesOfBart);

      System.out.print("Incoming counters: ");
        for (int i=0; i<=4; i++) {
            System.out.println(i + " ");
        }
        }
        
    
    public static void linesOfBart(String lines){
        for (int i=1; i<=100; i++){
            System.out.println(i+". "+lines);
        }
    }
}
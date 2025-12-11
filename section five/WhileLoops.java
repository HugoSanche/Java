public class WhileLoops {
    public static void main(String[] Args){
        double choice =0.01;
        double guess=0.99;

        //When i use for loop ?
        //when you know how many times a code needs to run

        //When i use while loop ?
        //to run code as long as something is true
        while(guess>choice){
            guess=Math.random();
            System.out.println(guess);
        }
    }
}

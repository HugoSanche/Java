import java.util.Scanner;

class CounterTool{
    public static void main(String[] Args){

        Scanner scan=new Scanner(System.in);

        System.out.println("I hear you like to count by threes");
        System.out.println("Jimmy: It depends ");
        System.out.println("Oh, ok..");

        System.out.println("Pick a number to count by ");
        int by=scan.nextInt();

        System.out.println("Pick a number to start counting from");
        int from=scan.nextInt();

        System.out.println("Pick a number to count to ");
        int to=scan.nextInt();

        print(by, from, to);
    }
    public static void print(int by, int from, int to){
        for (int i=from; i<=to; i+=by ){
            System.out.println(i);
        }
    }
}
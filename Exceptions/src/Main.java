import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int x=7;
//        int y=0;
//        System.out.println(divideCheck(x,y));
//        System.out.println(divideWithTry(x,y));
//        System.out.println(x/y);
        int x=getIntEAFP();
        System.out.println(" int x "+x);
    }
    private static int getIntLBYL(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a integer");
        if(scan.hasNextInt()){
            return scan.nextInt();
        }
        return 0;
    }
    private static int getIntEAFP(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a Integer");
        try{
           return scan.nextInt();
        }catch(InputMismatchException e){
            return 0;
        }
    }

    private static int getInt(){
        Scanner scan =new Scanner(System.in);
        return scan.nextInt();
    }
    private static int divideCheck(int x, int y){
        if (y!=0){
            return x/y;
        }
        else {
            return 0;
        }
    }
    private static int divideWithTry(int x, int y){
        try{
            return x/y;
        }catch(ArithmeticException e){
            return 0;
        }
    }
    private static int divide(int x, int y){
        return x/y;
    }
}
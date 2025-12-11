public class Fibonacci {
    public static void main(String[] args) {
        int number=10;
        sumDigits(number);
        //System.out.println("Sum of digits of number "+number+" is " +res);
    }

    public static void sumDigits(int number) {
        int prev=0; int actual=1;
        int temp=0;
        System.out.print("Fibonacci numbers: "+prev+", "+actual);
        for (int i=2;i<number;i++ ){
            temp=actual;
            actual=actual+prev;
            System.out.print(", "+actual);
            prev=temp;
        }

    }
}

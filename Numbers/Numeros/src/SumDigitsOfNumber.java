public class SumDigitsOfNumber {
    public static void main(String[] args) {
        int number=1234;
        int res=sumDigits(number);
        System.out.println("Sum of digits of number "+number+" is " +res);
    }

    public static int sumDigits(int number) {
        int sum=0;
         while(number>=1){
             sum=sum+number%10;
             number=number/10;
         }
     return sum;
    }
}

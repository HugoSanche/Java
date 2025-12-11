public class PrimeNumber {

    public static void main(String[] args) {
        int number=2;

        boolean result=isPrimeNumber(number);
        System.out.println(result);
    }

    public static boolean isPrimeNumber(int number){
        if (number<=1 ){
            return false;
        }
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

}

public class SumOfDigits {
    int sum;
    int mod;
    public static void main(String[] args) {
        SumOfDigits sum=new SumOfDigits();
        int resultado=sum.sumOfDigits(436);
        System.out.println(resultado);
    }
    public int sumOfDigits(int n){
        if (n==0){
            return 0;
        }
        //mod=n%10;
      //  sum=sum+mod+sumOfDigits(n/10);
        return n%10+sumOfDigits(n/10);
    }
}
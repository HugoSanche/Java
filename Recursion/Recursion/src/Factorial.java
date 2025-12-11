public class Factorial {
    public static void main(String[] args) {
        int result;
        int number=4;
        result=factorial(number);
        System.out.println("El factorial de "+number+" es; "+result);
    }
    public static int factorial(int n){
        int res=0;
        if (n!=0){
            res=n*factorial(n-1);
            return res;
        }
        else{
            //el return es para que empieze a multiplicar desde el numero 1 a N
            return 2;
        }
    }
}

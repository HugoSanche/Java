public class Main {
    public static void main(String[] args) {
        var result=factorial(4);
        System.out.println(result);

        System.out.println("Test Fibonacci");
        var fibonacci=fibonacci(5);
        System.out.println(fibonacci);
    }
    public static int factorial(int n){
        if(n<1){
            return -1;
        }
        if (n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int fibonacci(int n){
        if (n<0){
            return -1;
        }
        if (n==0 || n==1){
            return n;
        }
        return fibonacci(n-1)+factorial(n-2);
    }
}





















public class Fibonacci2 {

    public static void main(String[] args) {
        int n=3;
        int result;

        result=fib(n);
        System.out.println(result);
    }
    public static int fib(int n) {
        if (n<0){
            return -1;
        }
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}

public class Factorial {
    public static void main(String[] args) {
        int number=5;

        int result=calculateFactorial(number);
        System.out.println(result);
    }

    public static int calculateFactorial(int numbers){
        if (numbers==0){
            return 0;
        }
        int res=0;
        for(int i=1;i<=numbers;i++){
            res=numbers*i;
        }
        return res;
    }

}

//How to find the sum of digits of a positive integer number using recursion?
//10->  10/10=1 and Remainder=0
//54->  54/10=5 and Remainder=4
//112-> 112/10=11 and Remainder=2
//       11/10=1 and Remainder=1

//      175/10=17  and Reminder=5
//      17/10=1 and reminder=7
//
public class Questions {
    public int sumofDigits(int n){
        int total=0;
        int sumOf=0;
        int mod=0;
        System.out.println(n);
        if(n<0 || n==0) {
            return 0;
        }
        mod=(n%10);
        sumOf=sumofDigits(n/10);
         total=mod+sumOf;
        return total;
    }


    public int power(int base, int exp){
       // int resul=0;
    //    int power=0;

        if (exp<0){
            return -1;
        }
        if(exp==0){
            return 1;
        }
      //  System.out.println(exp);
      //  power=power(base, exp-1);
      //  resul=base*power;

        return base*power(base,exp-1);
    }



        //how to find GCD (Greatest Common Divisor) of two numbers using recursion?
        //Euclidean algorithm
        //gcd(48,18)
        //Step 1 : 48/18= 2 remainder 12
        //Step 2 : 18/12= 1 remainder 6
        //Step 3 : 12/6=  2 remainder 0
    public int gcd(int a, int b){
        System.out.println("A "+a+"B "+b);
        int mod=0;
        if(a<0 || b<0){
            return -1;
        }

        if (b==0){
            return a;
        }
        mod=a%b;
        return gcd(b,mod);
    }
}






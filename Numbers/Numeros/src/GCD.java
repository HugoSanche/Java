public class GCD {
    public static void main(String[] args) {
        int num1=30; int num2=18;
        int res=getGCD(num1,num2);
        System.out.println("GCP of numbers "+num1+" and "+num2+" is = "+res);

    }
    public static int getGCD(int num1, int num2){
        for (int i=num2; i>=1; i-- ){
            if(num1%i==0 && num2%i==0){
                return i;
            }
        }
        return 1;
    }
}

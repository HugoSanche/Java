public class Power {
    int mul=1;
    public static void main(String[] args) {
        int base=5;
        int exponent=3;

      Power power=new Power();
        int res=power.calculatePower(base,exponent);
        System.out.println(res);
    }
    public  int calculatePower(int base, int exponent){
        if (exponent<1){
            return -1;
        }
        if(exponent==0){
            return 1;
        }
     //base*calculatePower(base,exponent-1);
        return base*calculatePower(base,exponent-1);
    }
}

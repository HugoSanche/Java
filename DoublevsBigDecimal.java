import java.math.BigDecimal;

public class DoublevsBigDecimal{
    public static void main(String[] Args){
        double x=0.1;
        System.out.println(x);
        double y=0.2;
        double z=x+y;
        //check the result 0.30000000000000004, this is no correcto in big datas
        //its fail in big institucions like bank etc
        System.out.println(z);

        System.out.println("\n*********");

        /**************BIG DECIMAL******** */
        BigDecimal a= new BigDecimal("0.1");
        BigDecimal b= new BigDecimal("0.2");

        BigDecimal c=a.add(b);
        //check the result 0.3 its correct
        System.out.println(c);

    }
}
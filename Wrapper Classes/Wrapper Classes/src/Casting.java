public class Casting {
    public static void main(String[] args) {

        //explicit casting
        long number1=12541;
        int number2=(int)number1;
        System.out.println(number2);

        //implicit casting
        //truncation of value

        int bigValue=280;
        byte small=(byte) bigValue;
        System.out.println("SMALL "+small);
    }
}

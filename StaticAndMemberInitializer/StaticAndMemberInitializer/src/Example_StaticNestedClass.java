public class Example_StaticNestedClass {
    private int total=10;
    private static int total2=10;

    public  static class Calculator{
        public static int square(int x){
            // error
            //  System.out.println(total);
            return x*x;
        }
        public static  int cube(int x){
            System.out.println(total2);
            return x*x*x;
        }
    }
    public static void main(String[] args) {

        int resultado=Example_StaticNestedClass.Calculator.square(10);
        System.out.println(resultado);

    }
}

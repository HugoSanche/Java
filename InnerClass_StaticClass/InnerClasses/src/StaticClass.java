public class StaticClass {
    private int A_UNO;
    private final int A_DOS=0;
    public int A_TRES=3;

    public void method_A(){
        int X_1;
        final int X_2=0;
        int X_3;
    }

    public static class ExampleStaticClass{
        private int B_UNO;
        private final int B_DOS=2;
        public int B_TRES;

        public void method_B(){
            int Y_1;
            final int Y_2=0;
            int Y_3=3;

            //class padre
            //Desde una clase Static NO puedes acceder a los valores de la clase padre
          //  A_UNO=A_UNO+3;
          //  System.out.println(A_DOS);
           // A_TRES=3;

            //Asi puedes acceder a los valores de la clase padre
            StaticClass staticClass= new StaticClass();
            staticClass.A_UNO= staticClass.A_UNO+3;
            System.out.println(staticClass.A_DOS);
            staticClass.A_TRES=3;

            //This class
            B_UNO=B_UNO+4;
            System.out.println(B_DOS);
            B_TRES=5;
        }
    }
    ExampleStaticClass exampleStaticClass=new ExampleStaticClass();
}

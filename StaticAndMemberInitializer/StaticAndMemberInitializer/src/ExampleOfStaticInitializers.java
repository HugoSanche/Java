public class ExampleOfStaticInitializers {
    int memberVariable;
    static int staticVariable;

    //static initializer
    static {
        //memberVarible=5; //compile error
        staticVariable=10;
        System.out.println("Example of static initializer");
    }

    public ExampleOfStaticInitializers(int memberVariable) {
        this.memberVariable = memberVariable;
        System.out.println("Soy un constructor");
    }
}

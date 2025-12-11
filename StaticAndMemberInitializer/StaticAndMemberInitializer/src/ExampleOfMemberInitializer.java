public class ExampleOfMemberInitializer {
    int memberVariable;
    static int staticVariable;

    //member initializer
    {
        staticVariable=5;
        memberVariable=10;
        System.out.println("Example of member initialize");
    }

    public ExampleOfMemberInitializer(int memberVariable) {
        this.memberVariable = memberVariable;
        System.out.println("Soy un constructor");
    }
}

package eager_registry;

public class Client {
    public static void main(String[] args) {
        EagerRegistry eagerRegistry=EagerRegistry.getInstance();
        EagerRegistry eagerRegistry1=EagerRegistry.getInstance();

        //error
       // EagerRegistry eagerRegistry2=new EagerRegistry();

        System.out.println(eagerRegistry);
        System.out.println(eagerRegistry1);
        System.out.println(eagerRegistry==eagerRegistry1);


    }
}

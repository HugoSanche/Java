package practicando;

public class Client {
    public static void main(String[] args) {
        EagerRegistry eagerRegistry=EagerRegistry.getInstance();
        System.out.println(eagerRegistry);
    }
}

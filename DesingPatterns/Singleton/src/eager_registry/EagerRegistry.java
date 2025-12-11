package eager_registry;


//esta se implementa al iniciar (siempre se crea), las otras se crean hasta que alguien las invoke
public class EagerRegistry {
    private EagerRegistry(){

    }
    private static final EagerRegistry INSTANCE =new EagerRegistry();

    public static EagerRegistry getInstance(){
        return INSTANCE;
    }
}

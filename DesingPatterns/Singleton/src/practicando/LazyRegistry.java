package practicando;

public class LazyRegistry {
    private LazyRegistry(){

    }
    private static class InnerLazy{
         static LazyRegistry INSTANCE=new LazyRegistry();
    }
    public LazyRegistry getInstance(){
        return InnerLazy.INSTANCE;
    }
}

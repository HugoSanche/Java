package practicando;

public class LazyResitrysincronized {
    private LazyResitrysincronized(){

    }
    private static volatile LazyResitrysincronized INSTANCE;

    public static LazyResitrysincronized getInstance(){
        if(INSTANCE==null){
            synchronized (LazyResitrysincronized.class){
                if(INSTANCE==null){
                    return INSTANCE=new LazyResitrysincronized();
                }
            }
        }
        return INSTANCE;
    }
}

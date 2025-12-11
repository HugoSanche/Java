package initializationholder;

//Singleton pattern using initialization holder class. This ensures that, we have a lazy initialization
//without worrying about synchronization
public class LazyRegistryIODH {

    //ojo es privado el constructor por lo tanto no se puede isntanciar la clase LazyRegistryIODH
    private LazyRegistryIODH(){

    }

    //dado que esta inner class es privada no se podra acceder desde afuera para poderla instanciar
    private static class RegistryHolder{
        static LazyRegistryIODH INSTANCE=new LazyRegistryIODH();
    }
    public static LazyRegistryIODH getInstance(){
        return RegistryHolder.INSTANCE;
    }
}









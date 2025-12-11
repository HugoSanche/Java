package lazyregisterwithdcl;

public class Client {
    public static void main(String[] args) {
        LazyRegistryWithDCL lazyRegistryWithDCL=LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL lazyRegistryWithDCL1=LazyRegistryWithDCL.getInstance();

        //error
      //  LazyRegistryWithDCL lazyRegistryWithDCL2=new LazyRegistryWithDCL();

        System.out.println(lazyRegistryWithDCL);
        //System.out.println(lazyRegistryWithDCL2);
        System.out.println(lazyRegistryWithDCL==lazyRegistryWithDCL1);
    }
}

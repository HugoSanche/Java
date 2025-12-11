public class TestInitializer {
    public static void main(String[] args) {

        //Checa como el static initializer solamente se inicia una sola vez
        //obviamente le contructor se inicia tres veces
        ExampleOfStaticInitializers exampleOfStaticInitializers1 =new ExampleOfStaticInitializers(1);
        ExampleOfStaticInitializers exampleOfStaticInitializers2 =new ExampleOfStaticInitializers(2);
        ExampleOfStaticInitializers exampleOfStaticInitializers3 =new ExampleOfStaticInitializers(3);

        System.out.println();
        System.out.println("*******************************************");
        System.out.println();


        ExampleOfMemberInitializer exampleOfMemberInitializer =new ExampleOfMemberInitializer(1);
        ExampleOfMemberInitializer exampleOfMemberInitializer1 =new ExampleOfMemberInitializer(1);
        ExampleOfMemberInitializer exampleOfMemberInitializer2 =new ExampleOfMemberInitializer(1);


    }


}

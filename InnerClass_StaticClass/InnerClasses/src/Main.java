public class Main {
    public static void main(String[] args) {

        InnerClass innerClass=new InnerClass();

        //InnerClass.InsideOtherClass test= new InsideOtherClass();


        StaticClass.ExampleStaticClass exampleStaticClass=new StaticClass.ExampleStaticClass();
        exampleStaticClass.method_B();

        //error
        //InnerClass.InsideOtherClass insideOtherClass=InnerClass().New InsideOtherClass();

        //CHECA como hacer referencia a la clase que esta dentro de la clase padre.
        InnerClass innerClass1=new InnerClass();
        InnerClass.InsideOtherClass insideOtherClass=innerClass1.new InsideOtherClass();//RECUERDALO



    }
}
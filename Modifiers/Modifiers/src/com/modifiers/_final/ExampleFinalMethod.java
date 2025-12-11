package com.modifiers._final;

public class ExampleFinalMethod {

   final void  finalMethod(){
       System.out.println("Soy un metodo final");
    }
    public void otherExample(final int finalVariable){
       int test=10;
       int resultado=0;
       //finalVariable=5;error
       resultado=resultado+finalVariable;
        System.out.println(resultado);
    }

}

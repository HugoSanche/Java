package com.modifiers._final;

public class TestMethodFinal extends ExampleFinalMethod{


    //No se puede overrride sobre un metodo final
    /*
    @Override
    final void  finalMethod(){
        System.out.println("Soy un metodo final");
    }
*/

    @Override
    public void otherExample( int finalVariable){
        int test=10;
        int resultado=0;
        //finalVariable=5;error
        resultado=resultado+finalVariable;
        System.out.println(resultado);
    }
}

package com.modifiers._static;

public class StaticModifierExamples {
     static int staticVariable;
    private int instanceVariable;



    public static int staticMethod(){

        //error
        //static int x=5;

        int y=5;

        staticVariable=5;
        //Error
        //instanceVariable=5

    return y;
    }

    public void  noStaticMethod(){
        staticVariable=10;
        instanceVariable=15;

    }

}

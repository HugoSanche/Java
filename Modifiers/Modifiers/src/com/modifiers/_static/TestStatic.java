package com.modifiers._static;

public class TestStatic {
    public static void main(String[] args) {
        Cricketer cricketer=new Cricketer();

        Cricketer cricketer1=new Cricketer();
        Cricketer cricketer2=new Cricketer();
        Cricketer cricketer3=new Cricketer();

        System.out.println(Cricketer.getCount());

        StaticModifierExamples example=new StaticModifierExamples();
        example.noStaticMethod();


        StaticModifierExamples.staticMethod();
        StaticModifierExamples.staticVariable=5;



    }

}

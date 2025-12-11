package com.modifiers.defaultpackage.access;

public class TestClassInSamePackage {

    public static void main(String[] args) {
        ExampleOfClass exampleOfClass =new ExampleOfClass();

        //Can access a public
        exampleOfClass.publicVariable=5;
        exampleOfClass.publicMethod();


        //Can access a protected
        exampleOfClass.protectedVariable=15;
        exampleOfClass.protectedMethod();

        //Can access a default
        exampleOfClass.defaultVariable=10;
        exampleOfClass.defaultMethod();

        //Cannot access a private
        //exampleOfClass.privateVariable;
        //exampleOfClass.privateMethod();


    }

}

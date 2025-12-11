package com.modifiers.defaultpackage.access.different;

import com.modifiers.defaultpackage.access.ExampleOfClass;

public class TestClassInDifferentPackage {
    public static void main(String[] args) {
        ExampleOfClass exampleOfClass =new ExampleOfClass();

        exampleOfClass.publicMethod();
        exampleOfClass.publicVariable=50;


        //Cannot access a protected
        //exampleOfClass.protectedVariable=15;
        //exampleOfClass.protectedMethod();

        //Cannot access a default
        //exampleOfClass.defaultVariable=10;
        //exampleOfClass.defaultMethod();

        //Cannot access a private
        //exampleOfClass.privateVariable;
        //exampleOfClass.privateMethod();
    }
}

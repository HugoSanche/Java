package com.modifiers.defaultpackage.access.different;

import com.modifiers.defaultpackage.access.ExampleOfClass;

public class SubClassOtherPackage extends ExampleOfClass {
    void testMethod(){
        publicVariable=100;
        publicMethod();

        protectedVariable=150;
        protectedMethod();


        //Cannot access a protected
        //defaultVariable=200;
        //defaultMethod();

        //Cannot access a private
        //privateVariable;
        //privateMethod();
    }

}

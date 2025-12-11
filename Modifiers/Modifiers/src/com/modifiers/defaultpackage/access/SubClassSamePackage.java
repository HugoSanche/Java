package com.modifiers.defaultpackage.access;

public class SubClassSamePackage extends ExampleOfClass{


        void testMethod(){
                publicVariable=100;
                publicMethod();

                protectedVariable=150;
                protectedMethod();

                defaultVariable=200;
                defaultMethod();

                //Cannot access a private
                //privateVariable;
                //privateMethod();
        }


}

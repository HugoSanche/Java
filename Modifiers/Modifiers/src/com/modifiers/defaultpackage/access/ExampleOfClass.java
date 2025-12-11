package com.modifiers.defaultpackage.access;

public class ExampleOfClass {
    public int publicVariable;
           int defaultVariable;
    protected int protectedVariable;
    private int privateVariable;

    public void publicMethod(){
        System.out.println("Soy un method publico");
    }
     void defaultMethod(){
        System.out.println("Soy un method default");
    }
    protected void protectedMethod(){
        System.out.println("Soy un method protected");
    }
    private void privateMethod(){
        System.out.println("Soy un method privado");
    }


}

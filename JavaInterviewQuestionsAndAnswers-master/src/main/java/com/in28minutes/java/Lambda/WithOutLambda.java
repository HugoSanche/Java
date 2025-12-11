package com.in28minutes.java.Lambda;

public class WithOutLambda implements MyFunction{
    @Override
    public void sayHello() {
        System.out.println("Felices Fiestas");
    }

    public static void main(String[] args) {
        WithOutLambda withOutLambda=new WithOutLambda();
        withOutLambda.sayHello();
    }
}

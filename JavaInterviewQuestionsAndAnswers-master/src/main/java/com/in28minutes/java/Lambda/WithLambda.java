package com.in28minutes.java.Lambda;

public class WithLambda {
    public static void main(String[] args) {
        MyFunction myFunction=()->{
            System.out.println("Felices Fiestas");
        };
        myFunction.sayHello();
    }
}

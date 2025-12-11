package com.in28minutes.java.generics;

public class Example {

    public <T> boolean compare(T value1, T value2){
        if (value1==value2){
            return true;
        }
        return  false;
    }

    public static void main(String[] args) {
        Example example= new Example();
        boolean result=example.compare(5,5);
        System.out.println("Comparando Enteros:"+ result);

        result=example.compare("uno", "dos");
        System.out.println("Comparando Strings: "+result);

    }
}

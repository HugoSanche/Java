package com.in28minutes.java.generics;

public class ClasesGenericas <T>{

    //checa como el metodo ya no tiene declarado <T> al inicio
    public boolean compare(T value1, T value2){
        if (value1==value2){
            return true;
        }
        return  false;
    }

    public static void main(String[] args) {
        ClasesGenericas<Integer> clasesGenericas=new ClasesGenericas<>();

        boolean result=clasesGenericas.compare(1,2);
        System.out.println(result);


        result= clasesGenericas.compare(2,2);
        System.out.println(result);
    }
}

package com.in28minutes.java.string;

public class Funciones {
    public static void main(String[] args) {
        String str =" Hugo Baltazar Sanchez";
        System.out.println(str);

        //quita espacios en blanco
        System.out.println(str.trim());

        //pasa a un arreglo
        String[]arrayString=str.split(" ");
        for(String value: arrayString){
            System.out.println(value);
        }

        //leer caracter por caracter
        for(char c: str.toCharArray()){
            System.out.println(c);
        }

        //reemplaza
        String newString=str.replace("Hugo","Valeria");
        System.out.println(newString);


    }

}

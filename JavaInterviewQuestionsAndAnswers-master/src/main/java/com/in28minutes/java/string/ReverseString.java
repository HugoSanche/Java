package com.in28minutes.java.string;

public class ReverseString {
    public static void main(String[] args) {
        String str="Hugo Baltazar";
        printReverse(str);
    }
    public  static void printReverse(String str){
        if(str==null ){
            throw new IllegalArgumentException("El string es null");
        }

        if(str.isEmpty() ){
            throw new IllegalArgumentException("El string esta vacio");
        }
        int len=str.length();
        for(int i=len-1; i>=0; i--){
            System.out.println(str.charAt(i));
        }
    }
}

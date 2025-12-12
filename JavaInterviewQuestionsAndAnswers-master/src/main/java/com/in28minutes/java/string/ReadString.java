package com.in28minutes.java.string;

public class ReadString {
    public static void main(String[] args) {
        String str="Hugo Baltazar";

        readString(str.toString());

    }
    public  static void readString(String str){
        if(str==null ){
            throw new IllegalArgumentException("El string esta nullo");
        }

        if(str.isEmpty() ){
            throw new IllegalArgumentException("El string esta vacio");
        }
//        for(int i=0; i<str.length(); i++){
//            char c=str.charAt(i);
//            System.out.println(c);
//        }

        for(char c: str.toCharArray()){
            System.out.println(c);
        }
    }
}

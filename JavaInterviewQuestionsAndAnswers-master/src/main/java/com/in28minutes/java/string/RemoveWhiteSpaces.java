package com.in28minutes.java.string;

public final class RemoveWhiteSpaces {
    private RemoveWhiteSpaces(){}
    public static void main(String[] args) {
        String str ="Guillermo Hugo Baltazar Sanchez";
        String result=removeWhiteSpaces(str);
        System.out.println(result);
    }

    public static String  removeWhiteSpaces(String str){
        if(str==null ){
            throw new IllegalArgumentException("El string es null o vacio");
        }
       StringBuilder result=new StringBuilder(str.length());
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(!Character.isWhitespace(c)){
                result.append(c);
            }
        }
        return result.toString();
    }
}

package com.in28minutes.java.string;

public final class CountVowels {
    private CountVowels(){}
    public static void main(String[] args) {
        String str ="Guillermo Hugo Baltazar Sanchez";
        int result=countVowels4(str);
        System.out.println(result);
    }

    public static int  countVowels(String str){
        if(str==null || str.isEmpty()){
            throw new IllegalArgumentException("El string es null");
        }
        String withOutVowels=str.replaceAll("[^aeiouAEIOU]","");
        System.out.println(withOutVowels);
        return withOutVowels.length();
    }

    public static int  countVowels2(String str){
        if(str==null ){
            throw new IllegalArgumentException("El string es null");
        }
        int coutVowel=0;
        for(char c: str.toCharArray()){
            if("aeiouAEIOU".contains(String.valueOf(c))){
                coutVowel++;
            }
        }

        return coutVowel;
    }

    public static int  countVowels3(String str){
        if(str==null ){
            throw new IllegalArgumentException("El string es null");
        }
       final String VOWELS="aeiouAEIOU";

        int vowelCount=0;
        for(char c: str.toCharArray()){
            if(VOWELS.indexOf(c)!=-1){
                vowelCount++;
            }
        }

        return vowelCount;
    }
    public static int  countVowels4(String str){
        if(str==null ){
            throw new IllegalArgumentException("El string es null");
        }

        int vowelCount=0;
        for(char c: str.toCharArray()){
            if(isVowel(c)){
                vowelCount++;
            }
        }

        return vowelCount;
    }
    public static boolean isVowel(char c){
        if ( c=='a' || c=='e' || c=='i' || c=='o' || c=='u'
                || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ){
            return true;
        }
        return false;
    }
}

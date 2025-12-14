package com.in28minutes.java.string;

public final class  LongestWord {
    private LongestWord(){}
    public static void main(String[] args) {
        String str ="Guillermo Hugo Baltazar Sanchez";
        String result=findLongestWord(str);
        System.out.println(result);
    }

    public static String  findLongestWord(String str){
        if(str==null || str.trim().isEmpty() ){
            throw new IllegalArgumentException("El string es null o vacio");
        }

        String []arrayStr=str.split(" ");
        String longestWord=arrayStr[0];
      for(String word: arrayStr){
          if (word.length()>longestWord.length()){
              longestWord=word;
          }
      }
        return longestWord;
    }
}

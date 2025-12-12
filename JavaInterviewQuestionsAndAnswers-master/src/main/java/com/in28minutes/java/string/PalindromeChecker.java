package com.in28minutes.java.string;

public final class PalindromeChecker {
    private PalindromeChecker(){}
    public static void main(String[] args) {
        String str="abbab";
        boolean result=palindromeChecker(str);
        System.out.println(result);
    }
    public  static boolean palindromeChecker(String str){
        if(str==null || str.isEmpty() ){
            throw new IllegalArgumentException("El string es null o vacio");
        }
        //String reversed=new StringBuilder(str).reverse().toString();
        //return str.equals(reversed);

        int left=0;
        int right=str.length()-1;

        while(left<=right){
            if (str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}

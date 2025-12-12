package com.in28minutes.java.arrays;

import java.util.Arrays;

public final class CopyAndSorted {
    private CopyAndSorted(){}
    public static void main(String[] args) {

        int array1[]={1,5,3,8,9};
        int array2[]={2,4,6,7,10};

        int result[]=copyAndSorted(array1,array2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] copyAndSorted(int[] array1, int[] array2){
        if (array1==null || array2==null){
            throw new IllegalArgumentException("Los arreglos estan vacios");
        }
        int len1=array1.length;
        int len2=array2.length;

        int[] mergeArray=new int[len1+len2];

        for(int i=0; i<len1;i++){
          mergeArray[i]=array1[i];
        }
        for(int i=0; i<len2;i++){
            mergeArray[i+len1]=array2[i];
        }
        Arrays.sort(mergeArray);
        return mergeArray;
    }
}

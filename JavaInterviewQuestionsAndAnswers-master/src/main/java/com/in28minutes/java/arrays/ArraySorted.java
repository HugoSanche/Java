package com.in28minutes.java.arrays;

public final class ArraySorted {

    private ArraySorted(){}
    public static void main(String[] args) {
        int array[]={1,2,3,4,6,5};

        boolean result=isSorted(array);
        System.out.println(result);
    }
    public static boolean isSorted(int[] array){
        if (array==null){
            throw new IllegalArgumentException("El array esta vacio");
        }
        if (array.length<2){
            return true;
        }
        for(int i=0; i<array.length-1;i++){
            if(array[i]>array[i+1]){
              return false;
            }
        }
        return true;
    }

}

package com.in28minutes.java.arrays;

public final class ArrayLength {

    private ArrayLength(){}
    public static void main(String[] args) {
    int array[] ={3,4,7,6,8,1};

    int result=findMin(array);
        System.out.println(result);
    }
    public static int findMin(int[] array){

        if (array ==null || array.length==0){
            throw new IllegalArgumentException("Illegal Argument");
        }

        int min=array[0];
        for(int num: array){
            if (num<min){
             min=num;
            }
        }
        return  min;
    }
}

package com.in28minutes.java.arrays;

import java.util.Arrays;

public final class RemoveElemente {
    private RemoveElemente(){}
    public static void main(String[] args) {
        int input[] ={9,4,7,6,8,3,4};
        int target=4;
        int[] result=removeElement(input, target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] removeElement(int[] input, int target){
        if(input==null ){
            throw new IllegalArgumentException("El arreglo esta vacio");
        }

        int index=0;
        for (int element : input) {
            if (element != target) {
                input[index++] = element;
            }
        }
       return Arrays.copyOf(input, index);
        }
    }

